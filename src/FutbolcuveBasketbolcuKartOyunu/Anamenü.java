package FutbolcuveBasketbolcuKartOyunu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Anamen� extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Anamen� frame = new Anamen�();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Anamen�() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton oyna = new JButton("");
		Image imgoyna=new ImageIcon(this.getClass().getResource("/OYNA.png")).getImage();
		oyna.setIcon(new ImageIcon(imgoyna));
		
		oyna.setFont(new Font("Stencil", Font.PLAIN, 17));
		oyna.setBounds(661, 226, 160, 81);
		contentPane.add(oyna);
		
		JButton ��k�� = new JButton("");
		Image img��k��=new ImageIcon(this.getClass().getResource("/CIKIS.png")).getImage();
		��k��.setIcon(new ImageIcon(img��k��));
		
		��k��.setFont(new Font("Stencil", Font.PLAIN, 17));
		��k��.setBounds(661, 471, 160, 81);
		contentPane.add(��k��);
		
		JLabel arkaplan = new JLabel("");
		Image imgarkaplan=new ImageIcon(this.getClass().getResource("/anamenu.png")).getImage();
		arkaplan.setIcon(new ImageIcon(imgarkaplan));
		arkaplan.setBounds(0, 0, 1530, 835);
		contentPane.add(arkaplan);
		
		oyna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Test oyun =new Test();
				oyun.setVisible(true);
				
			}
		});
		��k��.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}

}
