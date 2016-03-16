package se.mah.k3lara.skaneAPI.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class SkanetrafikenGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtAvgngarFrn;
	private JTextField txtLinje;
	private JTextField txtMot;
	private JTextField txtAvgngOm;
	private JTextField txtHpl;
	private JTextField departure1;
	private JTextField tid1_1;
	private JTextField tid1_2;
	private JTextField tid1_3;
	private JTextField hpl1;
	private JTextField departure2;
	private JTextField tid2_1;
	private JTextField tid2_2;
	private JTextField tid2_3;
	private JTextField hpl2;
	private JTextField departure3;
	private JTextField tid3_1;
	private JTextField tid3_2;
	private JTextField tid3_3;
	private JTextField hpl3;
	private JTextField departure4;
	private JTextField tid4_1;
	private JTextField tid4_2;
	private JTextField tid4_3;
	private JTextField hpl4;
	private JTextField daparture5;
	private JTextField tid5_1;
	private JTextField tid5_2;
	private JTextField tid5_3;
	private JTextField hpl5;
	private JTextField departure6;
	private JTextField tid6_1;
	private JTextField tid6_2;
	private JTextField tid6_3;
	private JTextField hpl6;
	private JTextField departure7;
	private JTextField tid7_1;
	private JTextField tid7_2;
	private JTextField tid7_3;
	private JTextField hpl7;
	private JTextField departure8;
	private JTextField tid8_1;
	private JTextField tid8_2;
	private JTextField tid8_3;
	private JTextField hpl8;
	private JTextField departure9;
	private JTextField tid9_1;
	private JTextField tid9_2;
	private JTextField tid9_3;
	private JTextField hpl9;
	private JTextField departure10;
	private JTextField tid10_1;
	private JTextField tid10_2;
	private JTextField tid10_3;
	private JTextField hpl10;
	private JTextField departure11;
	private JTextField tid11_1;
	private JTextField tid11_2;
	private JTextField tid11_3;
	private JTextField hpl11;
	private JLabel buss2;
	private JLabel buss3;
	private JLabel buss4;
	private JLabel buss5;
	private JLabel buss6;
	private JLabel buss7;
	private JLabel buss8;
	private JLabel buss9;
	private JLabel buss10;
	private JLabel buss11;
	private JTextField bussnr1;
	private JTextField bussnr2;
	private JTextField bussnr3;
	private JTextField bussnr4;
	private JTextField bussnr5;
	private JTextField bussnr6;
	private JTextField bussnr7;
	private JTextField bussnr8;
	private JTextField bussnr9;
	private JTextField bussnr10;
	private JTextField bussnr11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkanetrafikenGUI frame = new SkanetrafikenGUI();
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
	public SkanetrafikenGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 320, 326);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtAvgngarFrn = new JTextField();
		txtAvgngarFrn.setEditable(false);
		txtAvgngarFrn.setText("Avgångar från Malmö C");
		txtAvgngarFrn.setBounds(0, 0, 314, 26);
		panel.add(txtAvgngarFrn);
		txtAvgngarFrn.setColumns(10);
		
		txtLinje = new JTextField();
		txtLinje.setText("Linje:");
		txtLinje.setBounds(0, 25, 49, 26);
		panel.add(txtLinje);
		txtLinje.setColumns(10);
		
		txtMot = new JTextField();
		txtMot.setText("Mot:");
		txtMot.setBounds(47, 25, 87, 26);
		panel.add(txtMot);
		txtMot.setColumns(10);
		
		txtAvgngOm = new JTextField();
		txtAvgngOm.setText("Avgång om:");
		txtAvgngOm.setBounds(132, 25, 113, 26);
		panel.add(txtAvgngOm);
		txtAvgngOm.setColumns(10);
		
		txtHpl = new JTextField();
		txtHpl.setText("Hpl:");
		txtHpl.setBounds(244, 25, 70, 26);
		panel.add(txtHpl);
		txtHpl.setColumns(10);
		
		JLabel buss1 = new JLabel("");
		buss1.setBounds(0, 49, 25, 16);
		panel.add(buss1);
		
		departure1 = new JTextField();
		departure1.setText("Limhamn");
		departure1.setBounds(47, 46, 87, 26);
		panel.add(departure1);
		departure1.setColumns(10);
		
		tid1_1 = new JTextField();
		tid1_1.setBounds(132, 46, 42, 26);
		panel.add(tid1_1);
		tid1_1.setColumns(10);
		
		tid1_2 = new JTextField();
		tid1_2.setColumns(10);
		tid1_2.setBounds(167, 46, 42, 26);
		panel.add(tid1_2);
		
		tid1_3 = new JTextField();
		tid1_3.setColumns(10);
		tid1_3.setBounds(202, 46, 43, 26);
		panel.add(tid1_3);
		
		hpl1 = new JTextField();
		hpl1.setBounds(244, 46, 70, 26);
		panel.add(hpl1);
		hpl1.setColumns(10);
		
		departure2 = new JTextField();
		departure2.setColumns(10);
		departure2.setBounds(47, 69, 87, 26);
		panel.add(departure2);
		
		tid2_1 = new JTextField();
		tid2_1.setColumns(10);
		tid2_1.setBounds(132, 69, 42, 26);
		panel.add(tid2_1);
		
		tid2_2 = new JTextField();
		tid2_2.setColumns(10);
		tid2_2.setBounds(167, 69, 42, 26);
		panel.add(tid2_2);
		
		tid2_3 = new JTextField();
		tid2_3.setColumns(10);
		tid2_3.setBounds(202, 69, 42, 26);
		panel.add(tid2_3);
		
		hpl2 = new JTextField();
		hpl2.setColumns(10);
		hpl2.setBounds(244, 69, 70, 26);
		panel.add(hpl2);
		
		departure3 = new JTextField();
		departure3.setColumns(10);
		departure3.setBounds(47, 92, 87, 26);
		panel.add(departure3);
		
		tid3_1 = new JTextField();
		tid3_1.setColumns(10);
		tid3_1.setBounds(132, 92, 42, 26);
		panel.add(tid3_1);
		
		tid3_2 = new JTextField();
		tid3_2.setColumns(10);
		tid3_2.setBounds(167, 92, 42, 26);
		panel.add(tid3_2);
		
		tid3_3 = new JTextField();
		tid3_3.setColumns(10);
		tid3_3.setBounds(202, 92, 42, 26);
		panel.add(tid3_3);
		
		hpl3 = new JTextField();
		hpl3.setColumns(10);
		hpl3.setBounds(244, 92, 70, 26);
		panel.add(hpl3);
		
		departure4 = new JTextField();
		departure4.setColumns(10);
		departure4.setBounds(47, 115, 87, 26);
		panel.add(departure4);
		
		tid4_1 = new JTextField();
		tid4_1.setColumns(10);
		tid4_1.setBounds(132, 115, 42, 26);
		panel.add(tid4_1);
		
		tid4_2 = new JTextField();
		tid4_2.setColumns(10);
		tid4_2.setBounds(167, 115, 42, 26);
		panel.add(tid4_2);
		
		tid4_3 = new JTextField();
		tid4_3.setColumns(10);
		tid4_3.setBounds(202, 115, 42, 26);
		panel.add(tid4_3);
		
		hpl4 = new JTextField();
		hpl4.setColumns(10);
		hpl4.setBounds(244, 115, 70, 26);
		panel.add(hpl4);
		
		daparture5 = new JTextField();
		daparture5.setColumns(10);
		daparture5.setBounds(47, 138, 87, 26);
		panel.add(daparture5);
		
		tid5_1 = new JTextField();
		tid5_1.setColumns(10);
		tid5_1.setBounds(132, 138, 42, 26);
		panel.add(tid5_1);
		
		tid5_2 = new JTextField();
		tid5_2.setColumns(10);
		tid5_2.setBounds(167, 138, 42, 26);
		panel.add(tid5_2);
		
		tid5_3 = new JTextField();
		tid5_3.setColumns(10);
		tid5_3.setBounds(202, 138, 42, 26);
		panel.add(tid5_3);
		
		hpl5 = new JTextField();
		hpl5.setColumns(10);
		hpl5.setBounds(244, 138, 70, 26);
		panel.add(hpl5);
		
		departure6 = new JTextField();
		departure6.setColumns(10);
		departure6.setBounds(47, 161, 87, 26);
		panel.add(departure6);
		
		tid6_1 = new JTextField();
		tid6_1.setColumns(10);
		tid6_1.setBounds(132, 161, 42, 26);
		panel.add(tid6_1);
		
		tid6_2 = new JTextField();
		tid6_2.setColumns(10);
		tid6_2.setBounds(167, 161, 42, 26);
		panel.add(tid6_2);
		
		tid6_3 = new JTextField();
		tid6_3.setColumns(10);
		tid6_3.setBounds(202, 161, 42, 26);
		panel.add(tid6_3);
		
		hpl6 = new JTextField();
		hpl6.setColumns(10);
		hpl6.setBounds(244, 161, 70, 26);
		panel.add(hpl6);
		
		departure7 = new JTextField();
		departure7.setColumns(10);
		departure7.setBounds(47, 184, 87, 26);
		panel.add(departure7);
		
		tid7_1 = new JTextField();
		tid7_1.setColumns(10);
		tid7_1.setBounds(132, 184, 42, 26);
		panel.add(tid7_1);
		
		tid7_2 = new JTextField();
		tid7_2.setColumns(10);
		tid7_2.setBounds(167, 184, 42, 26);
		panel.add(tid7_2);
		
		tid7_3 = new JTextField();
		tid7_3.setColumns(10);
		tid7_3.setBounds(202, 184, 42, 26);
		panel.add(tid7_3);
		
		hpl7 = new JTextField();
		hpl7.setColumns(10);
		hpl7.setBounds(244, 184, 70, 26);
		panel.add(hpl7);
		
		departure8 = new JTextField();
		departure8.setColumns(10);
		departure8.setBounds(47, 207, 87, 26);
		panel.add(departure8);
		
		tid8_1 = new JTextField();
		tid8_1.setColumns(10);
		tid8_1.setBounds(132, 207, 42, 26);
		panel.add(tid8_1);
		
		tid8_2 = new JTextField();
		tid8_2.setColumns(10);
		tid8_2.setBounds(167, 207, 42, 26);
		panel.add(tid8_2);
		
		tid8_3 = new JTextField();
		tid8_3.setColumns(10);
		tid8_3.setBounds(202, 207, 42, 26);
		panel.add(tid8_3);
		
		hpl8 = new JTextField();
		hpl8.setColumns(10);
		hpl8.setBounds(244, 207, 70, 26);
		panel.add(hpl8);
		
		departure9 = new JTextField();
		departure9.setColumns(10);
		departure9.setBounds(47, 230, 87, 26);
		panel.add(departure9);
		
		tid9_1 = new JTextField();
		tid9_1.setColumns(10);
		tid9_1.setBounds(132, 230, 42, 26);
		panel.add(tid9_1);
		
		tid9_2 = new JTextField();
		tid9_2.setColumns(10);
		tid9_2.setBounds(167, 230, 42, 26);
		panel.add(tid9_2);
		
		tid9_3 = new JTextField();
		tid9_3.setColumns(10);
		tid9_3.setBounds(202, 230, 42, 26);
		panel.add(tid9_3);
		
		hpl9 = new JTextField();
		hpl9.setColumns(10);
		hpl9.setBounds(244, 230, 70, 26);
		panel.add(hpl9);
		
		departure10 = new JTextField();
		departure10.setColumns(10);
		departure10.setBounds(47, 253, 87, 26);
		panel.add(departure10);
		
		tid10_1 = new JTextField();
		tid10_1.setColumns(10);
		tid10_1.setBounds(132, 253, 42, 26);
		panel.add(tid10_1);
		
		tid10_2 = new JTextField();
		tid10_2.setColumns(10);
		tid10_2.setBounds(167, 253, 42, 26);
		panel.add(tid10_2);
		
		tid10_3 = new JTextField();
		tid10_3.setColumns(10);
		tid10_3.setBounds(202, 253, 42, 26);
		panel.add(tid10_3);
		
		hpl10 = new JTextField();
		hpl10.setColumns(10);
		hpl10.setBounds(244, 253, 70, 26);
		panel.add(hpl10);
		
		departure11 = new JTextField();
		departure11.setColumns(10);
		departure11.setBounds(47, 276, 87, 26);
		panel.add(departure11);
		
		tid11_1 = new JTextField();
		tid11_1.setColumns(10);
		tid11_1.setBounds(132, 276, 42, 26);
		panel.add(tid11_1);
		
		tid11_2 = new JTextField();
		tid11_2.setColumns(10);
		tid11_2.setBounds(167, 276, 42, 26);
		panel.add(tid11_2);
		
		tid11_3 = new JTextField();
		tid11_3.setColumns(10);
		tid11_3.setBounds(202, 276, 42, 26);
		panel.add(tid11_3);
		
		hpl11 = new JTextField();
		hpl11.setColumns(10);
		hpl11.setBounds(244, 276, 70, 26);
		panel.add(hpl11);
		
		buss2 = new JLabel("");
		buss2.setBounds(0, 73, 25, 16);
		panel.add(buss2);
		
		buss3 = new JLabel("");
		buss3.setBounds(0, 97, 25, 16);
		panel.add(buss3);
		
		buss4 = new JLabel("");
		buss4.setBounds(0, 120, 25, 16);
		panel.add(buss4);
		
		buss5 = new JLabel("");
		buss5.setBounds(0, 143, 25, 16);
		panel.add(buss5);
		
		buss6 = new JLabel("");
		buss6.setBounds(0, 166, 25, 16);
		panel.add(buss6);
		
		buss7 = new JLabel("");
		buss7.setBounds(0, 189, 25, 16);
		panel.add(buss7);
		
		buss8 = new JLabel("");
		buss8.setBounds(0, 212, 25, 16);
		panel.add(buss8);
		
		buss9 = new JLabel("");
		buss9.setBounds(0, 235, 25, 16);
		panel.add(buss9);
		
		buss10 = new JLabel("");
		buss10.setBounds(0, 258, 25, 16);
		panel.add(buss10);
		
		buss11 = new JLabel("");
		buss11.setBounds(0, 281, 25, 16);
		panel.add(buss11);
		
		bussnr1 = new JTextField();
		bussnr1.setColumns(10);
		bussnr1.setBounds(24, 46, 25, 26);
		panel.add(bussnr1);
		
		bussnr2 = new JTextField();
		bussnr2.setColumns(10);
		bussnr2.setBounds(24, 69, 25, 26);
		panel.add(bussnr2);
		
		bussnr3 = new JTextField();
		bussnr3.setColumns(10);
		bussnr3.setBounds(24, 92, 25, 26);
		panel.add(bussnr3);
		
		bussnr4 = new JTextField();
		bussnr4.setColumns(10);
		bussnr4.setBounds(24, 115, 25, 26);
		panel.add(bussnr4);
		
		bussnr5 = new JTextField();
		bussnr5.setColumns(10);
		bussnr5.setBounds(24, 138, 25, 26);
		panel.add(bussnr5);
		
		bussnr6 = new JTextField();
		bussnr6.setColumns(10);
		bussnr6.setBounds(24, 161, 25, 26);
		panel.add(bussnr6);
		
		bussnr7 = new JTextField();
		bussnr7.setColumns(10);
		bussnr7.setBounds(24, 184, 25, 26);
		panel.add(bussnr7);
		
		bussnr8 = new JTextField();
		bussnr8.setColumns(10);
		bussnr8.setBounds(24, 207, 25, 26);
		panel.add(bussnr8);
		
		bussnr9 = new JTextField();
		bussnr9.setColumns(10);
		bussnr9.setBounds(24, 230, 25, 26);
		panel.add(bussnr9);
		
		bussnr10 = new JTextField();
		bussnr10.setColumns(10);
		bussnr10.setBounds(24, 253, 25, 26);
		panel.add(bussnr10);
		
		bussnr11 = new JTextField();
		bussnr11.setColumns(10);
		bussnr11.setBounds(24, 276, 25, 26);
		panel.add(bussnr11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(327, 6, 307, 326);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
	}
}
