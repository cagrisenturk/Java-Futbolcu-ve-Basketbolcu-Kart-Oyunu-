package FutbolcuveBasketbolcuKartOyunu;

public class Basketbolcu extends Sporcu {
	private int ikilik;
	private int üçlük;
	private int serbestAtış;
	private String basketbolcuAdı;
	private String basketbolcuTakımı;
	private boolean kartKullanıldıMı;
	public Basketbolcu(String sporcuIsim, String sporcuTakim, int ikilik, int üçlük, int serbestAtış) {
		super(sporcuIsim, sporcuTakim);
		this.ikilik = ikilik;
		this.üçlük = üçlük;
		this.serbestAtış = serbestAtış;
		this.basketbolcuAdı = super.getSporcuIsim();
		this.basketbolcuTakımı = super.getSporcuTakim();
		this.kartKullanıldıMı = false;
	}
	
	@Override
	void sporcuPuaniGoster() {
		System.out.println("İkilik= "+getIkilik());
		System.out.println("Üçlük= "+getÜçlük());
		System.out.println("Serbest Atış= "+getSerbestAtış());
	}

	public int getIkilik() {
		return ikilik;
	}
	public void setIkilik(int ikilik) {
		this.ikilik = ikilik;
	}
	public int getÜçlük() {
		return üçlük;
	}
	public void setÜçlük(int üçlük) {
		this.üçlük = üçlük;
	}
	public int getSerbestAtış() {
		return serbestAtış;
	}
	public void setSerbestAtış(int serbestAtış) {
		this.serbestAtış = serbestAtış;
	}
	public String getBasketbolcuAdı() {
		return basketbolcuAdı;
	}
	public void setBasketbolcuAdı(String basketbolcuAdı) {
		this.basketbolcuAdı = basketbolcuAdı;
	}
	public String getBasketbolcuTakımı() {
		return basketbolcuTakımı;
	}
	public void setBasketbolcuTakımı(String basketbolcuTakımı) {
		this.basketbolcuTakımı = basketbolcuTakımı;
	}
	public boolean getKartKullanıldıMı() {
		return kartKullanıldıMı;
	}
	public void setKartKullanıldıMı(boolean kartKullanıldıMı) {
		this.kartKullanıldıMı = kartKullanıldıMı;
	}

}
