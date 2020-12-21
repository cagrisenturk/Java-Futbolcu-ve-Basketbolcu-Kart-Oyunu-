package FutbolcuveBasketbolcuKartOyunu;

public class Basketbolcu extends Sporcu {
	private int ikilik;
	private int ��l�k;
	private int serbestAt��;
	private String basketbolcuAd�;
	private String basketbolcuTak�m�;
	private boolean kartKullan�ld�M�;
	public Basketbolcu(String sporcuIsim, String sporcuTakim, int ikilik, int ��l�k, int serbestAt��) {
		super(sporcuIsim, sporcuTakim);
		this.ikilik = ikilik;
		this.��l�k = ��l�k;
		this.serbestAt�� = serbestAt��;
		this.basketbolcuAd� = super.getSporcuIsim();
		this.basketbolcuTak�m� = super.getSporcuTakim();
		this.kartKullan�ld�M� = false;
	}
	
	@Override
	void sporcuPuaniGoster() {
		System.out.println("�kilik= "+getIkilik());
		System.out.println("��l�k= "+get��l�k());
		System.out.println("Serbest At��= "+getSerbestAt��());
	}

	public int getIkilik() {
		return ikilik;
	}
	public void setIkilik(int ikilik) {
		this.ikilik = ikilik;
	}
	public int get��l�k() {
		return ��l�k;
	}
	public void set��l�k(int ��l�k) {
		this.��l�k = ��l�k;
	}
	public int getSerbestAt��() {
		return serbestAt��;
	}
	public void setSerbestAt��(int serbestAt��) {
		this.serbestAt�� = serbestAt��;
	}
	public String getBasketbolcuAd�() {
		return basketbolcuAd�;
	}
	public void setBasketbolcuAd�(String basketbolcuAd�) {
		this.basketbolcuAd� = basketbolcuAd�;
	}
	public String getBasketbolcuTak�m�() {
		return basketbolcuTak�m�;
	}
	public void setBasketbolcuTak�m�(String basketbolcuTak�m�) {
		this.basketbolcuTak�m� = basketbolcuTak�m�;
	}
	public boolean getKartKullan�ld�M�() {
		return kartKullan�ld�M�;
	}
	public void setKartKullan�ld�M�(boolean kartKullan�ld�M�) {
		this.kartKullan�ld�M� = kartKullan�ld�M�;
	}

}
