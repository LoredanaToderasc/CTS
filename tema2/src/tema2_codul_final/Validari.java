package tema2_codul_final;

public class Validari implements InterfataValidari {

	@Override
	public void validareValoare(double valoare_imprumut) throws ExceptieValoareImprumutInvalida {
		if (valoare_imprumut <= 0) {
			throw new ExceptieValoareImprumutInvalida();
		}
	}

	@Override
	public void validareRata(double rata_dobanda) throws ExceptieRataInvalida {
		if (rata_dobanda < 0) {
			throw new ExceptieRataInvalida();
		}
	}

	@Override
	public void validarePerioada(int perioada) throws ExceptiePerioadaInvalida {
		if (perioada <= 1) {
			throw new ExceptiePerioadaInvalida();
		}
	}

}
