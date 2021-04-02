package tema2_codul_final;

public class Cont {
	private double valoare_imprumut;
	private double rataDobanda;
	private int perioada;
	private int cod_cont;
	private TipCont tip_cont;

	private static final float comisionBroker = 0.0125f;
	private static final int zileAn = 365;

	private Cont() {

	}

	public Cont(
			double valoare_imprumut, 
			double rataDobanda, 
			int perioada, 
			int cod_cont, 
			TipCont tip_cont) {
		super();
		this.valoare_imprumut = valoare_imprumut;
		this.rataDobanda = rataDobanda;
		this.perioada = perioada;
		this.cod_cont = cod_cont;
		this.tip_cont = tip_cont;
	}

	public double imprumut() {
		System.out.println("Valoarea imprumutului este " + this.valoare_imprumut);
		return valoare_imprumut;
	}

	public double getRata() {
		System.out.println("Rata dobanzii este " + rataDobanda);
		return this.rataDobanda;
	}

	// metoda obligatorie - lead-ul a cerut aceasta metoda in toate clasele
	public double getRataLunara() {
		return valoare_imprumut * rataDobanda;
	}

	public void setValoareImprumut(double valoare) throws ExceptieValoareImprumutInvalida {
		if(valoare<0)
			throw new ExceptieValoareImprumutInvalida();
		else
		{
			valoare_imprumut = valoare;
		}
	}

	public String afisareImprumut() {
		return "Imprumut: " + this.valoare_imprumut + " ; Rata dobanda: " + this.rataDobanda + " ; " + "Perioada:"
				+ perioada + " ; Tipul de cont: " + tip_cont + ";";
	}

	public void print() {
		int vb = 10;
		System.out.println("Asta este un cont!");
	}

	public static double calculeazaComisionTotal(Cont[] conturi) {
		double comisionTotal = 0.0;
		Cont cont;
		for (int i = 0; i < conturi.length; i++) {
			cont = conturi[i];
//			if (cont.tip_cont == TipCont.PREMIUM || cont.tip_cont == TipCont.SUPER_PREMIUM)
//				comisionTotal += comisionBroker
//						* (cont.valoare_imprumut * Math.pow(cont.rataDobanda, (cont.perioada / zileAn))
//								- cont.valoare_imprumut); // dobanda-principala
			comisionTotal += (cont.tip_cont != TipCont.PREMIUM || cont.tip_cont != TipCont.SUPER_PREMIUM) ? 0
					: (comisionBroker * (cont.valoare_imprumut * Math.pow(cont.rataDobanda, (cont.perioada / zileAn))
							- cont.valoare_imprumut));
		}
		return comisionTotal;
	}

//	public Cont(double valoare, double rata, int tip_cont) throws Exception {
//		if (valoare < 0)
//			throw new Exception();
//		else {
//			valoare_imprumut = valoare;
//		}
//		this.rataDobanda = rata;
//		this.tip_cont = tip_cont;
//	}
}
