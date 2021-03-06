package se.mah.k3lara.skaneAPI.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import klockan.ClockLogic;
import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Line;
import se.mah.k3lara.skaneAPI.model.Lines;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.view.*;
//import se.mah.k3lara.skaneAPI.view.timeTableLogic.getBernstorp;
//import se.mah.k3lara.skaneAPI.view.timeTableLogic.getSegevang;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;

import javax.swing.ImageIcon;
import java.awt.SystemColor;



public class SkanetrafikenGUI extends JFrame {

	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public double width = 1920;//screenSize.getWidth();
	public double height = 1080;//screenSize.getHeight();
	
	
	

	public JPanel contentPane;
	public Color red = new Color(195, 0, 45);
	public Color grey = new Color(228, 231, 226);
	public Color darkGrey = new Color(187, 192, 188);
	public Color lightGrey = new Color(250, 250, 250);
	public JTextField txtAv;
	public JTextField txtLinje;
	public JTextField txtMot;
	public JTextField txtNstaAvgng;
	public JTextField txtHpl;
	public JTextField textField_2;
	public JTextField txtA;
	public JTextField textField_4;
	public JTextField textField_5;
	public JTextField textField_6;
	public JTextField textField_7;
	public JLabel lblNewLabel;
	public JLabel label;
	public JTextField textField_8;
	public JTextField textField_9;
	public JTextField textField_10;
	public JTextField textField_11;
	public JTextField textField_12;
	public JTextField txtC;
	public JLabel label_1;
	public JTextField textField_14;
	public JTextField textField_15;
	public JTextField textField_16;
	public JTextField textField_17;
	public JTextField textField_18;
	public JTextField txtE;
	public JLabel label_2;
	public JTextField textField_20;
	public JTextField textField_21;
	public JTextField textField_22;
	public JTextField textField_23;
	public JTextField textField_24;
	public JTextField txtE_1;
	public JLabel label_3;
	public JTextField textField_26;
	public JTextField textField_27;
	public JTextField textField_28;
	public JTextField textField_29;
	public JTextField textField_30;
	public JTextField txtD;
	public JLabel label_4;
	public JTextField textField_32;
	public JTextField textField_33;
	public JTextField textField_34;
	public JTextField textField_35;
	public JTextField textField_36;
	public JTextField txtC_1;
	public JLabel label_5;
	public JTextField textField_38;
	public JTextField textField_39;
	public JTextField textField_40;
	public JTextField textField_41;
	public JTextField textField_42;
	public JTextField txtE_2;
	public JLabel label_6;
	
	public JTextField textField_44;
	public JTextField textField_45;
	public JTextField textField_46;
	public JTextField textField_47;
	public JTextField textField_48;
	public JTextField txtC_2;
	public JLabel label_7;
	public JTextField textField_50;
	public JTextField textField_51;
	public JTextField textField_52;
	public JTextField textField_53;
	public JTextField textField_54;
	public JTextField txtI;
	public JTextField textField_56;
	public JTextField txtI_1;
	public JTextField textField_58;
	public JTextField textField_59;
	public JTextField textField_60;
	public JTextField textField_61;
	public JLabel label_8;
	public JLabel label_9;
	public JTextField textField_62;
	public JTextField textField_63;
	public JTextField textField_64;
	public JTextField textField_65;
	public JTextField textField_66;
	public JTextField txtI_2;
	public JLabel label_10;
	public JTextField textField_68;
	public JTextField textField_69;
	public JTextField textField_70;
	public JTextField textField_71;
	public JTextField textField_72;
	public JTextField txtG;
	public JTextField textField_74;
	public JTextField txtI_3;
	public JTextField textField_76;
	public JTextField textField_77;
	public JTextField textField_78;
	public JTextField textField_79;
	public JLabel label_11;
	public JLabel label_12;
	public JTextField textField_80;
	public JTextField textField_81;
	public JTextField textField_82;
	public JTextField textField_83;
	public JTextField textField_84;
	public JTextField textField_85;
	public JLabel label_13;
	public JTextField textField_86;
	public JTextField textField_87;
	public JTextField textField_88;
	public JTextField textField_89;
	public JTextField textField_90;
	public JTextField txtH;
	public JLabel label_14;
	public JTextField textField_92;
	public JTextField textField_93;
	public JTextField textField_94;
	public JTextField textField_95;
	public JTextField textField_96;
	public JTextField textField_97;
	public JLabel label_15;
	public JTextField textField_98;
	public JTextField textField_99;
	public JTextField textField_100;
	public JTextField textField_101;
	public JTextField textField_102;
	public JTextField textField_103;
	public JLabel lblNewLabel_1;
	public timeTableLogic Limhamn;
	public timeTableLogic Bernstorp;
	public timeTableLogic Segevang;
	public timeTableLogic Bunkeflostrand;
	public timeTableLogic Fullriggaren;
	public timeTableLogic Lindangen;
	public timeTableLogic OstraHamnen;
	public timeTableLogic Kaglinge;
	public timeTableLogic Falsterbo;
	public timeTableLogic Trelleborg;
	public timeTableLogic Vellinge;
	public timeTableLogic Svedala;
	public timeTableLogic Lomma;
	public timeTableLogic Kristianstad;
	public timeTableLogic Genarp;
	public timeTableLogic L�ngdalen;
	public timeTableLogic S_v�ng;
	public int sleepTime = 2000;
	public JLabel klockLabel;
public timeTableLogic TableLogic;
public ClockLogic clockLogic;




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
		
		
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBackground(lightGrey);

		JPanel panel_1 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(
						gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(panel, GroupLayout.PREFERRED_SIZE, 955,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 955,
												GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_contentPane
				.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1080,
												GroupLayout.PREFERRED_SIZE)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE))
				.addContainerGap()));
		panel_1.setLayout(null);
		
		try {
		     GraphicsEnvironment ge = 
		         GraphicsEnvironment.getLocalGraphicsEnvironment();
		     ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("OpenSans-Regular.ttf")));
		} catch (IOException|FontFormatException e) {
		     //Handle exception
		}

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(
		SkanetrafikenGUI.class.getResource("/se/mah/k3lara/skaneAPI/view/Grafiko-profilo (2).png")));
		lblNewLabel_1.setBounds(0, 0, 955, 1069);
		panel_1.add(lblNewLabel_1);
		panel.setLayout(null);
		
		klockLabel = new JLabel("");
		klockLabel.setForeground(Color.WHITE);
		klockLabel.setBounds(819, 0, 124, 42);
		klockLabel.setFont(new Font("OpenSans-Regular", Font.PLAIN, 30));
		panel.add(klockLabel);

		txtAv = new JTextField();
		txtAv.setForeground(Color.WHITE);
		txtAv.setEditable(false);
		txtAv.setFont(new Font("OpenSans-Regular", Font.PLAIN, 40));
		txtAv.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtAv.setText("Avg\u00E5ngar fr\u00E5n Malm\u00F6 central");
		txtAv.setBackground(red);
		txtAv.setBounds(12, 0, 931, 42);
		panel.add(txtAv);
		txtAv.setColumns(10);

		txtLinje = new JTextField();
		txtLinje.setForeground(Color.WHITE);
		txtLinje.setBackground(red);
		txtLinje.setFont(new Font("OpenSans-Regular", Font.PLAIN, 40));
		txtLinje.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtLinje.setText("Linje");
		txtLinje.setBounds(12, 47, 160, 42);
		panel.add(txtLinje);
		txtLinje.setColumns(10);

		txtMot = new JTextField();
		txtMot.setForeground(Color.WHITE);
		txtMot.setBackground(red);
		txtMot.setFont(new Font("OpenSans-Regular", Font.PLAIN, 40));
		txtMot.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtMot.setText("Mot");
		txtMot.setColumns(10);
		txtMot.setBounds(184, 47, 309, 42);
		panel.add(txtMot);

		txtNstaAvgng = new JTextField();
		txtNstaAvgng.setForeground(Color.WHITE);
		txtNstaAvgng.setBackground(red);
		txtNstaAvgng.setText("N\u00E4sta avg\u00E5ng");
		txtNstaAvgng.setFont(new Font("OpenSans-Regular", Font.PLAIN, 40));
		txtNstaAvgng.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtNstaAvgng.setColumns(10);
		txtNstaAvgng.setBounds(500, 47, 309, 42);
		panel.add(txtNstaAvgng);

		txtHpl = new JTextField();
		txtHpl.setForeground(Color.WHITE);
		txtHpl.setBackground(red);
		txtHpl.setText("Hpl");
		txtHpl.setFont(new Font("OpenSans-Regular", Font.PLAIN, 40));
		txtHpl.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtHpl.setColumns(10);
		txtHpl.setBounds(819, 47, 124, 42);
		panel.add(txtHpl);
		

		textField_2 = new JTextField();
		textField_2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_2.setFont(new Font("OpenSans-Regular", Font.PLAIN, 30));
		textField_2.setColumns(10);
		textField_2.setBounds(184, 98, 309, 42);
		panel.add(textField_2);

		txtA = new JTextField();
		txtA.setText("C");
		txtA.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtA.setFont(new Font("OpenSans-Regular", Font.BOLD, 30));
		txtA.setColumns(10);
		txtA.setBounds(819, 98, 124, 42);
		panel.add(txtA);

		textField_4 = new JTextField();
		textField_4.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_4.setBounds(92, 98, 80, 42);
		textField_4.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_5.setColumns(10);
		textField_5.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_5.setBounds(500, 98, 103, 42);
		panel.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_6.setColumns(10);
		textField_6.setBounds(603, 98, 103, 42);
		textField_6.setFont(new Font("Dialog", Font.ITALIC, 26));
		panel.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_7.setColumns(10);
		textField_7.setBounds(706, 98, 103, 42);
		textField_7.setFont(new Font("Dialog", Font.ITALIC, 22));
		panel.add(textField_7);

		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(SkanetrafikenGUI.class.getResource("/se/mah/k3lara/skaneAPI/view/Buss.PNG")));
		lblNewLabel.setBounds(22, 98, 42, 42);
		panel.add(lblNewLabel);

		label = new JLabel("New label");
		label.setIcon(new ImageIcon(SkanetrafikenGUI.class.getResource("/se/mah/k3lara/skaneAPI/view/Buss.PNG")));
		label.setBounds(22, 153, 42, 42);
		panel.add(label);

		textField_8 = new JTextField();
		textField_8.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_8.setBackground(grey);
		textField_8.setColumns(10);
		textField_8.setBounds(92, 153, 80, 42);
		textField_8.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_9.setBackground(grey);
		textField_9.setFont(new Font("OpenSans-Regular", Font.PLAIN, 30));
		textField_9.setColumns(10);
		textField_9.setBounds(184, 153, 309, 42);
		panel.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_10.setBackground(grey);
		textField_10.setColumns(10);
		textField_10.setBounds(500, 153, 103, 42);
		textField_10.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_11.setBackground(grey);
		textField_11.setColumns(10);
		textField_11.setBounds(603, 153, 103, 42);
		textField_11.setFont(new Font("Dialog", Font.ITALIC, 26));
		panel.add(textField_11);

		textField_12 = new JTextField();
		textField_12.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_12.setBackground(grey);
		textField_12.setColumns(10);
		textField_12.setBounds(706, 153, 103, 42);
		textField_12.setFont(new Font("Dialog", Font.ITALIC, 22));
		panel.add(textField_12);

		txtC = new JTextField();
		txtC.setText("C");
		txtC.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtC.setBackground(grey);
		txtC.setFont(new Font("OpenSans-Regular", Font.BOLD, 30));
		txtC.setColumns(10);
		txtC.setBounds(819, 153, 124, 42);
		panel.add(txtC);

		label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon(SkanetrafikenGUI.class.getResource("/se/mah/k3lara/skaneAPI/view/Buss.PNG")));
		label_1.setBounds(22, 208, 42, 42);
		panel.add(label_1);

		textField_14 = new JTextField();
		textField_14.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_14.setColumns(10);
		textField_14.setBounds(92, 208, 80, 42);
		textField_14.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_14);

		textField_15 = new JTextField();
		textField_15.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_15.setFont(new Font("OpenSans-Regular", Font.PLAIN, 30));
		textField_15.setColumns(10);
		textField_15.setBounds(184, 208, 309, 42);
		panel.add(textField_15);

		textField_16 = new JTextField();
		textField_16.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_16.setColumns(10);
		textField_16.setBounds(500, 208, 103, 42);
		textField_16.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_16);

		textField_17 = new JTextField();
		textField_17.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_17.setColumns(10);
		textField_17.setBounds(603, 208, 103, 42);
		textField_17.setFont(new Font("Dialog", Font.ITALIC, 26));
		panel.add(textField_17);

		textField_18 = new JTextField();
		textField_18.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_18.setColumns(10);
		textField_18.setBounds(706, 208, 103, 42);
		textField_18.setFont(new Font("Dialog", Font.ITALIC, 22));
		panel.add(textField_18);

		txtE = new JTextField();
		txtE.setText("E");
		txtE.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtE.setFont(new Font("OpenSans-Regular", Font.BOLD, 30));
		txtE.setColumns(10);
		txtE.setBounds(819, 208, 124, 42);
		panel.add(txtE);

		label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon(SkanetrafikenGUI.class.getResource("/se/mah/k3lara/skaneAPI/view/Buss.PNG")));
		label_2.setBounds(22, 263, 42, 42);
		panel.add(label_2);

		textField_20 = new JTextField();
		textField_20.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_20.setBackground(grey);
		textField_20.setColumns(10);
		textField_20.setBounds(92, 263, 80, 42);
		textField_20.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_20);

		textField_21 = new JTextField();
		textField_21.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_21.setBackground(grey);
		textField_21.setFont(new Font("OpenSans-Regular", Font.PLAIN, 30));
		textField_21.setColumns(10);
		textField_21.setBounds(184, 263, 309, 42);
		panel.add(textField_21);

		textField_22 = new JTextField();
		textField_22.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_22.setBackground(grey);
		textField_22.setColumns(10);
		textField_22.setBounds(500, 263, 103, 42);
		textField_22.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_22);

		textField_23 = new JTextField();
		textField_23.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_23.setBackground(grey);
		textField_23.setColumns(10);
		textField_23.setBounds(603, 263, 103, 42);
		textField_23.setFont(new Font("Dialog", Font.ITALIC, 26));
		panel.add(textField_23);

		textField_24 = new JTextField();
		textField_24.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_24.setBackground(grey);
		textField_24.setColumns(10);
		textField_24.setBounds(706, 263, 103, 42);
		textField_24.setFont(new Font("Dialog", Font.ITALIC, 22));
		panel.add(textField_24);

		txtE_1 = new JTextField();
		txtE_1.setText("E");
		txtE_1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtE_1.setBackground(grey);
		txtE_1.setFont(new Font("OpenSans-Regular", Font.BOLD, 30));
		txtE_1.setColumns(10);
		txtE_1.setBounds(819, 263, 124, 42);
		panel.add(txtE_1);

		label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon(SkanetrafikenGUI.class.getResource("/se/mah/k3lara/skaneAPI/view/Buss.PNG")));
		label_3.setBounds(22, 318, 42, 42);
		panel.add(label_3);

		textField_26 = new JTextField();
		textField_26.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_26.setColumns(10);
		textField_26.setBounds(92, 318, 80, 42);
		textField_26.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_26);

		textField_27 = new JTextField();
		textField_27.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_27.setFont(new Font("OpenSans-Regular", Font.PLAIN, 30));
		textField_27.setColumns(10);
		textField_27.setBounds(184, 318, 309, 42);
		panel.add(textField_27);

		textField_28 = new JTextField();
		textField_28.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_28.setColumns(10);
		textField_28.setBounds(500, 318, 103, 42);
		textField_28.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_28);

		textField_29 = new JTextField();
		textField_29.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_29.setColumns(10);
		textField_29.setBounds(603, 318, 103, 42);
		textField_29.setFont(new Font("Dialog", Font.ITALIC, 26));
		panel.add(textField_29);

		textField_30 = new JTextField();
		textField_30.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_30.setColumns(10);
		textField_30.setBounds(706, 318, 103, 42);
		textField_30.setFont(new Font("Dialog", Font.ITALIC, 22));
		panel.add(textField_30);

		txtD = new JTextField();
		txtD.setText("D");
		txtD.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtD.setFont(new Font("OpenSans-Regular", Font.BOLD, 30));
		txtD.setColumns(10);
		txtD.setBounds(819, 318, 124, 42);
		panel.add(txtD);

		label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon(SkanetrafikenGUI.class.getResource("/se/mah/k3lara/skaneAPI/view/Buss.PNG")));
		label_4.setBounds(22, 373, 42, 42);
		panel.add(label_4);

		textField_32 = new JTextField();
		textField_32.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_32.setBackground(grey);
		textField_32.setColumns(10);
		textField_32.setBounds(92, 373, 80, 42);
		textField_32.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_32);

		textField_33 = new JTextField();
		textField_33.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_33.setBackground(grey);
		textField_33.setFont(new Font("OpenSans-Regular", Font.PLAIN, 30));
		textField_33.setColumns(10);
		textField_33.setBounds(184, 373, 309, 42);
		panel.add(textField_33);

		textField_34 = new JTextField();
		textField_34.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_34.setBackground(grey);
		textField_34.setColumns(10);
		textField_34.setBounds(500, 373, 103, 42);
		textField_34.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_34);

		textField_35 = new JTextField();
		textField_35.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_35.setBackground(grey);
		textField_35.setColumns(10);
		textField_35.setBounds(603, 373, 103, 42);
		textField_35.setFont(new Font("Dialog", Font.ITALIC, 26));
		panel.add(textField_35);

		textField_36 = new JTextField();
		textField_36.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_36.setBackground(grey);
		textField_36.setColumns(10);
		textField_36.setBounds(706, 373, 103, 42);
		textField_36.setFont(new Font("Dialog", Font.ITALIC, 22));
		panel.add(textField_36);

		txtC_1 = new JTextField();
		txtC_1.setText("C");
		txtC_1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtC_1.setBackground(grey);
		txtC_1.setFont(new Font("OpenSans-Regular", Font.BOLD, 30));
		txtC_1.setColumns(10);
		txtC_1.setBounds(819, 373, 124, 42);
		panel.add(txtC_1);

		label_5 = new JLabel("New label");
		label_5.setIcon(new ImageIcon(SkanetrafikenGUI.class.getResource("/se/mah/k3lara/skaneAPI/view/Buss.PNG")));
		label_5.setBounds(22, 425, 42, 42);
		panel.add(label_5);

		textField_38 = new JTextField();
		textField_38.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_38.setColumns(10);
		textField_38.setBounds(92, 425, 80, 42);
		textField_38.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_38);

		textField_39 = new JTextField();
		textField_39.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_39.setFont(new Font("OpenSans-Regular", Font.PLAIN, 30));
		textField_39.setColumns(10);
		textField_39.setBounds(184, 425, 309, 42);
		panel.add(textField_39);

		textField_40 = new JTextField();
		textField_40.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_40.setColumns(10);
		textField_40.setBounds(500, 425, 103, 42);
		textField_40.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_40);

		textField_41 = new JTextField();
		textField_41.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_41.setColumns(10);
		textField_41.setBounds(603, 425, 103, 42);
		textField_41.setFont(new Font("Dialog", Font.ITALIC, 26));
		panel.add(textField_41);

		textField_42 = new JTextField();
		textField_42.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_42.setColumns(10);
		textField_42.setBounds(706, 425, 103, 42);
		textField_42.setFont(new Font("Dialog", Font.ITALIC, 22));
		panel.add(textField_42);

		txtE_2 = new JTextField();
		txtE_2.setText("E");
		txtE_2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtE_2.setFont(new Font("OpenSans-Regular", Font.BOLD, 30));
		txtE_2.setColumns(10);
		txtE_2.setBounds(819, 425, 124, 42);
		panel.add(txtE_2);

		label_6 = new JLabel("New label");
		label_6.setIcon(new ImageIcon(SkanetrafikenGUI.class.getResource("/se/mah/k3lara/skaneAPI/view/Buss.PNG")));
		label_6.setBounds(22, 479, 42, 42);
		panel.add(label_6);

		textField_44 = new JTextField();
		textField_44.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_44.setBackground(grey);
		textField_44.setColumns(10);
		textField_44.setBounds(92, 479, 80, 42);
		textField_44.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_44);

		textField_45 = new JTextField();
		textField_45.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_45.setBackground(grey);
		textField_45.setFont(new Font("OpenSans-Regular", Font.PLAIN, 30));
		textField_45.setColumns(10);
		textField_45.setBounds(184, 479, 309, 42);
		panel.add(textField_45);

		textField_46 = new JTextField();
		textField_46.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_46.setBackground(grey);
		textField_46.setColumns(10);
		textField_46.setBounds(500, 479, 103, 42);
		textField_46.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_46);

		textField_47 = new JTextField();
		textField_47.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_47.setBackground(grey);
		textField_47.setColumns(10);
		textField_47.setBounds(603, 479, 103, 42);
		textField_47.setFont(new Font("Dialog", Font.ITALIC, 26));
		panel.add(textField_47);

		textField_48 = new JTextField();
		textField_48.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_48.setBackground(grey);
		textField_48.setColumns(10);
		textField_48.setBounds(706, 479, 103, 42);
		textField_48.setFont(new Font("Dialog", Font.ITALIC, 22));
		panel.add(textField_48);

		txtC_2 = new JTextField();
		txtC_2.setText("C");
		txtC_2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtC_2.setBackground(grey);
		txtC_2.setFont(new Font("OpenSans-Regular", Font.BOLD, 30));
		txtC_2.setColumns(10);
		txtC_2.setBounds(819, 479, 124, 42);
		panel.add(txtC_2);

		label_7 = new JLabel("New label");
		label_7.setIcon(new ImageIcon(SkanetrafikenGUI.class.getResource("/se/mah/k3lara/skaneAPI/view/BussGul.png")));
		label_7.setBounds(22, 534, 42, 42);
		panel.add(label_7);

		textField_50 = new JTextField();
		textField_50.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_50.setColumns(10);
		textField_50.setBounds(92, 534, 80, 42);
		textField_50.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_50);

		textField_51 = new JTextField();
		textField_51.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_51.setFont(new Font("OpenSans-Regular", Font.PLAIN, 30));
		textField_51.setColumns(10);
		textField_51.setBounds(184, 534, 309, 42);
		panel.add(textField_51);

		textField_52 = new JTextField();
		textField_52.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_52.setColumns(10);
		textField_52.setBounds(500, 534, 103, 42);
		textField_52.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_52);

		textField_53 = new JTextField();
		textField_53.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_53.setColumns(10);
		textField_53.setBounds(603, 534, 103, 42);
		textField_53.setFont(new Font("Dialog", Font.ITALIC, 26));
		panel.add(textField_53);

		textField_54 = new JTextField();
		textField_54.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_54.setColumns(10);
		textField_54.setBounds(706, 534, 103, 42);
		textField_54.setFont(new Font("Dialog", Font.ITALIC, 22));
		panel.add(textField_54);

		txtI = new JTextField();
		txtI.setText("I");
		txtI.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtI.setFont(new Font("OpenSans-Regular", Font.BOLD, 30));
		txtI.setColumns(10);
		txtI.setBounds(819, 534, 124, 42);
		panel.add(txtI);

		textField_56 = new JTextField();
		textField_56.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_56.setBackground(grey);
		textField_56.setFont(new Font("OpenSans-Regular", Font.PLAIN, 30));
		textField_56.setColumns(10);
		textField_56.setBounds(184, 589, 309, 42);
		panel.add(textField_56);

		txtI_1 = new JTextField();
		txtI_1.setText("I");
		txtI_1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtI_1.setBackground(grey);
		txtI_1.setFont(new Font("OpenSans-Regular", Font.BOLD, 30));
		txtI_1.setColumns(10);
		txtI_1.setBounds(819, 589, 124, 42);
		panel.add(txtI_1);

		textField_58 = new JTextField();
		textField_58.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_58.setBackground(grey);
		textField_58.setColumns(10);
		textField_58.setBounds(92, 589, 80, 42);
		textField_58.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_58);

		textField_59 = new JTextField();
		textField_59.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_59.setBackground(grey);
		textField_59.setColumns(10);
		textField_59.setBounds(500, 589, 103, 42);
		textField_59.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_59);

		textField_60 = new JTextField();
		textField_60.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_60.setBackground(grey);
		textField_60.setColumns(10);
		textField_60.setBounds(603, 589, 103, 42);
		textField_60.setFont(new Font("Dialog", Font.ITALIC, 26));
		panel.add(textField_60);

		textField_61 = new JTextField();
		textField_61.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_61.setBackground(grey);
		textField_61.setColumns(10);
		textField_61.setBounds(706, 589, 103, 42);
		textField_61.setFont(new Font("Dialog", Font.ITALIC, 22));
		panel.add(textField_61);

		label_8 = new JLabel("New label");
		label_8.setIcon(new ImageIcon(SkanetrafikenGUI.class.getResource("/se/mah/k3lara/skaneAPI/view/BussGul.png")));
		label_8.setBounds(22, 589, 42, 42);
		panel.add(label_8);

		label_9 = new JLabel("New label");
		label_9.setIcon(new ImageIcon(SkanetrafikenGUI.class.getResource("/se/mah/k3lara/skaneAPI/view/BussGul.png")));
		label_9.setBounds(22, 644, 42, 42);
		panel.add(label_9);

		textField_62 = new JTextField();
		textField_62.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_62.setColumns(10);
		textField_62.setBounds(92, 644, 80, 42);
		textField_62.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_62);

		textField_63 = new JTextField();
		textField_63.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_63.setFont(new Font("OpenSans-Regular", Font.PLAIN, 30));
		textField_63.setColumns(10);
		textField_63.setBounds(184, 644, 309, 42);
		panel.add(textField_63);

		textField_64 = new JTextField();
		textField_64.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_64.setColumns(10);
		textField_64.setBounds(500, 644, 103, 42);
		textField_64.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_64);

		textField_65 = new JTextField();
		textField_65.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_65.setColumns(10);
		textField_65.setBounds(603, 644, 103, 42);
		textField_65.setFont(new Font("Dialog", Font.ITALIC, 26));
		panel.add(textField_65);

		textField_66 = new JTextField();
		textField_66.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_66.setColumns(10);
		textField_66.setBounds(706, 644, 103, 42);
		textField_66.setFont(new Font("Dialog", Font.ITALIC, 22));
		panel.add(textField_66);

		txtI_2 = new JTextField();
		txtI_2.setText("I");
		txtI_2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtI_2.setFont(new Font("OpenSans-Regular", Font.BOLD, 30));
		txtI_2.setColumns(10);
		txtI_2.setBounds(819, 644, 124, 42);
		panel.add(txtI_2);

		label_10 = new JLabel("New label");
		label_10.setIcon(new ImageIcon(SkanetrafikenGUI.class.getResource("/se/mah/k3lara/skaneAPI/view/BussGul.png")));
		label_10.setBounds(22, 699, 42, 42);
		panel.add(label_10);

		textField_68 = new JTextField();
		textField_68.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_68.setBackground(grey);
		textField_68.setColumns(10);
		textField_68.setBounds(92, 699, 80, 42);
		textField_68.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_68);

		textField_69 = new JTextField();
		textField_69.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_69.setBackground(grey);
		textField_69.setFont(new Font("OpenSans-Regular", Font.PLAIN, 30));
		textField_69.setColumns(10);
		textField_69.setBounds(184, 699, 309, 42);
		panel.add(textField_69);

		textField_70 = new JTextField();
		textField_70.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_70.setBackground(grey);
		textField_70.setColumns(10);
		textField_70.setBounds(500, 699, 103, 42);
		textField_70.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_70);

		textField_71 = new JTextField();
		textField_71.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_71.setBackground(grey);
		textField_71.setColumns(10);
		textField_71.setBounds(603, 699, 103, 42);
		textField_71.setFont(new Font("Dialog", Font.ITALIC, 26));
		panel.add(textField_71);

		textField_72 = new JTextField();
		textField_72.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_72.setBackground(grey);
		textField_72.setColumns(10);
		textField_72.setBounds(706, 699, 103, 42);
		textField_72.setFont(new Font("Dialog", Font.ITALIC, 22));
		panel.add(textField_72);

		txtG = new JTextField();
		txtG.setText("G");
		txtG.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtG.setBackground(grey);
		txtG.setFont(new Font("OpenSans-Regular", Font.BOLD, 30));
		txtG.setColumns(10);
		txtG.setBounds(819, 699, 124, 42);
		panel.add(txtG);

		textField_74 = new JTextField();
		textField_74.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_74.setFont(new Font("OpenSans-Regular", Font.PLAIN, 30));
		textField_74.setColumns(10);
		textField_74.setBounds(184, 754, 309, 42);
		panel.add(textField_74);

		txtI_3 = new JTextField();
		txtI_3.setText("I");
		txtI_3.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtI_3.setFont(new Font("OpenSans-Regular", Font.BOLD, 30));
		txtI_3.setColumns(10);
		txtI_3.setBounds(819, 754, 124, 42);
		panel.add(txtI_3);

		textField_76 = new JTextField();
		textField_76.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_76.setBackground(Color.WHITE);
		textField_76.setColumns(10);
		textField_76.setBounds(92, 754, 80, 42);
		textField_76.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_76);

		textField_77 = new JTextField();
		textField_77.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_77.setColumns(10);
		textField_77.setBounds(500, 754, 103, 42);
		textField_77.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_77);

		textField_78 = new JTextField();
		textField_78.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_78.setColumns(10);
		textField_78.setBounds(603, 754, 103, 42);
		textField_78.setFont(new Font("Dialog", Font.ITALIC, 26));
		panel.add(textField_78);

		textField_79 = new JTextField();
		textField_79.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_79.setColumns(10);
		textField_79.setBounds(706, 754, 103, 42);
		textField_79.setFont(new Font("Dialog", Font.ITALIC, 22));
		panel.add(textField_79);

		label_11 = new JLabel("New label");
		label_11.setIcon(new ImageIcon(SkanetrafikenGUI.class.getResource("/se/mah/k3lara/skaneAPI/view/BussGul.png")));
		label_11.setBounds(22, 754, 42, 42);
		panel.add(label_11);

		label_12 = new JLabel("New label");
		label_12.setIcon(new ImageIcon(SkanetrafikenGUI.class.getResource("/javax/swing/plaf/metal/icons/Error.gif")));
		label_12.setBounds(22, 809, 42, 42);
		panel.add(label_12);

		textField_80 = new JTextField();
		textField_80.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_80.setBackground(grey);
		textField_80.setColumns(10);
		textField_80.setBounds(92, 809, 80, 42);
		textField_80.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_80);

		textField_81 = new JTextField();
		textField_81.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_81.setBackground(grey);
		textField_81.setFont(new Font("OpenSans-Regular", Font.PLAIN, 30));
		textField_81.setColumns(10);
		textField_81.setBounds(184, 809, 309, 42);
		panel.add(textField_81);

		textField_82 = new JTextField();
		textField_82.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_82.setBackground(grey);
		textField_82.setColumns(10);
		textField_82.setBounds(500, 809, 103, 42);
		textField_82.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_82);

		textField_83 = new JTextField();
		textField_83.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_83.setBackground(grey);
		textField_83.setColumns(10);
		textField_83.setBounds(603, 809, 103, 42);
		textField_83.setFont(new Font("Dialog", Font.ITALIC, 26));
		panel.add(textField_83);

		textField_84 = new JTextField();
		textField_84.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_84.setBackground(grey);
		textField_84.setColumns(10);
		textField_84.setBounds(706, 809, 103, 42);
		textField_84.setFont(new Font("Dialog", Font.ITALIC, 22));
		panel.add(textField_84);

		textField_85 = new JTextField();
		textField_85.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_85.setBackground(grey);
		textField_85.setFont(new Font("OpenSans-Regular", Font.PLAIN, 30));
		textField_85.setColumns(10);
		textField_85.setBounds(819, 809, 124, 42);
		panel.add(textField_85);

		label_13 = new JLabel("New label");
		label_13.setIcon(new ImageIcon(SkanetrafikenGUI.class.getResource("/se/mah/k3lara/skaneAPI/view/BussGul.png")));
		label_13.setBounds(22, 864, 42, 42);
		panel.add(label_13);

		textField_86 = new JTextField();
		textField_86.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_86.setColumns(10);
		textField_86.setBounds(92, 864, 80, 42);
		textField_86.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_86);

		textField_87 = new JTextField();
		textField_87.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_87.setFont(new Font("OpenSans-Regular", Font.PLAIN, 30));
		textField_87.setColumns(10);
		textField_87.setBounds(184, 864, 309, 42);
		panel.add(textField_87);

		textField_88 = new JTextField();
		textField_88.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_88.setColumns(10);
		textField_88.setBounds(500, 864, 103, 42);
		textField_88.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_88);

		textField_89 = new JTextField();
		textField_89.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_89.setColumns(10);
		textField_89.setBounds(603, 864, 103, 42);
		textField_89.setFont(new Font("Dialog", Font.ITALIC, 26));
		panel.add(textField_89);

		textField_90 = new JTextField();
		textField_90.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_90.setColumns(10);
		textField_90.setBounds(706, 864, 103, 42);
		textField_90.setFont(new Font("Dialog", Font.ITALIC, 22));
		panel.add(textField_90);

		txtH = new JTextField();
		txtH.setText("H");
		txtH.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txtH.setFont(new Font("OpenSans-Regular", Font.BOLD, 30));
		txtH.setColumns(10);
		txtH.setBounds(819, 864, 124, 42);
		
		panel.add(txtH);

		label_14 = new JLabel("New label");
		label_14.setIcon(new ImageIcon(SkanetrafikenGUI.class.getResource("/javax/swing/plaf/metal/icons/Error.gif")));
		label_14.setBounds(22, 919, 42, 42);
		panel.add(label_14);

		textField_92 = new JTextField();
		textField_92.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_92.setColumns(10);
		textField_92.setBounds(92, 919, 80, 42);
		textField_92.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_92.setBackground(grey);
		panel.add(textField_92);

		textField_93 = new JTextField();
		textField_93.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_93.setFont(new Font("OpenSans-Regular", Font.PLAIN, 30));
		textField_93.setColumns(10);
		textField_93.setBounds(184, 919, 309, 42);
		textField_93.setBackground(grey);
		panel.add(textField_93);

		textField_94 = new JTextField();
		textField_94.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_94.setColumns(10);
		textField_94.setBounds(500, 919, 103, 42);
		textField_94.setFont(new Font("Dialog", Font.BOLD, 30));
		textField_94.setBackground(grey);
		panel.add(textField_94);

		textField_95 = new JTextField();
		textField_95.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_95.setColumns(10);
		textField_95.setBounds(603, 919, 103, 42);
		textField_95.setFont(new Font("Dialog", Font.ITALIC, 26));
		textField_95.setBackground(grey);
		panel.add(textField_95);

		textField_96 = new JTextField();
		textField_96.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_96.setColumns(10);
		textField_96.setBounds(706, 919, 103, 42);
		textField_96.setFont(new Font("Dialog", Font.ITALIC, 22));
		textField_96.setBackground(grey);
		panel.add(textField_96);

		textField_97 = new JTextField();
		textField_97.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_97.setFont(new Font("OpenSans-Regular", Font.PLAIN, 30));
		textField_97.setColumns(10);
		textField_97.setBounds(819, 919, 124, 42);
		textField_97.setBackground(grey);
		panel.add(textField_97);

		label_15 = new JLabel("New label");
		label_15.setIcon(new ImageIcon(SkanetrafikenGUI.class.getResource("/javax/swing/plaf/metal/icons/Error.gif")));
		label_15.setBounds(22, 974, 42, 42);
		panel.add(label_15);

		textField_98 = new JTextField();
		textField_98.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_98.setColumns(10);
		textField_98.setBounds(92, 974, 80, 42);
		textField_98.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_98);

		textField_99 = new JTextField();
		textField_99.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_99.setFont(new Font("OpenSans-Regular", Font.PLAIN, 30));
		textField_99.setColumns(10);
		textField_99.setBounds(184, 974, 309, 42);
		panel.add(textField_99);

		textField_100 = new JTextField();
		textField_100.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_100.setColumns(10);
		textField_100.setBounds(500, 974, 103, 42);
		textField_100.setFont(new Font("Dialog", Font.BOLD, 30));
		panel.add(textField_100);

		textField_101 = new JTextField();
		textField_101.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_101.setColumns(10);
		textField_101.setBounds(603, 974, 103, 42);
		textField_101.setFont(new Font("Dialog", Font.ITALIC, 26));
		panel.add(textField_101);

		textField_102 = new JTextField();
		textField_102.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_102.setColumns(10);
		textField_102.setBounds(706, 974, 103, 42);
		textField_102.setFont(new Font("Dialog", Font.ITALIC, 22));
		panel.add(textField_102);

		textField_103 = new JTextField();
		
		textField_103.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_103.setFont(new Font("OpenSans-Regular", Font.PLAIN, 30));
		textField_103.setColumns(10);
		textField_103.setBounds(819, 974, 124, 42);
		panel.add(textField_103);
		contentPane.setLayout(gl_contentPane);
	
	
		
		

		new getTables().start();;
		clockLogic = new ClockLogic(this);
	
	}

	public class getTables extends Thread {
		@Override
		public void run() {
			while(true){
			try {
				//Limhamn = null;
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
			//timeTableLogic(int lineNr, String from, String to, JTextField line, JTextField endStation, JTextField timetodep, JTextField timetodep2, JTextField timetodep3)
			Bernstorp = new timeTableLogic(4, "80000", "31033", textField_8, textField_9, textField_10, textField_11, textField_12);	
			Bunkeflostrand = new timeTableLogic(4, "80000", "80049", textField_14, textField_15, textField_16, textField_17, textField_18);
			Fullriggaren = new timeTableLogic(2, "80000", "80080", textField_26, textField_27, textField_28, textField_29, textField_30);
			Limhamn = new timeTableLogic(4, "80000", "80310", textField_20, textField_21, textField_22, textField_23, textField_24);
			Trelleborg = new timeTableLogic(146, "80000", "87071", textField_58, textField_56, textField_59, textField_60, textField_61);
			Falsterbo = new timeTableLogic(100, "80000", "33029", textField_50, textField_51, textField_52, textField_53, textField_54);
			OstraHamnen = new timeTableLogic(32, "80000", "80020", textField_38, textField_39, textField_40, textField_41, textField_42);
			Lindangen = new timeTableLogic(2, "80000", "80600", textField_32, textField_33, textField_34, textField_35, textField_36);
			Segevang = new timeTableLogic(4, "80000", "80200", textField_4, textField_2, textField_5,textField_6, textField_7 );
			Kaglinge = new timeTableLogic(32, "80000", "80740", textField_44, textField_45, textField_46, textField_47, textField_48);
			Genarp = new timeTableLogic(172, "80000", "81197", textField_62, textField_63, textField_64, textField_65, textField_66);
			Lomma = new timeTableLogic(133, "80000", "62006", textField_68, textField_69, textField_70, textField_71, textField_72 );
			S_v�ng = new timeTableLogic(151, "80000", "33031", textField_76, textField_74, textField_77, textField_78, textField_79 );
			Kristianstad = new timeTableLogic(1, "80000", "90170", textField_80, textField_81, textField_82, textField_83, textField_84 );
			Svedala = new timeTableLogic(141, "80000", "63042", textField_86, textField_87, textField_88, textField_89, textField_90);
		
		
		}
		}
	}
	public class getTables2 extends Thread {
		@Override
		public void run() {
			while(true){
			try {
				
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
			

		//timeTableLogic(int lineNr, String from, String to, JTextField line, JTextField endStation, JTextField timetodep, JTextField timetodep2, JTextField timetodep3)
		
		}
		}
	}
	public void setTimeOnLabel(String time){
		klockLabel.setText(time);
	}
	}
	
	
	

