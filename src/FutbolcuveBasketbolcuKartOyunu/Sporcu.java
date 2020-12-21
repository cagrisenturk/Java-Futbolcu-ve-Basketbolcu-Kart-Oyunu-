package FutbolcuveBasketbolcuKartOyunu;



public abstract class Sporcu {
	
	private String sporcuIsim;
	private String  sporcuTakim;
	
	public Sporcu(String sporcuIsim, String sporcuTakim) {
		
		this.sporcuIsim = sporcuIsim;
		this.sporcuTakim = sporcuTakim;
	}
	
	public String getSporcuIsim() {
		return sporcuIsim;
	}
	public void setSporcuIsim(String sporcuIsim) {
		this.sporcuIsim = sporcuIsim;
	}
	public String getSporcuTakim() {
		return sporcuTakim;
	}
	public void setSporcuTakim(String sporcuTakim) {
		this.sporcuTakim = sporcuTakim;
	}
	
	abstract void sporcuPuaniGoster() ;
	
}
