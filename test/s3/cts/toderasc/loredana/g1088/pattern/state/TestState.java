package cts.toderasc.loredana.g1088.pattern.state;

public class TestState {

	public static void main(String[] args) {
		
		 Cerere cerere = new Cerere(9);
		 cerere.confirmare();
		 cerere.verificare();		

		 Cerere cerere1 = new Cerere(10);
		 cerere1.confirmare();
		 cerere1.verificare();
	}

}
