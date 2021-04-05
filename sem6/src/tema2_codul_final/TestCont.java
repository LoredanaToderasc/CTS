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
		
		
	}
}
