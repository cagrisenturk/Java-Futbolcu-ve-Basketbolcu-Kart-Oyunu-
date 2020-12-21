package FutbolcuveBasketbolcuKartOyunu;



public class Futbolcu extends Sporcu {

	private int penaltı;
	private int serbestVuruş;
	private int karşıKarşıya;
	private String futbolcuAdı;
	private String futbolcuTakım;
	private boolean kartKullanıldıMı;
	public Futbolcu(String sporcuIsim, String sporcuTakim, int penaltı, int serbestVuruş, int karşıKarşıya) {
		super(sporcuIsim, sporcuTakim);
		this.penaltı = penaltı;
		this.serbestVuruş = serbestVuruş;
		this.karşıKarşıya = karşıKarşıya;
		this.futbolcuAdı = super.getSporcuIsim();
		this.futbolcuTakım = super.getSporcuTakim();
		this.kartKullanıldıMı = false;
	}
	
	@Override
	void sporcuPuaniGoster() {
		System.out.println("Penaltısı= "+getPenaltı());
		System.out.println("Serbest Vuruş= "+getSerbestVuruş());
		System.out.println("Karşı Karşıya= "+getKarşıKarşıya());
	}






	public int getPenaltı() {
		return penaltı;
	}
	public void setPenaltı(int penaltı) {
		this.penaltı = penaltı;
	}
	public int getSerbestVuruş() {
		return serbestVuruş;
	}
	public void setSerbestVuruş(int serbestVuruş) {
		this.serbestVuruş = serbestVuruş;
	}
	public int getKarşıKarşıya() {
		return karşıKarşıya;
	}
	public void setKarşıKarşıya(int karşıKarşıya) {
		this.karşıKarşıya = karşıKarşıya;
	}
	public String getFutbolcuAdı() {
		return futbolcuAdı;
	}
	public void setFutbolcuAdı(String futbolcuAdı) {
		this.futbolcuAdı = futbolcuAdı;
	}
	public String getFutbolcuTakım() {
		return futbolcuTakım;
	}
	public void setFutbolcuTakım(String futbolcuTakım) {
		this.futbolcuTakım = futbolcuTakım;
	}
	public boolean getKartKullanıldıMı() {
		return kartKullanıldıMı;
	}
	public void setKartKullanıldıMı(boolean kartKullanıldıMı) {
		this.kartKullanıldıMı = kartKullanıldıMı;
	}








	
	
}
