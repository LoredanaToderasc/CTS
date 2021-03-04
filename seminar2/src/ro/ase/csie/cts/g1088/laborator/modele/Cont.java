package ro.ase.csie.cts.g1088.laborator.modele;

public abstract class Cont {
	public abstract double getBalanta();
	public abstract void alimenteaza(Double valoare);  //Double sau Object
	public abstract void extrage(Double valoare);
	public abstract void transfer(Cont destinatie, Double valoare);
}
