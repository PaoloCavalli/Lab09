package it.polito.tdp.borders.model;

public class Border {

	private String stato1;
	private String stato2;
	
	/**
	 * @param stato1
	 * @param stato2
	 */
	public Border(String stato1, String stato2) {
		super();
		this.stato1 = stato1;
		this.stato2 = stato2;
	}

	
	public String getStato1() {
		return stato1;
	}

	public void setStato1(String stato1) {
		this.stato1 = stato1;
	}

	public String getStato2() {
		return stato2;
	}

	public void setStato2(String stato2) {
		this.stato2 = stato2;
	}
	
	
	
}
