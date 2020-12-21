package FutbolcuveBasketbolcuKartOyunu;



public class Futbolcu extends Sporcu {

	private int penalt�;
	private int serbestVuru�;
	private int kar��Kar��ya;
	private String futbolcuAd�;
	private String futbolcuTak�m;
	private boolean kartKullan�ld�M�;
	public Futbolcu(String sporcuIsim, String sporcuTakim, int penalt�, int serbestVuru�, int kar��Kar��ya) {
		super(sporcuIsim, sporcuTakim);
		this.penalt� = penalt�;
		this.serbestVuru� = serbestVuru�;
		this.kar��Kar��ya = kar��Kar��ya;
		this.futbolcuAd� = super.getSporcuIsim();
		this.futbolcuTak�m = super.getSporcuTakim();
		this.kartKullan�ld�M� = false;
	}
	
	@Override
	void sporcuPuaniGoster() {
		System.out.println("Penalt�s�= "+getPenalt�());
		System.out.println("Serbest Vuru�= "+getSerbestVuru�());
		System.out.println("Kar�� Kar��ya= "+getKar��Kar��ya());
	}






	public int getPenalt�() {
		return penalt�;
	}
	public void setPenalt�(int penalt�) {
		this.penalt� = penalt�;
	}
	public int getSerbestVuru�() {
		return serbestVuru�;
	}
	public void setSerbestVuru�(int serbestVuru�) {
		this.serbestVuru� = serbestVuru�;
	}
	public int getKar��Kar��ya() {
		return kar��Kar��ya;
	}
	public void setKar��Kar��ya(int kar��Kar��ya) {
		this.kar��Kar��ya = kar��Kar��ya;
	}
	public String getFutbolcuAd�() {
		return futbolcuAd�;
	}
	public void setFutbolcuAd�(String futbolcuAd�) {
		this.futbolcuAd� = futbolcuAd�;
	}
	public String getFutbolcuTak�m() {
		return futbolcuTak�m;
	}
	public void setFutbolcuTak�m(String futbolcuTak�m) {
		this.futbolcuTak�m = futbolcuTak�m;
	}
	public boolean getKartKullan�ld�M�() {
		return kartKullan�ld�M�;
	}
	public void setKartKullan�ld�M�(boolean kartKullan�ld�M�) {
		this.kartKullan�ld�M� = kartKullan�ld�M�;
	}








	
	
}
