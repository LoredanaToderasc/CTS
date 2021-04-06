package tema2_codul_final;

public enum TipCont {
	STANDARD(0),BUGET(1),PREMIUM(2),SUPER_PREMIUM(3);
	private final int cod;

	TipCont(int cod) {
		this.cod = cod;
	}
	
	public int getCod() {
		return this.cod;
	}
}
