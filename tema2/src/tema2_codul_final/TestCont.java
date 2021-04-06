package tema2_codul_final;

import java.util.ArrayList;

public class TestCont {

	public static ArrayList<Object> conturi = new ArrayList<>();
	
	public void startUp() {
		InterfataValidari validari = new Validari();
		conturi.add(validari);
	}
	
	public static void main(String[] args) {
		
		Cont cont= new Cont(30000, 0.5, 5, 2, TipCont.PREMIUM);
		Cont cont1= new Cont(2900.50, 0.8, 2, 1, TipCont.BUGET);
		
		System.out.println("Valoarea imprumutului este " + cont.getImprumut());
		System.out.println("Rata dobanzii este " + cont.getRata());
		
		try {
			cont.setValoareImprumut(1520.5);
		} catch (ExceptieValoareImprumutInvalida e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Valoarea imprumutului dupa modificare este " + cont.getImprumut());
		System.out.println("Rata lunara este " + cont.getRataLunara());
		System.out.println(cont.afisareImprumut());
		cont.print();
		
		
	}
}
