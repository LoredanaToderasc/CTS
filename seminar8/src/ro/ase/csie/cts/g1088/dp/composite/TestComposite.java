package ro.ase.csie.cts.g1088.dp.composite;

public class TestComposite {

	public static void main(String[] args) {
		
		UnitateAbstractaJoc grup1 = new GrupCaractere();
		UnitateAbstractaJoc grup2 = new GrupCaractere();
		
		grup1.adaugaCarcater(new CaracterNPC("Soldat", 100));
		grup1.adaugaCarcater(new CaracterNPC("Soldat", 100));
		
		grup2.adaugaCarcater(new CaracterNPC("Soldat", 100));
		grup2.adaugaCarcater(new CaracterNPC("Tanc", 300));

		UnitateAbstractaJoc grupNivel = new GrupCaractere();
		grupNivel.adaugaCarcater(new CaracterNPC("Level Boss", 500));
		grupNivel.adaugaCarcater(grup1);
		grupNivel.adaugaCarcater(grup2);
		
		grupNivel.atacaJucator(200);
		grupNivel.seRetrage();
	}

}
