package cts.toderasc.loredana.g1088.pattern.state;

public class Cerere implements ICerereStudent{

	int nrZile;
	ICerereStudent stare = null;

	public Cerere(int nrZile) {
		//super();
		this.nrZile = nrZile;
	}

	@Override
	public void confirmare() {
		new CerereConfirmata(nrZile);
		
	}

	@Override
	public void verificare() {
		new CerereVerificata(nrZile);
		if(this.nrZile < 10) {
			avizareDecanat();
		}
		else {
			respingere();
		}
	}

	@Override
	public void avizareDecanat() {
		new CerereAvizata(nrZile);
		
	}

	@Override
	public void respingere() {
		new CerereRespinsa(nrZile);
	}
	
	public ICerereStudent arataStarea() {
		return this.stare;
	}

	
}
