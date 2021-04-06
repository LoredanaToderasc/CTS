package tema2_codul_final;

public interface InterfataValidari {
	public void validareValoare(double valoare_imprumut) throws ExceptieValoareImprumutInvalida;
	public void validareRata(double rata_dobanda) throws ExceptieRataInvalida;
	public void validarePerioada(int perioada) throws ExceptiePerioadaInvalida;
}
