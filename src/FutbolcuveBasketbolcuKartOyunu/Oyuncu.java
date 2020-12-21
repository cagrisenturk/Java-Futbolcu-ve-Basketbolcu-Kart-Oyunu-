package FutbolcuveBasketbolcuKartOyunu;



import java.util.ArrayList;
import java.util.Random;

public class Oyuncu {
	ArrayList<Futbolcu> fkartlistesi=new ArrayList<Futbolcu>();
        ArrayList<Basketbolcu> bkartlistesi=new ArrayList<Basketbolcu>();
	
        ArrayList<Futbolcu> bfkartlistesi=new ArrayList<Futbolcu>();
        ArrayList<Futbolcu> kfkartlistesi=new ArrayList<Futbolcu>();
        ArrayList<Basketbolcu> bbkartlistesi=new ArrayList<Basketbolcu>();
        ArrayList<Basketbolcu> kbkartlistesi=new ArrayList<Basketbolcu>();
	private String oyuncuID;
	private String oyuncuAdý;
	private int skor;
	public Oyuncu(String oyuncuID, String oyuncuAdý, int skor) {
		super();
		this.oyuncuID = oyuncuID;
		this.setOyuncuAdý(oyuncuAdý);
		this.skor = skor;
	}
        public Oyuncu() {
		
	}
	   Random random=new Random();
	public void karýþtýr(){
            for (int i = 0; i < 4; i++) {
                int k=random.nextInt(8-i);
                bfkartlistesi.add(fkartlistesi.get(k));
                fkartlistesi.remove(k);
            }
            for (int i = 0; i < 4; i++) {
                kfkartlistesi.add(fkartlistesi.get(i));
            }
            for (int i = 0; i < 4; i++) {
                int k=random.nextInt(8-i);
                bbkartlistesi.add(bkartlistesi.get(k));
                bkartlistesi.remove(k);
            }
            for (int i = 0; i < 4; i++) {
                kbkartlistesi.add(bkartlistesi.get(i));
            }
        }
        
	public void test(){
            System.out.println(fkartlistesi.get(1).getFutbolcuAdý());
            System.out.println(bkartlistesi.get(1).getBasketbolcuAdý());
        }
	
	public void skorGoster() {
		System.out.println("skorumuz"+getSkor());
	}
	public void kartSeç() {
		
	}
	
	
	
	public String getOyuncuAdý() {
		return oyuncuAdý;
	}
	public String getOyuncuID() {
		return oyuncuID;
	}
	public void setOyuncuID(String oyuncuID) {
		this.oyuncuID = oyuncuID;
	}
	public int getSkor() {
		return skor;
	}
	public void setSkor() {
		this.skor = skor+10;
	}
	public void setOyuncuAdý(String oyuncuAdý) {
		this.oyuncuAdý = oyuncuAdý;
	}
	
	

}
