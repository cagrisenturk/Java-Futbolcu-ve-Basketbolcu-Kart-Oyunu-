package FutbolcuveBasketbolcuKartOyunu;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Color;

public class Test extends JFrame {

	private JPanel contentPane;
	private JTextField txtKullancAdGiriniz;
	private	JButton oyuncu6;
	private JButton oyuncu7;
	private JButton oyuncu8;
	private JButton oyuncu3;
	private JButton oyuncu2;
	private JButton oyuncu1;
	private JButton oyuncu4;
	private JButton oyuncu5;
	private JLabel kullan�c�ad�;
	private JLabel bilgisayar;
	private int bilgisayarse�indis;
	private JTextPane sonu�g�ster;
	private int random�zellik;
	private JTextPane kullan�c�skorg�ster;
	private JTextPane bilgisayarskorg�ster;
	private JButton sonu�;
	private JLabel bilgisayarbilgig�ster;
	private JLabel oyuncubilgig�ster;
	int kontrol=0;
	private JLabel kullan�c�ad�gir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Anamen� anamen�=new Anamen�();
        anamen�.setVisible(true);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test frame = new Test();
					frame.setVisible(false);
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public Test() {
		
		Oyuncu oyuncu=new Oyuncu();
		Futbolcu neymar=new Futbolcu("Neymar", "PSG", 95, 85, 95);
		Futbolcu ronaldo=new Futbolcu("Ronaldo", "Juventus", 99, 93, 97);
		Futbolcu messi=new Futbolcu("Messi", "Barcelona", 99, 93, 96);
		Futbolcu mbappe=new Futbolcu("Mbappe", "PSG", 90, 75, 92);
		Futbolcu mane=new Futbolcu("Mane", "Liverpool", 92, 80, 91);
		Futbolcu salah=new Futbolcu("Salah", "Liverpool", 93, 82, 88);
		Futbolcu debruyne=new Futbolcu("Debruyne", "Manchster City", 96, 95, 80);
		Futbolcu hazard=new Futbolcu("Hazard", "Real Madrid", 92, 82, 93);
		
		Basketbolcu curry=new Basketbolcu("Stephan Curry", "Golden State", 90, 95, 97);
		Basketbolcu james=new Basketbolcu("Lebron James", " Los Angeles Lakers", 95, 90, 98);
		Basketbolcu harden=new Basketbolcu("James Harden", " Houston Rockets", 92, 93, 95);
		Basketbolcu durant=new Basketbolcu("Kevin Durant", " Brooklyn Nets ", 89, 92, 90);
		Basketbolcu cedi=new Basketbolcu("Cedi Osman", "Cleveland Cavaliers", 85, 85, 85);
		Basketbolcu furkan=new Basketbolcu("Furkan Korkmaz", "golden state", 84, 86, 85);
		Basketbolcu melih=new Basketbolcu("Melih Mahmuto�lu", "Philadelphia 76ers", 80, 88, 80);
		Basketbolcu kobe=new Basketbolcu("Kobe Bryant", "Los Angeles Lakers", 99, 99, 99);
			
		ArrayList<Futbolcu> futbolcular=new ArrayList<Futbolcu>();
		futbolcular.add(neymar);
		futbolcular.add(ronaldo);
		futbolcular.add(messi);
		futbolcular.add(mbappe);
		futbolcular.add(mane);
		futbolcular.add(salah);
		futbolcular.add(debruyne);
		futbolcular.add(hazard);
	        
		
		ArrayList<Basketbolcu> basketbolcular=new ArrayList<Basketbolcu>();
		basketbolcular.add(kobe);
		basketbolcular.add(melih);
		basketbolcular.add(furkan);
		basketbolcular.add(cedi);
		basketbolcular.add(durant);
		basketbolcular.add(harden);
		basketbolcular.add(james);
		basketbolcular.add(curry);
	            for (int i = 0; i < futbolcular.size(); i++) {
	                oyuncu.fkartlistesi.add(futbolcular.get(i));
	            }
	          
	            for (int i = 0; i < basketbolcular.size(); i++) {
	                oyuncu.bkartlistesi.add(basketbolcular.get(i));
	            }
	            
	           
	    oyuncu.kar��t�r();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		bilgisayarbilgig�ster = new JLabel("");
		bilgisayarbilgig�ster.setBounds(724, 91, 153, 185);
		contentPane.add(bilgisayarbilgig�ster);
		
		oyuncubilgig�ster = new JLabel("");
		oyuncubilgig�ster.setBounds(460, 91, 153, 185);
		contentPane.add(oyuncubilgig�ster);
		
		txtKullancAdGiriniz = new JTextField();
		txtKullancAdGiriniz.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtKullancAdGiriniz.setFont(new Font("Stencil", Font.PLAIN, 17));
		txtKullancAdGiriniz.setText("");
		txtKullancAdGiriniz.setBounds(674, 324, 203, 43);
		contentPane.add(txtKullancAdGiriniz);
		txtKullancAdGiriniz.setColumns(10);
		
		oyuncu5 = new JButton();
		Image button5img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kbkartlistesi.get(0).getBasketbolcuAd�()+".png")).getImage();
		oyuncu5.setIcon(new ImageIcon(button5img));
		oyuncu5.setBounds(234, 607, 153, 185);
		contentPane.add(oyuncu5);
		
		oyuncu6 = new JButton();
		Image button6img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kbkartlistesi.get(1).getBasketbolcuAd�()+".png")).getImage();
		oyuncu6.setIcon(new ImageIcon(button6img));
		oyuncu6.setBounds(478, 607, 153, 185);
		contentPane.add(oyuncu6);
		
		oyuncu7 = new JButton();
		Image button7img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kbkartlistesi.get(2).getBasketbolcuAd�()+".png")).getImage();
		oyuncu7.setIcon(new ImageIcon(button7img));
		oyuncu7.setBounds(700, 607, 153, 185);
		contentPane.add(oyuncu7);
		
		oyuncu8 = new JButton();
		Image button8img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kbkartlistesi.get(3).getBasketbolcuAd�()+".png")).getImage();
		oyuncu8.setIcon(new ImageIcon(button8img));
		oyuncu8.setBounds(949, 607, 153, 185);
		contentPane.add(oyuncu8);
		
		oyuncu3 = new JButton();
		Image button3img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kfkartlistesi.get(2).getFutbolcuAd�()+".png")).getImage();
		oyuncu3.setIcon(new ImageIcon(button3img));
		oyuncu3.setBounds(700, 392, 153, 185);
		contentPane.add(oyuncu3);
		
		oyuncu2 = new JButton();
		Image button2img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kfkartlistesi.get(1).getFutbolcuAd�()+".png")).getImage();
		oyuncu2.setIcon(new ImageIcon(button2img));
		oyuncu2.setBounds(478, 392, 153, 185);
		contentPane.add(oyuncu2);
		
		oyuncu1 = new JButton();
		Image button1img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kfkartlistesi.get(0).getFutbolcuAd�()+".png")).getImage();
		oyuncu1.setIcon(new ImageIcon(button1img));
		oyuncu1.setBounds(234, 392, 153, 185);
		contentPane.add(oyuncu1);
		
		
		oyuncu4 = new JButton();
		Image button4img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kfkartlistesi.get(3).getFutbolcuAd�()+".png")).getImage();
		oyuncu4.setIcon(new ImageIcon(button4img));
		oyuncu4.setBounds(949, 392, 153, 185);
		contentPane.add(oyuncu4);
		
		kullan�c�ad� = new JLabel("");
		kullan�c�ad�.setFont(new Font("Tahoma", Font.BOLD, 17));
		kullan�c�ad�.setBounds(478, 38, 107, 43);
		contentPane.add(kullan�c�ad�);
		
		bilgisayar = new JLabel("");
		bilgisayar.setFont(new Font("Tahoma", Font.BOLD, 17));
		bilgisayar.setBounds(714, 38, 107, 43);
		contentPane.add(bilgisayar);
		
		sonu�g�ster = new JTextPane();
		sonu�g�ster.setEditable(false);
		sonu�g�ster.setBounds(552, 291, 237, 66);
		contentPane.add(sonu�g�ster);
		sonu�g�ster.setVisible(false);
		
		kullan�c�skorg�ster = new JTextPane();
		kullan�c�skorg�ster.setEditable(false);
		kullan�c�skorg�ster.setBounds(427, 38, 29, 28);
		contentPane.add(kullan�c�skorg�ster);
		kullan�c�skorg�ster.setVisible(false);
		
		bilgisayarskorg�ster = new JTextPane();
		bilgisayarskorg�ster.setEditable(false);
		bilgisayarskorg�ster.setBounds(896, 38, 29, 28);
		contentPane.add(bilgisayarskorg�ster);
		bilgisayarskorg�ster.setVisible(false);
		
		sonu� = new JButton("");
		Image imgsonu�=new ImageIcon(this.getClass().getResource("/SONUC.png")).getImage();
		sonu�.setIcon(new ImageIcon(imgsonu�));
		sonu�.setFont(new Font("Tahoma", Font.BOLD, 17));
		sonu�.setBounds(1325, 491, 160, 81);
		contentPane.add(sonu�);
		sonu�.setVisible(false);
		
		kullan�c�ad�gir = new JLabel("KULLANICI ADI GIRINIZ");
		kullan�c�ad�gir.setFont(new Font("Stencil", Font.PLAIN, 17));
		kullan�c�ad�gir.setHorizontalAlignment(SwingConstants.CENTER);
		kullan�c�ad�gir.setBounds(674, 271, 203, 43);
		contentPane.add(kullan�c�ad�gir);
		
		oyuncu1.setVisible(false);
		oyuncu2.setVisible(false);
		oyuncu3.setVisible(false);
		oyuncu4.setVisible(false);
		oyuncu5.setVisible(false);
		oyuncu6.setVisible(false);
		oyuncu7.setVisible(false);
		oyuncu8.setVisible(false);
		Random random=new Random();
		
		JLabel arkaplan = new JLabel("");
		arkaplan.setBackground(new Color(240, 240, 240));
		arkaplan.setHorizontalAlignment(SwingConstants.CENTER);
		Image imgarkaplan=new ImageIcon(this.getClass().getResource("/arkaplan.jpg")).getImage();
		arkaplan.setIcon(new ImageIcon(imgarkaplan));
		arkaplan.setBounds(0, 0, 1540, 835);
		contentPane.add(arkaplan);
		
		
		Kullan�c� kullan�c�1=new Kullan�c�("", "", 0);
		Bilgisayar bilgisayar1=new Bilgisayar("Bilgisayar", "bilgisayar", 0);
		txtKullancAdGiriniz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				kullan�c�ad�.setText(txtKullancAdGiriniz.getText().toUpperCase());
				kullan�c�1.setOyuncuAd�(txtKullancAdGiriniz.getText());
				kullan�c�1.setOyuncuID(txtKullancAdGiriniz.getText());
				bilgisayar.setText(bilgisayar1.getOyuncuAd�().toUpperCase());
				txtKullancAdGiriniz.setVisible(false);
				kullan�c�ad�gir.setVisible(false);
				sonu�g�ster.setVisible(true);
				oyuncu1.setVisible(true);
				oyuncu2.setVisible(true);
				oyuncu3.setVisible(true);
				oyuncu4.setVisible(true);
				oyuncu5.setVisible(true);
				oyuncu6.setVisible(true);
				oyuncu7.setVisible(true);
				oyuncu8.setVisible(true);
				kullan�c�skorg�ster.setVisible(true);
				bilgisayarskorg�ster.setVisible(true);
				sonu�.setVisible(true);
				oyuncubilgig�ster.setVisible(true);
				bilgisayarbilgig�ster.setVisible(true);
				oyuncu5.setEnabled(false);oyuncu6.setEnabled(false);oyuncu7.setEnabled(false);oyuncu8.setEnabled(false);
				oyuncu1.setEnabled(true);oyuncu2.setEnabled(true);oyuncu3.setEnabled(true);oyuncu4.setEnabled(true);
			}
		});
		
		
		//BUTON1
		oyuncu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  {
				oyuncu1.setEnabled(false);oyuncu2.setEnabled(false);oyuncu3.setEnabled(false);oyuncu4.setEnabled(false);
				oyuncu5.setEnabled(true);oyuncu6.setEnabled(true);oyuncu7.setEnabled(true);oyuncu8.setEnabled(true);
				Image labelimg=new ImageIcon(this.getClass().getResource("/"+oyuncu.kfkartlistesi.get(0).getFutbolcuAd�()+".png")).getImage();
				oyuncubilgig�ster.setIcon(new ImageIcon(labelimg));
				bilgisayarse�indis=random.nextInt(oyuncu.bfkartlistesi.size());
				Image labellimg=new ImageIcon(this.getClass().getResource("/"+oyuncu.bfkartlistesi.get(bilgisayarse�indis).getFutbolcuAd�()+".png")).getImage();
				bilgisayarbilgig�ster.setIcon(new ImageIcon(labellimg));
				int kullan�c�se�indis=0;
				random�zellik=random.nextInt(3);
				if (oyuncu.bbkartlistesi.size()==0) {
                    oyuncu1.setEnabled(true);oyuncu2.setEnabled(true);oyuncu3.setEnabled(true);oyuncu4.setEnabled(true); }
                if (random�zellik==0) {
                    if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getPenalt�()>oyuncu.bfkartlistesi.get(bilgisayarse�indis).getPenalt�()) {
                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum penalt�"+"\n Bu turu siz kazand�n�z tebrikler:)");
                    	oyuncu.kfkartlistesi.get(0).setKartKullan�ld�M�(true);
                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
                        oyuncu1.setVisible(false);
                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
                        kullan�c�1.setSkor();
                        kullan�c�skorg�ster.setBackground(Color.GREEN);
                        bilgisayarskorg�ster.setBackground(Color.RED);
                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
        				
                    }
                    else if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getPenalt�()<oyuncu.bfkartlistesi.get(bilgisayarse�indis).getPenalt�()) {
                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum penalt�"+"\n Bu turu bilgisayar kazand� :(");
                    	oyuncu.kfkartlistesi.get(0).setKartKullan�ld�M�(true);
                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
                        oyuncu1.setVisible(false);
                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
                        bilgisayar1.setSkor();
                        kullan�c�skorg�ster.setBackground(Color.RED);
                        bilgisayarskorg�ster.setBackground(Color.GREEN);
                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
                    }
                    else{
                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum penalt�"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
                    		kontrol++;
                    		oyuncu1.setEnabled(true);
                    }
                    }
     
                }
                if (random�zellik==1) {
                    if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getSerbestVuru�()>oyuncu.bfkartlistesi.get(bilgisayarse�indis).getSerbestVuru�()) {
                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest vuru�"+"\n Bu turu siz kazand�n�z tebrikler:)");
                    	oyuncu.kfkartlistesi.get(0).setKartKullan�ld�M�(true);
                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
                        oyuncu1.setVisible(false);
                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
                        kullan�c�1.setSkor();
                        kullan�c�skorg�ster.setBackground(Color.GREEN);
                        bilgisayarskorg�ster.setBackground(Color.RED);
                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
                    }
                    else if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getSerbestVuru�()<oyuncu.bfkartlistesi.get(bilgisayarse�indis).getSerbestVuru�()) {
                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest vuru�"+"\n Bu turu bilgisayar kazand� :(");
                    	oyuncu.kfkartlistesi.get(0).setKartKullan�ld�M�(true);
                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
                        oyuncu1.setVisible(false);
                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
                        bilgisayar1.setSkor();
                        kullan�c�skorg�ster.setBackground(Color.RED);
                        bilgisayarskorg�ster.setBackground(Color.GREEN);
                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
                    }
                    else{
                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest vuru�"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
                    		kontrol++;
                    		oyuncu1.setEnabled(true);
                    }
                
                    }}
                if (random�zellik==2) {
                    if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getKar��Kar��ya()>oyuncu.bfkartlistesi.get(bilgisayarse�indis).getKar��Kar��ya()) {
                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum kar�� kar��ya"+"\n Bu turu siz kazand�n�z tebrikler:)");
                    	oyuncu.kfkartlistesi.get(0).setKartKullan�ld�M�(true);
                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
                        oyuncu1.setVisible(false);
                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
                        kullan�c�1.setSkor();
                        kullan�c�skorg�ster.setBackground(Color.GREEN);
                        bilgisayarskorg�ster.setBackground(Color.RED);
                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
                    }
                    else if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getKar��Kar��ya()<oyuncu.bfkartlistesi.get(bilgisayarse�indis).getKar��Kar��ya()) {
                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum kar�� kar��ya"+"\n Bu turu bilgisayar kazand� :(");
                    	oyuncu.kfkartlistesi.get(0).setKartKullan�ld�M�(true);
                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
                        oyuncu1.setVisible(false);
                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
                        bilgisayar1.setSkor();
                        kullan�c�skorg�ster.setBackground(Color.RED);
                        bilgisayarskorg�ster.setBackground(Color.GREEN);
                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
                    }
                    else{
                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest vuru�"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
                    		kontrol++;
                    		oyuncu1.setEnabled(true);
                    }
                    }
                }
             
                if (kontrol==3) {
                	sonu�g�ster.setText("Kartlar�n de�erlendirilen �zellikleri ayn�d�r oyun sona ermi�tir");
                	oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
                	oyuncu1.setVisible(false);
                }
            }
		});
		//BUTON2
		
		oyuncu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  {
				oyuncu1.setEnabled(false);oyuncu2.setEnabled(false);oyuncu3.setEnabled(false);oyuncu4.setEnabled(false);
				oyuncu5.setEnabled(true);oyuncu6.setEnabled(true);oyuncu7.setEnabled(true);oyuncu8.setEnabled(true);
				Image label2img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kfkartlistesi.get(1).getFutbolcuAd�()+".png")).getImage();
				oyuncubilgig�ster.setIcon(new ImageIcon(label2img));
				bilgisayarse�indis=random.nextInt(oyuncu.bfkartlistesi.size());
				Image labell2img=new ImageIcon(this.getClass().getResource("/"+oyuncu.bfkartlistesi.get(bilgisayarse�indis).getFutbolcuAd�()+".png")).getImage();
				bilgisayarbilgig�ster.setIcon(new ImageIcon(labell2img));
						int kullan�c�se�indis=1;
						random�zellik=random.nextInt(3);
						if (oyuncu.bbkartlistesi.size()==0) {
                            oyuncu1.setEnabled(true);oyuncu2.setEnabled(true);oyuncu3.setEnabled(true);oyuncu4.setEnabled(true); }
		                if (random�zellik==0) {
		                    if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getPenalt�()>oyuncu.bfkartlistesi.get(bilgisayarse�indis).getPenalt�()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum penalt�"+"\n Bu turu siz kazand�n�z tebrikler:)");
		                    	oyuncu.kfkartlistesi.get(1).setKartKullan�ld�M�(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu2.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
		                        kullan�c�1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.GREEN);
		                        bilgisayarskorg�ster.setBackground(Color.RED);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getPenalt�()<oyuncu.bfkartlistesi.get(bilgisayarse�indis).getPenalt�()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum penalt�"+"\n Bu turu bilgisayar kazand� :(");
		                    	oyuncu.kfkartlistesi.get(1).setKartKullan�ld�M�(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu2.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
		                        bilgisayar1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.RED);
		                        bilgisayarskorg�ster.setBackground(Color.GREEN);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum penalt�"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
		                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
		                    		kontrol++;
		                    		oyuncu2.setEnabled(true);
		                    }
		                    }
		                }
		                if (random�zellik==1) {
		                    if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getSerbestVuru�()>oyuncu.bfkartlistesi.get(bilgisayarse�indis).getSerbestVuru�()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest vuru�"+"\n Bu turu siz kazand�n�z tebrikler:)");
		                    	oyuncu.kfkartlistesi.get(1).setKartKullan�ld�M�(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu2.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
		                        kullan�c�1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.GREEN);
		                        bilgisayarskorg�ster.setBackground(Color.RED);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getSerbestVuru�()<oyuncu.bfkartlistesi.get(bilgisayarse�indis).getSerbestVuru�()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest vuru�"+"\n Bu turu bilgisayar kazand� :(");
		                    	oyuncu.kfkartlistesi.get(1).setKartKullan�ld�M�(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu2.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
		                        bilgisayar1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.RED);
		                        bilgisayarskorg�ster.setBackground(Color.GREEN);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest vuru�"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
		                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
		                    		kontrol++;
		                    		oyuncu2.setEnabled(true);
		                    }
		                    }
		                }
		                if (random�zellik==2) {
		                    if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getKar��Kar��ya()>oyuncu.bfkartlistesi.get(bilgisayarse�indis).getKar��Kar��ya()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum kar�� kar��ya"+"\n Bu turu siz kazand�n�z tebrikler:)");
		                    	oyuncu.kfkartlistesi.get(1).setKartKullan�ld�M�(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu2.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
		                        kullan�c�1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.GREEN);
		                        bilgisayarskorg�ster.setBackground(Color.RED);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getKar��Kar��ya()<oyuncu.bfkartlistesi.get(bilgisayarse�indis).getKar��Kar��ya()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum kar�� kar��ya"+"\n Bu turu bilgisayar kazand� :(");
		                    	oyuncu.kfkartlistesi.get(1).setKartKullan�ld�M�(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu2.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
		                        bilgisayar1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.RED);
		                        bilgisayarskorg�ster.setBackground(Color.GREEN);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest vuru�"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
		                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
		                    		kontrol++;
		                    		oyuncu2.setEnabled(true);
		                    }
		                    }
		                }
		                if (kontrol==3) {
		                	sonu�g�ster.setText("Kartlar�n de�erlendirilen �zellikleri ayn�d�r oyun sona ermi�tir");
		                	oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
		                	oyuncu2.setVisible(false);
		                }    
		            }
		});
		
		//BUTON3
		
		oyuncu3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  {
				oyuncu1.setEnabled(false);oyuncu2.setEnabled(false);oyuncu3.setEnabled(false);oyuncu4.setEnabled(false);
				oyuncu5.setEnabled(true);oyuncu6.setEnabled(true);oyuncu7.setEnabled(true);oyuncu8.setEnabled(true);
				Image label3img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kfkartlistesi.get(2).getFutbolcuAd�()+".png")).getImage();
				oyuncubilgig�ster.setIcon(new ImageIcon(label3img));
				bilgisayarse�indis=random.nextInt(oyuncu.bfkartlistesi.size());
				Image labell3img=new ImageIcon(this.getClass().getResource("/"+oyuncu.bfkartlistesi.get(bilgisayarse�indis).getFutbolcuAd�()+".png")).getImage();
				bilgisayarbilgig�ster.setIcon(new ImageIcon(labell3img));
						int kullan�c�se�indis=2;
						random�zellik=random.nextInt(3);
						if (oyuncu.bbkartlistesi.size()==0) {
                            oyuncu1.setEnabled(true);oyuncu2.setEnabled(true);oyuncu3.setEnabled(true);oyuncu4.setEnabled(true); }
		                if (random�zellik==0) {
		                    if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getPenalt�()>oyuncu.bfkartlistesi.get(bilgisayarse�indis).getPenalt�()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum penalt�"+"\n Bu turu siz kazand�n�z tebrikler:)");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullan�ld�M�(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu3.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
		                        kullan�c�1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.GREEN);
		                        bilgisayarskorg�ster.setBackground(Color.RED);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getPenalt�()<oyuncu.bfkartlistesi.get(bilgisayarse�indis).getPenalt�()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum penalt�"+"\n Bu turu bilgisayar kazand� :(");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullan�ld�M�(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu3.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
		                        bilgisayar1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.RED);
		                        bilgisayarskorg�ster.setBackground(Color.GREEN);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum penalt�"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
		                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
		                    		kontrol++;
		                    		oyuncu3.setEnabled(true);
		                    }
		                    }
		                }
		                if (random�zellik==1) {
		                    if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getSerbestVuru�()>oyuncu.bfkartlistesi.get(bilgisayarse�indis).getSerbestVuru�()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest vuru�"+"\n Bu turu siz kazand�n�z tebrikler:)");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullan�ld�M�(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu3.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
		                        kullan�c�1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.GREEN);
		                        bilgisayarskorg�ster.setBackground(Color.RED);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getSerbestVuru�()<oyuncu.bfkartlistesi.get(bilgisayarse�indis).getSerbestVuru�()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest vuru�"+"\n Bu turu bilgisayar kazand� :(");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullan�ld�M�(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu3.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
		                        bilgisayar1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.RED);
		                        bilgisayarskorg�ster.setBackground(Color.GREEN);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest vuru�"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
		                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
		                    		kontrol++;
		                    		oyuncu3.setEnabled(true);
		                    }
		                    }
		                }
		                if (random�zellik==2) {
		                    if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getKar��Kar��ya()>oyuncu.bfkartlistesi.get(bilgisayarse�indis).getKar��Kar��ya()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum kar�� kar��ya"+"\n Bu turu siz kazand�n�z tebrikler:)");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullan�ld�M�(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu3.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
		                        kullan�c�1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.GREEN);
		                        bilgisayarskorg�ster.setBackground(Color.RED);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getKar��Kar��ya()<oyuncu.bfkartlistesi.get(bilgisayarse�indis).getKar��Kar��ya()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum kar�� kar��ya"+"\n Bu turu bilgisayar kazand� :(");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullan�ld�M�(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu3.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
		                        bilgisayar1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.RED);
		                        bilgisayarskorg�ster.setBackground(Color.GREEN);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest vuru�"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
		                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
		                    		kontrol++;
		                    		oyuncu3.setEnabled(true);
		                    }
		                    }
		                }
		                if (kontrol==3) {
		                	sonu�g�ster.setText("Kartlar�n de�erlendirilen �zellikleri ayn�d�r oyun sona ermi�tir");
		                	oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
		                	oyuncu3.setVisible(false);
		                }
		            }
		});
		//BUTON4
		
		oyuncu4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  {
				oyuncu1.setEnabled(false);oyuncu2.setEnabled(false);oyuncu3.setEnabled(false);oyuncu4.setEnabled(false);
				oyuncu5.setEnabled(true);oyuncu6.setEnabled(true);oyuncu7.setEnabled(true);oyuncu8.setEnabled(true);
				Image label4img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kfkartlistesi.get(3).getFutbolcuAd�()+".png")).getImage();
				oyuncubilgig�ster.setIcon(new ImageIcon(label4img));
				bilgisayarse�indis=random.nextInt(oyuncu.bfkartlistesi.size());
				Image labell4img=new ImageIcon(this.getClass().getResource("/"+oyuncu.bfkartlistesi.get(bilgisayarse�indis).getFutbolcuAd�()+".png")).getImage();
				bilgisayarbilgig�ster.setIcon(new ImageIcon(labell4img));
						int kullan�c�se�indis=3;
						random�zellik=random.nextInt(3);
						if (oyuncu.bbkartlistesi.size()==0) {
                            oyuncu1.setEnabled(true);oyuncu2.setEnabled(true);oyuncu3.setEnabled(true);oyuncu4.setEnabled(true); }
		                if (random�zellik==0) {
		                    if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getPenalt�()>oyuncu.bfkartlistesi.get(bilgisayarse�indis).getPenalt�()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum penalt�"+"\n Bu turu siz kazand�n�z tebrikler:)");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullan�ld�M�(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu4.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
		                        kullan�c�1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.GREEN);
		                        bilgisayarskorg�ster.setBackground(Color.RED);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getPenalt�()<oyuncu.bfkartlistesi.get(bilgisayarse�indis).getPenalt�()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum penalt�"+"\n Bu turu bilgisayar kazand� :(");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullan�ld�M�(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu4.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
		                        bilgisayar1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.RED);
		                        bilgisayarskorg�ster.setBackground(Color.GREEN);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum penalt�"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
		                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
		                    		kontrol++;
		                    		oyuncu4.setEnabled(true);
		                    }
		                    }
		                }
		                if (random�zellik==1) {
		                    if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getSerbestVuru�()>oyuncu.bfkartlistesi.get(bilgisayarse�indis).getSerbestVuru�()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest vuru�"+"\n Bu turu siz kazand�n�z tebrikler:)");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullan�ld�M�(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu4.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
		                        kullan�c�1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.GREEN);
		                        bilgisayarskorg�ster.setBackground(Color.RED);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getSerbestVuru�()<oyuncu.bfkartlistesi.get(bilgisayarse�indis).getSerbestVuru�()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest vuru�"+"\n Bu turu bilgisayar kazand� :(");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullan�ld�M�(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu4.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
		                        bilgisayar1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.RED);
		                        bilgisayarskorg�ster.setBackground(Color.GREEN);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest vuru�"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
		                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
		                    		kontrol++;
		                    		oyuncu4.setEnabled(true);
		                    }
		                    }
		                }
		                if (random�zellik==2) {
		                    if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getKar��Kar��ya()>oyuncu.bfkartlistesi.get(bilgisayarse�indis).getKar��Kar��ya()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum kar�� kar��ya"+"\n Bu turu siz kazand�n�z tebrikler:)");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullan�ld�M�(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu4.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
		                        kullan�c�1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.GREEN);
		                        bilgisayarskorg�ster.setBackground(Color.RED);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kfkartlistesi.get(kullan�c�se�indis).getKar��Kar��ya()<oyuncu.bfkartlistesi.get(bilgisayarse�indis).getKar��Kar��ya()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum kar�� kar��ya"+"\n Bu turu bilgisayar kazand� :(");
		                    	oyuncu.kfkartlistesi.get(2).setKartKullan�ld�M�(true);
		                    	oyuncu.bfkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu4.setVisible(false);
		                        oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
		                        bilgisayar1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.RED);
		                        bilgisayarskorg�ster.setBackground(Color.GREEN);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest vuru�"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==0 && oyuncu.bfkartlistesi.size()==1) {
		                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
		                    		kontrol++;
		                    		oyuncu4.setEnabled(true);
		                    }
		                    }
		                }
		                if (kontrol==3) {
		                	sonu�g�ster.setText("Kartlar�n de�erlendirilen �zellikleri ayn�d�r oyun sona ermi�tir");
		                	oyuncu.bfkartlistesi.remove(bilgisayarse�indis);
		                	oyuncu4.setVisible(false);
		                }
		            }
		}); 
		
		
		//buton5
		oyuncu5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  {
				oyuncu5.setEnabled(false);oyuncu6.setEnabled(false);oyuncu7.setEnabled(false);oyuncu8.setEnabled(false);
				oyuncu1.setEnabled(true);oyuncu2.setEnabled(true);oyuncu3.setEnabled(true);oyuncu4.setEnabled(true);
				Image label5img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kbkartlistesi.get(0).getBasketbolcuAd�()+".png")).getImage();
				oyuncubilgig�ster.setIcon(new ImageIcon(label5img));
				bilgisayarse�indis=random.nextInt(oyuncu.bbkartlistesi.size());
				Image labell5img=new ImageIcon(this.getClass().getResource("/"+oyuncu.bbkartlistesi.get(bilgisayarse�indis).getBasketbolcuAd�()+".png")).getImage();
				bilgisayarbilgig�ster.setIcon(new ImageIcon(labell5img));
				int kullan�c�se�indis=0;
				random�zellik=random.nextInt(3);
				if (oyuncu.bfkartlistesi.size()==0) {
                    oyuncu5.setEnabled(true);oyuncu6.setEnabled(true);oyuncu7.setEnabled(true);oyuncu8.setEnabled(true); }
                if (random�zellik==0) {
                    if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).getIkilik()>oyuncu.bbkartlistesi.get(bilgisayarse�indis).getIkilik()) {
                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ikilik"+"\n Bu turu siz kazand�n�z tebrikler:)");
                    	oyuncu.kbkartlistesi.get(0).setKartKullan�ld�M�(true);
                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
                        oyuncu5.setVisible(false);
                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
                        kullan�c�1.setSkor();
                        kullan�c�skorg�ster.setBackground(Color.GREEN);
                        bilgisayarskorg�ster.setBackground(Color.RED);
                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
                    }
                    else if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).getIkilik()<oyuncu.bbkartlistesi.get(bilgisayarse�indis).getIkilik()) {
                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ikilik"+"\n Bu turu bilgisayar kazand� :(");
                    	oyuncu.kbkartlistesi.get(0).setKartKullan�ld�M�(true);
                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
                        oyuncu5.setVisible(false);
                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
                        bilgisayar1.setSkor();
                        kullan�c�skorg�ster.setBackground(Color.RED);
                        bilgisayarskorg�ster.setBackground(Color.GREEN);
                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
                    }
                    else{
                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ikilik"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
                    		kontrol++;
                    		oyuncu5.setEnabled(true);
                    }
                    }
                }
                if (random�zellik==1) {
                    if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).get��l�k()>oyuncu.bbkartlistesi.get(bilgisayarse�indis).get��l�k()) {
                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ��l�k"+"\n Bu turu siz kazand�n�z tebrikler:)");
                    	oyuncu.kbkartlistesi.get(0).setKartKullan�ld�M�(true);
                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
                        oyuncu5.setVisible(false);
                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
                        kullan�c�1.setSkor();
                        kullan�c�skorg�ster.setBackground(Color.GREEN);
                        bilgisayarskorg�ster.setBackground(Color.RED);
                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
                    }
                    else if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).get��l�k()<oyuncu.bbkartlistesi.get(bilgisayarse�indis).get��l�k()) {
                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ��l�k"+"\n Bu turu bilgisayar kazand� :(");
                    	oyuncu.kbkartlistesi.get(0).setKartKullan�ld�M�(true);
                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
                        oyuncu5.setVisible(false);
                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
                        bilgisayar1.setSkor();
                        kullan�c�skorg�ster.setBackground(Color.RED);
                        bilgisayarskorg�ster.setBackground(Color.GREEN);
                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
                    }
                    else{
                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ��l�k"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
                    		kontrol++;
                    		oyuncu5.setEnabled(true);
                    }
                    }
                }
                if (random�zellik==2) {
                    if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).getSerbestAt��()>oyuncu.bbkartlistesi.get(bilgisayarse�indis).getSerbestAt��()) {
                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest at��"+"\n Bu turu siz kazand�n�z tebrikler:)");
                    	oyuncu.kbkartlistesi.get(0).setKartKullan�ld�M�(true);
                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
                        oyuncu5.setVisible(false);
                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
                        kullan�c�1.setSkor();
                        kullan�c�skorg�ster.setBackground(Color.GREEN);
                        bilgisayarskorg�ster.setBackground(Color.RED);
                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
                    }
                    else if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).getSerbestAt��()<oyuncu.bbkartlistesi.get(bilgisayarse�indis).getSerbestAt��()) {
                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest at��"+"\n Bu turu bilgisayar kazand� :(");
                    	oyuncu.kbkartlistesi.get(0).setKartKullan�ld�M�(true);
                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
                        oyuncu5.setVisible(false);
                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
                        bilgisayar1.setSkor();
                        kullan�c�skorg�ster.setBackground(Color.RED);
                        bilgisayarskorg�ster.setBackground(Color.GREEN);
                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
                    }
                    else{
                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest at��"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
                    		kontrol++;
                    		oyuncu5.setEnabled(true);
                    }
                    }
                }
                if (kontrol==3) {
                	sonu�g�ster.setText("Kartlar�n de�erlendirilen �zellikleri ayn�d�r oyun sona ermi�tir");
                	oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
                	oyuncu5.setVisible(false);
                }
            }
		});
		
		//buton6
				oyuncu6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0)  {
						oyuncu5.setEnabled(false);oyuncu6.setEnabled(false);oyuncu7.setEnabled(false);oyuncu8.setEnabled(false);
						oyuncu1.setEnabled(true);oyuncu2.setEnabled(true);oyuncu3.setEnabled(true);oyuncu4.setEnabled(true);
						Image label6img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kbkartlistesi.get(1).getBasketbolcuAd�()+".png")).getImage();
						oyuncubilgig�ster.setIcon(new ImageIcon(label6img));
						bilgisayarse�indis=random.nextInt(oyuncu.bbkartlistesi.size());
						Image labell6img=new ImageIcon(this.getClass().getResource("/"+oyuncu.bbkartlistesi.get(bilgisayarse�indis).getBasketbolcuAd�()+".png")).getImage();
						bilgisayarbilgig�ster.setIcon(new ImageIcon(labell6img));
						int kullan�c�se�indis=1;
						random�zellik=random.nextInt(3);
						if (oyuncu.bfkartlistesi.size()==0) {
		                    oyuncu5.setEnabled(true);oyuncu6.setEnabled(true);oyuncu7.setEnabled(true);oyuncu8.setEnabled(true); }
		                if (random�zellik==0) {
		                    if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).getIkilik()>oyuncu.bbkartlistesi.get(bilgisayarse�indis).getIkilik()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ikilik"+"\n Bu turu siz kazand�n�z tebrikler:)");
		                    	oyuncu.kbkartlistesi.get(1).setKartKullan�ld�M�(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu6.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
		                        kullan�c�1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.GREEN);
		                        bilgisayarskorg�ster.setBackground(Color.RED);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).getIkilik()<oyuncu.bbkartlistesi.get(bilgisayarse�indis).getIkilik()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ikilik"+"\n Bu turu bilgisayar kazand� :(");
		                    	oyuncu.kbkartlistesi.get(1).setKartKullan�ld�M�(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu6.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
		                        bilgisayar1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.RED);
		                        bilgisayarskorg�ster.setBackground(Color.GREEN);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ikilik"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
		                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
		                    		kontrol++;
		                    		oyuncu6.setEnabled(true);
		                    }
		                    }
		                }
		                if (random�zellik==1) {
		                    if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).get��l�k()>oyuncu.bbkartlistesi.get(bilgisayarse�indis).get��l�k()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ��l�k"+"\n Bu turu siz kazand�n�z tebrikler:)");
		                    	oyuncu.kbkartlistesi.get(1).setKartKullan�ld�M�(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu6.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
		                        kullan�c�1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.GREEN);
		                        bilgisayarskorg�ster.setBackground(Color.RED);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).get��l�k()<oyuncu.bbkartlistesi.get(bilgisayarse�indis).get��l�k()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ��l�k"+"\n Bu turu bilgisayar kazand� :(");
		                    	oyuncu.kbkartlistesi.get(1).setKartKullan�ld�M�(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu6.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
		                        bilgisayar1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.RED);
		                        bilgisayarskorg�ster.setBackground(Color.GREEN);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ��l�k"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
		                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
		                    		kontrol++;
		                    		oyuncu6.setEnabled(true);
		                    }
		                    }
		                }
		                if (random�zellik==2) {
		                    if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).getSerbestAt��()>oyuncu.bbkartlistesi.get(bilgisayarse�indis).getSerbestAt��()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest at��"+"\n Bu turu siz kazand�n�z tebrikler:)");
		                    	oyuncu.kbkartlistesi.get(1).setKartKullan�ld�M�(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu6.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
		                        kullan�c�1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.GREEN);
		                        bilgisayarskorg�ster.setBackground(Color.RED);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).getSerbestAt��()<oyuncu.bbkartlistesi.get(bilgisayarse�indis).getSerbestAt��()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest at��"+"\n Bu turu bilgisayar kazand� :(");
		                    	oyuncu.kbkartlistesi.get(1).setKartKullan�ld�M�(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu6.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
		                        bilgisayar1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.RED);
		                        bilgisayarskorg�ster.setBackground(Color.GREEN);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest at��"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
		                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
		                    		kontrol++;
		                    		oyuncu6.setEnabled(true);
		                    }
		                    }
		                }
		                if (kontrol==3) {
		                	sonu�g�ster.setText("Kartlar�n de�erlendirilen �zellikleri ayn�d�r oyun sona ermi�tir");
		                	oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
		                	oyuncu6.setVisible(false);
		                }
		            }
				});
				
				//buton7
				oyuncu7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0)  {
						oyuncu5.setEnabled(false);oyuncu6.setEnabled(false);oyuncu7.setEnabled(false);oyuncu8.setEnabled(false);
						oyuncu1.setEnabled(true);oyuncu2.setEnabled(true);oyuncu3.setEnabled(true);oyuncu4.setEnabled(true);
						Image label7img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kbkartlistesi.get(2).getBasketbolcuAd�()+".png")).getImage();
						oyuncubilgig�ster.setIcon(new ImageIcon(label7img));
						bilgisayarse�indis=random.nextInt(oyuncu.bbkartlistesi.size());
						Image labell7img=new ImageIcon(this.getClass().getResource("/"+oyuncu.bbkartlistesi.get(bilgisayarse�indis).getBasketbolcuAd�()+".png")).getImage();
						bilgisayarbilgig�ster.setIcon(new ImageIcon(labell7img));
						int kullan�c�se�indis=2;
						random�zellik=random.nextInt(3);
						if (oyuncu.bfkartlistesi.size()==0) {
		                    oyuncu5.setEnabled(true);oyuncu6.setEnabled(true);oyuncu7.setEnabled(true);oyuncu8.setEnabled(true); }
		                if (random�zellik==0) {
		                    if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).getIkilik()>oyuncu.bbkartlistesi.get(bilgisayarse�indis).getIkilik()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ikilik"+"\n Bu turu siz kazand�n�z tebrikler:)");
		                    	oyuncu.kbkartlistesi.get(2).setKartKullan�ld�M�(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu7.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
		                        kullan�c�1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.GREEN);
		                        bilgisayarskorg�ster.setBackground(Color.RED);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).getIkilik()<oyuncu.bbkartlistesi.get(bilgisayarse�indis).getIkilik()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ikilik"+"\n Bu turu bilgisayar kazand� :(");
		                    	oyuncu.kbkartlistesi.get(2).setKartKullan�ld�M�(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu7.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
		                        bilgisayar1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.RED);
		                        bilgisayarskorg�ster.setBackground(Color.GREEN);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ikilik"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
		                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
		                    		kontrol++;
		                    		oyuncu7.setEnabled(true);
		                    }
		                    }
		                }
		                if (random�zellik==1) {
		                    if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).get��l�k()>oyuncu.bbkartlistesi.get(bilgisayarse�indis).get��l�k()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ��l�k"+"\n Bu turu siz kazand�n�z tebrikler:)");
		                    	oyuncu.kbkartlistesi.get(2).setKartKullan�ld�M�(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu7.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
		                        kullan�c�1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.GREEN);
		                        bilgisayarskorg�ster.setBackground(Color.RED);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).get��l�k()<oyuncu.bbkartlistesi.get(bilgisayarse�indis).get��l�k()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ��l�k"+"\n Bu turu bilgisayar kazand� :(");
		                    	oyuncu.kbkartlistesi.get(2).setKartKullan�ld�M�(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu7.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
		                        bilgisayar1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.RED);
		                        bilgisayarskorg�ster.setBackground(Color.GREEN);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ��l�k"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
		                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
		                    		kontrol++;
		                    		oyuncu7.setEnabled(true);
		                    }
		                    }
		                }
		                if (random�zellik==2) {
		                    if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).getSerbestAt��()>oyuncu.bbkartlistesi.get(bilgisayarse�indis).getSerbestAt��()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest at��"+"\n Bu turu siz kazand�n�z tebrikler:)");
		                    	oyuncu.kbkartlistesi.get(2).setKartKullan�ld�M�(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu7.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
		                        kullan�c�1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.GREEN);
		                        bilgisayarskorg�ster.setBackground(Color.RED);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).getSerbestAt��()<oyuncu.bbkartlistesi.get(bilgisayarse�indis).getSerbestAt��()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest at��"+"\n Bu turu bilgisayar kazand� :(");
		                    	oyuncu.kbkartlistesi.get(2).setKartKullan�ld�M�(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu7.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
		                        bilgisayar1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.RED);
		                        bilgisayarskorg�ster.setBackground(Color.GREEN);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest at��"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
		                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
		                    		kontrol++;
		                    		oyuncu7.setEnabled(true);
		                    }
		                    }
		                }
		                if (kontrol==3) {
		                	sonu�g�ster.setText("Kartlar�n de�erlendirilen �zellikleri ayn�d�r oyun sona ermi�tir");
		                	oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
		                	oyuncu7.setVisible(false);
		                }
		            }
				});
				
				//buton8
				oyuncu8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0)  {
						oyuncu5.setEnabled(false);oyuncu6.setEnabled(false);oyuncu7.setEnabled(false);oyuncu8.setEnabled(false);
						oyuncu1.setEnabled(true);oyuncu2.setEnabled(true);oyuncu3.setEnabled(true);oyuncu4.setEnabled(true);
						Image label8img=new ImageIcon(this.getClass().getResource("/"+oyuncu.kbkartlistesi.get(3).getBasketbolcuAd�()+".png")).getImage();
						oyuncubilgig�ster.setIcon(new ImageIcon(label8img));
						bilgisayarse�indis=random.nextInt(oyuncu.bbkartlistesi.size());
						Image labell8img=new ImageIcon(this.getClass().getResource("/"+oyuncu.bbkartlistesi.get(bilgisayarse�indis).getBasketbolcuAd�()+".png")).getImage();
						bilgisayarbilgig�ster.setIcon(new ImageIcon(labell8img));
						int kullan�c�se�indis=3;
						random�zellik=random.nextInt(3);
						if (oyuncu.bfkartlistesi.size()==0) {
		                    oyuncu5.setEnabled(true);oyuncu6.setEnabled(true);oyuncu7.setEnabled(true);oyuncu8.setEnabled(true); }
		                if (random�zellik==0) {
		                    if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).getIkilik()>oyuncu.bbkartlistesi.get(bilgisayarse�indis).getIkilik()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ikilik"+"\n Bu turu siz kazand�n�z tebrikler:)");
		                    	oyuncu.kbkartlistesi.get(3).setKartKullan�ld�M�(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu8.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
		                        kullan�c�1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.GREEN);
		                        bilgisayarskorg�ster.setBackground(Color.RED);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).getIkilik()<oyuncu.bbkartlistesi.get(bilgisayarse�indis).getIkilik()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ikilik"+"\n Bu turu bilgisayar kazand� :(");
		                    	oyuncu.kbkartlistesi.get(3).setKartKullan�ld�M�(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu8.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
		                        bilgisayar1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.RED);
		                        bilgisayarskorg�ster.setBackground(Color.GREEN);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ikilik"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
		                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
		                    		kontrol++;
		                    		oyuncu8.setEnabled(true);
		                    }
		                    }
		                }
		                if (random�zellik==1) {
		                    if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).get��l�k()>oyuncu.bbkartlistesi.get(bilgisayarse�indis).get��l�k()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ��l�k"+"\n Bu turu siz kazand�n�z tebrikler:)");
		                    	oyuncu.kbkartlistesi.get(3).setKartKullan�ld�M�(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu8.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
		                        kullan�c�1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.GREEN);
		                        bilgisayarskorg�ster.setBackground(Color.RED);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).get��l�k()<oyuncu.bbkartlistesi.get(bilgisayarse�indis).get��l�k()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ��l�k"+"\n Bu turu bilgisayar kazand� :(");
		                    	oyuncu.kbkartlistesi.get(3).setKartKullan�ld�M�(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu8.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
		                        bilgisayar1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.RED);
		                        bilgisayarskorg�ster.setBackground(Color.GREEN);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum ��l�k"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
		                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
		                    		kontrol++;
		                    		oyuncu8.setEnabled(true);
		                    }
		                    }
		                }
		                if (random�zellik==2) {
		                    if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).getSerbestAt��()>oyuncu.bbkartlistesi.get(bilgisayarse�indis).getSerbestAt��()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest at��"+"\n Bu turu siz kazand�n�z tebrikler:)");
		                    	oyuncu.kbkartlistesi.get(3).setKartKullan�ld�M�(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu8.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
		                        kullan�c�1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.GREEN);
		                        bilgisayarskorg�ster.setBackground(Color.RED);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else if (oyuncu.kbkartlistesi.get(kullan�c�se�indis).getSerbestAt��()<oyuncu.bbkartlistesi.get(bilgisayarse�indis).getSerbestAt��()) {
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest at��"+"\n Bu turu bilgisayar kazand� :(");
		                    	oyuncu.kbkartlistesi.get(3).setKartKullan�ld�M�(true);
		                    	oyuncu.bbkartlistesi.get(bilgisayarse�indis).setKartKullan�ld�M�(true);
		                        oyuncu8.setVisible(false);
		                        oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
		                        bilgisayar1.setSkor();
		                        kullan�c�skorg�ster.setBackground(Color.RED);
		                        bilgisayarskorg�ster.setBackground(Color.GREEN);
		                        kullan�c�skorg�ster.setText(Integer.toString(kullan�c�1.getSkor()));
		        				bilgisayarskorg�ster.setText(Integer.toString(bilgisayar1.getSkor()));
		                    }
		                    else{
		                    	sonu�g�ster.setText("Kar��la�t�r�l�cak durum serbest at��"+"\n Bu tur berabere sonu�land� kartlar geri verildi");
		                    	if (oyuncu.bbkartlistesi.size()==1 && oyuncu.bfkartlistesi.size()==0) {
		                    		sonu�g�ster.setText("Son kartlar oldu�u i�in yeni �zellik ile de�erlendirilecektir"+"\nL�tfen bir daha kart se�imi yap�n�z");
		                    		kontrol++;
		                    		oyuncu8.setEnabled(true);
		                    }
		                    }
		                }
		                if (kontrol==3) {
		                	sonu�g�ster.setText("Kartlar�n de�erlendirilen �zellikleri ayn�d�r oyun sona ermi�tir");
		                	oyuncu.bbkartlistesi.remove(bilgisayarse�indis);
		                	oyuncu8.setVisible(false);
		                }
		            }
				});
				
				sonu�.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String mesaj;
						if(oyuncu.bbkartlistesi.isEmpty() && oyuncu.bfkartlistesi.isEmpty())
						{
							if (kullan�c�1.getSkor()>bilgisayar1.getSkor())
							{
								mesaj=kullan�c�1.getOyuncuAd�().toUpperCase()+"= "+kullan�c�1.getSkor()+"\n"+bilgisayar1.getOyuncuAd�().toUpperCase()+"= "+bilgisayar1.getSkor()+"\n"+"Oyunu "+kullan�c�1.getOyuncuAd�().toUpperCase()+" kazand� ";
						}
							else if(kullan�c�1.getSkor()<bilgisayar1.getSkor()) {
								mesaj=kullan�c�1.getOyuncuAd�().toUpperCase()+"= "+kullan�c�1.getSkor()+"\n"+bilgisayar1.getOyuncuAd�().toUpperCase()+"= "+bilgisayar1.getSkor()+"\n"+"Oyunu "+bilgisayar1.getOyuncuAd�().toUpperCase()+" kazand� ";
							}
							else {
								mesaj=kullan�c�1.getOyuncuAd�().toUpperCase()+"= "+kullan�c�1.getSkor()+"\n"+bilgisayar1.getOyuncuAd�().toUpperCase()+"= "+bilgisayar1.getSkor()+"\n"+"Oyun berabere bitmi�tir";
							} 
							JOptionPane.showMessageDialog(contentPane, mesaj);
							System.exit(0);
						}
						else {
							JOptionPane.showMessageDialog(contentPane, "Oyununuz bitmedi.\nL�tfen devam ediniz");
						}
						
					}
				});
				
				 
		
		
		
	}
}
