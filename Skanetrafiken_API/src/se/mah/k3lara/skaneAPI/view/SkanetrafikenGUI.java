package se.mah.k3lara.skaneAPI.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
import javax.swing.ImageIcon;
import java.awt.SystemColor;



public class SkanetrafikenGUI extends JFrame {
	//private timeTableLogic myLogic;
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	public double width = 1920;//screenSize.getWidth();
	public double height = 1080;//screenSize.getHeight();

	public JPanel contentPane;
	public Color red = new Color(195, 0, 45);
	public Color grey = new Color(228, 231, 226);
	public Color darkGrey = new Color(187, 192, 188);
	public Color lightGrey = new Color(239, 240, 240);
	public JTextField txtAv;
	public JTextField txtLinje;
	public JTextField txtMot;
	public JTextField txtNstaAvgng;
	public JTextField txtHpl;
	public JTextField textField_2;
	public JTextField textField_3;
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
	public JTextField textField_13;
	public JLabel label_1;
	public JTextField textField_14;
	public JTextField textField_15;
	public JTextField textField_16;
	public JTextField textField_17;
	public JTextField textField_18;
	public JTextField textField_19;
	public JLabel label_2;
	public JTextField textField_20;
	public JTextField textField_21;
	public JTextField textField_22;
	public JTextField textField_23;
	public JTextField textField_24;
	public JTextField textField_25;
	public JLabel label_3;
	public JTextField textField_26;
	public JTextField textField_27;
	public JTextField textField_28;
	public JTextField textField_29;
	public JTextField textField_30;
	public JTextField textField_31;
	public JLabel label_4;
	public JTextField textField_32;
	public JTextField textField_33;
	public JTextField textField_34;
	public JTextField textField_35;
	public JTextField textField_36;
	public JTextField textField_37;
	public JLabel label_5;
	public JTextField textField_38;
	public JTextField textField_39;
	public JTextField textField_40;
	public JTextField textField_41;
	public JTextField textField_42;
	public JTextField textField_43;
	public JLabel label_6;
	public JTextField textField_44;
	public JTextField textField_45;
	public JTextField textField_46;
	public JTextField textField_47;
	public JTextField textField_48;
	public JTextField textField_49;
	public JLabel label_7;
	public JTextField textField_50;
	public JTextField textField_51;
	public JTextField textField_52;
	public JTextField textField_53;
	public JTextField textField_54;
	public JTextField textField_55;
	public JTextField textField_56;
	public JTextField textField_57;
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
	public JTextField textField_67;
	public JLabel label_10;
	public JTextField textField_68;
	public JTextField textField_69;
	public JTextField textField_70;
	public JTextField textField_71;
	public JTextField textField_72;
	public JTextField textField_73;
	public JTextField textField_74;
	public JTextField textField_75;
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
	public JTextField textField_91;
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
		panel.setBackground(Color.WHITE);

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

		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(
		SkanetrafikenGUI.class.getResource("/se/mah/k3lara/skaneAPI/view/Grafiko-profilo (2).png")));
		lblNewLabel_1.setBounds(0, 0, 631, 890);
		panel_1.add(lblNewLabel_1);
		panel.setLayout(null);

		txtAv = new JTextField();
		txtAv.setForeground(Color.WHITE);
		txtAv.setEditable(false);
		txtAv.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtAv.setText("Avg\u00E5ngar fr\u00E5n Malm\u00F6 central");
		txtAv.setBackground(red);
		txtAv.setBounds(12, 0, 931, 42);
		panel.add(txtAv);
		txtAv.setColumns(10);

		txtLinje = new JTextField();
		txtLinje.setForeground(Color.WHITE);
		txtLinje.setBackground(red);
		txtLinje.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtLinje.setText("Linje");
		txtLinje.setBounds(12, 47, 160, 42);
		panel.add(txtLinje);
		txtLinje.setColumns(10);

		txtMot = new JTextField();
		txtMot.setForeground(Color.WHITE);
		txtMot.setBackground(red);
		txtMot.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtMot.setText("Mot");
		txtMot.setColumns(10);
		txtMot.setBounds(184, 47, 309, 42);
		panel.add(txtMot);

		txtNstaAvgng = new JTextField();
		txtNstaAvgng.setForeground(Color.WHITE);
		txtNstaAvgng.setBackground(red);
		txtNstaAvgng.setText("Nästa avgång");
		txtNstaAvgng.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtNstaAvgng.setColumns(10);
		txtNstaAvgng.setBounds(500, 47, 309, 42);
		panel.add(txtNstaAvgng);

		txtHpl = new JTextField();
		txtHpl.setForeground(Color.WHITE);
		txtHpl.setBackground(red);
		txtHpl.setText("Hpl");
		txtHpl.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtHpl.setColumns(10);
		txtHpl.setBounds(819, 47, 124, 42);
		panel.add(txtHpl);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_2.setColumns(10);
		textField_2.setBounds(184, 98, 309, 42);
		panel.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_3.setColumns(10);
		textField_3.setBounds(819, 98, 124, 42);
		panel.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setBounds(92, 98, 80, 42);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_5.setBounds(500, 98, 103, 42);
		panel.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(603, 98, 103, 42);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(706, 98, 103, 42);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_7);

		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(22, 98, 42, 42);
		panel.add(lblNewLabel);

		label = new JLabel("New label");
		label.setBounds(22, 153, 42, 42);
		panel.add(label);

		textField_8 = new JTextField();
		textField_8.setBackground(grey);
		textField_8.setColumns(10);
		textField_8.setBounds(92, 153, 80, 42);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setBackground(grey);
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_9.setColumns(10);
		textField_9.setBounds(184, 153, 309, 42);
		panel.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setBackground(grey);
		textField_10.setColumns(10);
		textField_10.setBounds(500, 153, 103, 42);
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setBackground(grey);
		textField_11.setColumns(10);
		textField_11.setBounds(603, 153, 103, 42);
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_11);

		textField_12 = new JTextField();
		textField_12.setBackground(grey);
		textField_12.setColumns(10);
		textField_12.setBounds(706, 153, 103, 42);
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_12);

		textField_13 = new JTextField();
		textField_13.setBackground(grey);
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_13.setColumns(10);
		textField_13.setBounds(819, 153, 124, 42);
		panel.add(textField_13);

		label_1 = new JLabel("New label");
		label_1.setBounds(22, 208, 42, 42);
		panel.add(label_1);

		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(92, 208, 80, 42);
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_14);

		textField_15 = new JTextField();
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_15.setColumns(10);
		textField_15.setBounds(184, 208, 309, 42);
		panel.add(textField_15);

		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(500, 208, 103, 42);
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_16);

		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(603, 208, 103, 42);
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_17);

		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(706, 208, 103, 42);
		panel.add(textField_18);

		textField_19 = new JTextField();
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_19.setColumns(10);
		textField_19.setBounds(819, 208, 124, 42);
		panel.add(textField_19);

		label_2 = new JLabel("New label");
		label_2.setBounds(22, 263, 42, 42);
		panel.add(label_2);

		textField_20 = new JTextField();
		textField_20.setBackground(grey);
		textField_20.setColumns(10);
		textField_20.setBounds(92, 263, 80, 42);
		textField_20.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_20);

		textField_21 = new JTextField();
		textField_21.setBackground(grey);
		textField_21.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_21.setColumns(10);
		textField_21.setBounds(184, 263, 309, 42);
		panel.add(textField_21);

		textField_22 = new JTextField();
		textField_22.setBackground(grey);
		textField_22.setColumns(10);
		textField_22.setBounds(500, 263, 103, 42);
		textField_22.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_22);

		textField_23 = new JTextField();
		textField_23.setBackground(grey);
		textField_23.setColumns(10);
		textField_23.setBounds(603, 263, 103, 42);
		textField_23.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_23);

		textField_24 = new JTextField();
		textField_24.setBackground(grey);
		textField_24.setColumns(10);
		textField_24.setBounds(706, 263, 103, 42);
		textField_24.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_24);

		textField_25 = new JTextField();
		textField_25.setBackground(grey);
		textField_25.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_25.setColumns(10);
		textField_25.setBounds(819, 263, 124, 42);
		panel.add(textField_25);

		label_3 = new JLabel("New label");
		label_3.setBounds(22, 318, 42, 42);
		panel.add(label_3);

		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(92, 318, 80, 42);
		textField_26.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_26);

		textField_27 = new JTextField();
		textField_27.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_27.setColumns(10);
		textField_27.setBounds(184, 318, 309, 42);
		panel.add(textField_27);

		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(500, 318, 103, 42);
		textField_28.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_28);

		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(603, 318, 103, 42);
		textField_29.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_29);

		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(706, 318, 103, 42);
		textField_30.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_30);

		textField_31 = new JTextField();
		textField_31.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_31.setColumns(10);
		textField_31.setBounds(819, 318, 124, 42);
		panel.add(textField_31);

		label_4 = new JLabel("New label");
		label_4.setBounds(22, 373, 42, 42);
		panel.add(label_4);

		textField_32 = new JTextField();
		textField_32.setBackground(grey);
		textField_32.setColumns(10);
		textField_32.setBounds(92, 373, 80, 42);
		textField_32.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_32);

		textField_33 = new JTextField();
		textField_33.setBackground(grey);
		textField_33.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_33.setColumns(10);
		textField_33.setBounds(184, 373, 309, 42);
		panel.add(textField_33);

		textField_34 = new JTextField();
		textField_34.setBackground(grey);
		textField_34.setColumns(10);
		textField_34.setBounds(500, 373, 103, 42);
		textField_34.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_34);

		textField_35 = new JTextField();
		textField_35.setBackground(grey);
		textField_35.setColumns(10);
		textField_35.setBounds(603, 373, 103, 42);
		textField_35.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_35);

		textField_36 = new JTextField();
		textField_36.setBackground(grey);
		textField_36.setColumns(10);
		textField_36.setBounds(706, 373, 103, 42);
		textField_36.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_36);

		textField_37 = new JTextField();
		textField_37.setBackground(grey);
		textField_37.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_37.setColumns(10);
		textField_37.setBounds(819, 373, 124, 42);
		panel.add(textField_37);

		label_5 = new JLabel("New label");
		label_5.setBounds(22, 425, 42, 42);
		panel.add(label_5);

		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(92, 425, 80, 42);
		textField_38.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_38);

		textField_39 = new JTextField();
		textField_39.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_39.setColumns(10);
		textField_39.setBounds(184, 425, 309, 42);
		panel.add(textField_39);

		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(500, 425, 103, 42);
		textField_40.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_40);

		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(603, 425, 103, 42);
		textField_41.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_41);

		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(706, 425, 103, 42);
		panel.add(textField_42);

		textField_43 = new JTextField();
		textField_43.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_43.setColumns(10);
		textField_43.setBounds(819, 425, 124, 42);
		panel.add(textField_43);

		label_6 = new JLabel("New label");
		label_6.setBounds(22, 479, 42, 42);
		panel.add(label_6);

		textField_44 = new JTextField();
		textField_44.setBackground(grey);
		textField_44.setColumns(10);
		textField_44.setBounds(92, 479, 80, 42);
		textField_44.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_44);

		textField_45 = new JTextField();
		textField_45.setBackground(grey);
		textField_45.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_45.setColumns(10);
		textField_45.setBounds(184, 479, 309, 42);
		panel.add(textField_45);

		textField_46 = new JTextField();
		textField_46.setBackground(grey);
		textField_46.setColumns(10);
		textField_46.setBounds(500, 479, 103, 42);
		textField_46.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_46);

		textField_47 = new JTextField();
		textField_47.setBackground(grey);
		textField_47.setColumns(10);
		textField_47.setBounds(603, 479, 103, 42);
		textField_47.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_47);

		textField_48 = new JTextField();
		textField_48.setBackground(grey);
		textField_48.setColumns(10);
		textField_48.setBounds(706, 479, 103, 42);
		textField_48.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_48);

		textField_49 = new JTextField();
		textField_49.setBackground(grey);
		textField_49.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_49.setColumns(10);
		textField_49.setBounds(819, 479, 124, 42);
		panel.add(textField_49);

		label_7 = new JLabel("New label");
		label_7.setBounds(22, 534, 42, 42);
		panel.add(label_7);

		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(92, 534, 80, 42);
		textField_50.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_50);

		textField_51 = new JTextField();
		textField_51.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_51.setColumns(10);
		textField_51.setBounds(184, 534, 309, 42);
		panel.add(textField_51);

		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(500, 534, 103, 42);
		textField_52.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_52);

		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(603, 534, 103, 42);
		textField_53.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_53);

		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(706, 534, 103, 42);
		textField_54.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_54);

		textField_55 = new JTextField();
		textField_55.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_55.setColumns(10);
		textField_55.setBounds(819, 534, 124, 42);
		panel.add(textField_55);

		textField_56 = new JTextField();
		textField_56.setBackground(grey);
		textField_56.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_56.setColumns(10);
		textField_56.setBounds(184, 589, 309, 42);
		panel.add(textField_56);

		textField_57 = new JTextField();
		textField_57.setBackground(grey);
		textField_57.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_57.setColumns(10);
		textField_57.setBounds(819, 589, 124, 42);
		panel.add(textField_57);

		textField_58 = new JTextField();
		textField_58.setBackground(grey);
		textField_58.setColumns(10);
		textField_58.setBounds(92, 589, 80, 42);
		textField_58.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_58);

		textField_59 = new JTextField();
		textField_59.setBackground(grey);
		textField_59.setColumns(10);
		textField_59.setBounds(500, 589, 103, 42);
		textField_59.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_59);

		textField_60 = new JTextField();
		textField_60.setBackground(grey);
		textField_60.setColumns(10);
		textField_60.setBounds(603, 589, 103, 42);
		textField_60.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_60);

		textField_61 = new JTextField();
		textField_61.setBackground(grey);
		textField_61.setColumns(10);
		textField_61.setBounds(706, 589, 103, 42);
		textField_61.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_61);

		label_8 = new JLabel("New label");
		label_8.setBounds(22, 589, 42, 42);
		panel.add(label_8);

		label_9 = new JLabel("New label");
		label_9.setBounds(22, 644, 42, 42);
		panel.add(label_9);

		textField_62 = new JTextField();
		textField_62.setColumns(10);
		textField_62.setBounds(92, 644, 80, 42);
		textField_62.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_62);

		textField_63 = new JTextField();
		textField_63.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_63.setColumns(10);
		textField_63.setBounds(184, 644, 309, 42);
		panel.add(textField_63);

		textField_64 = new JTextField();
		textField_64.setColumns(10);
		textField_64.setBounds(500, 644, 103, 42);
		textField_64.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_64);

		textField_65 = new JTextField();
		textField_65.setColumns(10);
		textField_65.setBounds(603, 644, 103, 42);
		textField_65.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_65);

		textField_66 = new JTextField();
		textField_66.setColumns(10);
		textField_66.setBounds(706, 644, 103, 42);
		textField_66.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_66);

		textField_67 = new JTextField();
		textField_67.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_67.setColumns(10);
		textField_67.setBounds(819, 644, 124, 42);
		panel.add(textField_67);

		label_10 = new JLabel("New label");
		label_10.setBounds(22, 699, 42, 42);
		panel.add(label_10);

		textField_68 = new JTextField();
		textField_68.setBackground(grey);
		textField_68.setColumns(10);
		textField_68.setBounds(92, 699, 80, 42);
		textField_68.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_68);

		textField_69 = new JTextField();
		textField_69.setBackground(grey);
		textField_69.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_69.setColumns(10);
		textField_69.setBounds(184, 699, 309, 42);
		panel.add(textField_69);

		textField_70 = new JTextField();
		textField_70.setBackground(grey);
		textField_70.setColumns(10);
		textField_70.setBounds(500, 699, 103, 42);
		textField_70.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_70);

		textField_71 = new JTextField();
		textField_71.setBackground(grey);
		textField_71.setColumns(10);
		textField_71.setBounds(603, 699, 103, 42);
		textField_71.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_71);

		textField_72 = new JTextField();
		textField_72.setBackground(grey);
		textField_72.setColumns(10);
		textField_72.setBounds(706, 699, 103, 42);
		textField_72.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_72);

		textField_73 = new JTextField();
		textField_73.setBackground(grey);
		textField_73.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_73.setColumns(10);
		textField_73.setBounds(819, 699, 124, 42);
		panel.add(textField_73);

		textField_74 = new JTextField();
		textField_74.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_74.setColumns(10);
		textField_74.setBounds(184, 754, 309, 42);
		panel.add(textField_74);

		textField_75 = new JTextField();
		textField_75.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_75.setColumns(10);
		textField_75.setBounds(819, 754, 124, 42);
		panel.add(textField_75);

		textField_76 = new JTextField();
		textField_76.setBackground(Color.WHITE);
		textField_76.setColumns(10);
		textField_76.setBounds(92, 754, 80, 42);
		textField_76.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_76);

		textField_77 = new JTextField();
		textField_77.setColumns(10);
		textField_77.setBounds(500, 754, 103, 42);
		textField_77.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_77);

		textField_78 = new JTextField();
		textField_78.setColumns(10);
		textField_78.setBounds(603, 754, 103, 42);
		textField_78.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_78);

		textField_79 = new JTextField();
		textField_79.setColumns(10);
		textField_79.setBounds(706, 754, 103, 42);
		textField_79.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_79);

		label_11 = new JLabel("New label");
		label_11.setBounds(22, 754, 42, 42);
		panel.add(label_11);

		label_12 = new JLabel("New label");
		label_12.setBounds(22, 809, 42, 42);
		panel.add(label_12);

		textField_80 = new JTextField();
		textField_80.setBackground(grey);
		textField_80.setColumns(10);
		textField_80.setBounds(92, 809, 80, 42);
		textField_80.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_80);

		textField_81 = new JTextField();
		textField_81.setBackground(grey);
		textField_81.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_81.setColumns(10);
		textField_81.setBounds(184, 809, 309, 42);
		panel.add(textField_81);

		textField_82 = new JTextField();
		textField_82.setBackground(grey);
		textField_82.setColumns(10);
		textField_82.setBounds(500, 809, 103, 42);
		textField_82.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_82);

		textField_83 = new JTextField();
		textField_83.setBackground(grey);
		textField_83.setColumns(10);
		textField_83.setBounds(603, 809, 103, 42);
		textField_83.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_83);

		textField_84 = new JTextField();
		textField_84.setBackground(grey);
		textField_84.setColumns(10);
		textField_84.setBounds(706, 809, 103, 42);
		textField_84.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_84);

		textField_85 = new JTextField();
		textField_85.setBackground(grey);
		textField_85.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_85.setColumns(10);
		textField_85.setBounds(819, 809, 124, 42);
		panel.add(textField_85);

		label_13 = new JLabel("New label");
		label_13.setBounds(22, 864, 42, 42);
		panel.add(label_13);

		textField_86 = new JTextField();
		textField_86.setColumns(10);
		textField_86.setBounds(92, 864, 80, 42);
		textField_86.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_86);

		textField_87 = new JTextField();
		textField_87.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_87.setColumns(10);
		textField_87.setBounds(184, 864, 309, 42);
		panel.add(textField_87);

		textField_88 = new JTextField();
		textField_88.setColumns(10);
		textField_88.setBounds(500, 864, 103, 42);
		textField_88.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_88);

		textField_89 = new JTextField();
		textField_89.setColumns(10);
		textField_89.setBounds(603, 864, 103, 42);
		textField_89.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_89);

		textField_90 = new JTextField();
		textField_90.setColumns(10);
		textField_90.setBounds(706, 864, 103, 42);
		textField_90.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_90);

		textField_91 = new JTextField();
		textField_91.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_91.setColumns(10);
		textField_91.setBounds(819, 864, 124, 42);
		
		panel.add(textField_91);

		label_14 = new JLabel("New label");
		label_14.setBounds(22, 919, 42, 42);
		panel.add(label_14);

		textField_92 = new JTextField();
		textField_92.setColumns(10);
		textField_92.setBounds(92, 919, 80, 42);
		textField_92.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_92.setBackground(grey);
		panel.add(textField_92);

		textField_93 = new JTextField();
		textField_93.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_93.setColumns(10);
		textField_93.setBounds(184, 919, 309, 42);
		textField_93.setBackground(grey);
		panel.add(textField_93);

		textField_94 = new JTextField();
		textField_94.setColumns(10);
		textField_94.setBounds(500, 919, 103, 42);
		textField_94.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_94.setBackground(grey);
		panel.add(textField_94);

		textField_95 = new JTextField();
		textField_95.setColumns(10);
		textField_95.setBounds(603, 919, 103, 42);
		textField_95.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_95.setBackground(grey);
		panel.add(textField_95);

		textField_96 = new JTextField();
		textField_96.setColumns(10);
		textField_96.setBounds(706, 919, 103, 42);
		textField_96.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_96.setBackground(grey);
		panel.add(textField_96);

		textField_97 = new JTextField();
		textField_97.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_97.setColumns(10);
		textField_97.setBounds(819, 919, 124, 42);
		textField_97.setBackground(grey);
		panel.add(textField_97);

		label_15 = new JLabel("New label");
		label_15.setBounds(22, 974, 42, 42);
		panel.add(label_15);

		textField_98 = new JTextField();
		textField_98.setColumns(10);
		textField_98.setBounds(92, 974, 80, 42);
		textField_98.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_98);

		textField_99 = new JTextField();
		textField_99.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_99.setColumns(10);
		textField_99.setBounds(184, 974, 309, 42);
		panel.add(textField_99);

		textField_100 = new JTextField();
		textField_100.setColumns(10);
		textField_100.setBounds(500, 974, 103, 42);
		textField_100.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_100);

		textField_101 = new JTextField();
		textField_101.setColumns(10);
		textField_101.setBounds(603, 974, 103, 42);
		textField_101.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_101);

		textField_102 = new JTextField();
		textField_102.setColumns(10);
		textField_102.setBounds(706, 974, 103, 42);
		textField_102.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(textField_102);

		textField_103 = new JTextField();
		textField_103.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_103.setColumns(10);
		textField_103.setBounds(819, 974, 124, 42);
		panel.add(textField_103);
		contentPane.setLayout(gl_contentPane);
	
		
		new getBernstorp().start();
		new getSegevang().start();
		new getBunkeflostrand().start();
		new getLimhamn().start();
		new getFullriggaren().start();
		new getLindangen().start();
		new getOstraHamnen().start();
		new getKaglinge().start();
		new getFalsterbo().start();
		new getTrelleborg().start();
		new getVellinge().start();
		
		
	}

	public class getSegevang extends Thread {
		@Override
		public void run() {
			String searchURL = Constants.getURL("80000", "80200", 1);
			Journeys journeys = Parser.getJourneys(searchURL);

			for (Journey journey : journeys.getJourneys()) {

				int fyran = 4;


				
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":"
						+ journey.getDepDateTime().get(Calendar.MINUTE);

				try {
					if (Integer.parseInt(journey.getLineOnFirstJourney()) == fyran) {
						textField_4.setText(journey.getLineOnFirstJourney());
						textField_2.setText(journey.getEndStation().toString());
						textField_5.setText( journey.getTimeToDeparture()
								+ " min");

					}

				} catch (java.lang.NumberFormatException e) {
					System.out.println("errorSegevang");

				}
			}
		}

	}
	
	public class getBernstorp extends Thread {
		@Override
		public void run() {
			String searchURL = Constants.getURL("80000", "31033", 1);
			Journeys journeys = Parser.getJourneys(searchURL);

			for (Journey journey : journeys.getJourneys()) {
				int fyran = 4;
				
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":"
						+ journey.getDepDateTime().get(Calendar.MINUTE);

				try {
					if (Integer.parseInt(journey.getLineOnFirstJourney()) == fyran) {
						textField_8.setText(journey.getLineOnFirstJourney());
						textField_9.setText(journey.getEndStation().toString());
						textField_10.setText( journey.getTimeToDeparture()
								+ " min");

					}

				} catch (java.lang.NumberFormatException e) {
					System.out.println("errorBernstorp");

				}
			}
		}

	}
	
	public class getBunkeflostrand extends Thread {
		@Override
		public void run() {
			String searchURL = Constants.getURL("80000", "80049", 2);
			Journeys journeys = Parser.getJourneys(searchURL);

			for (Journey journey : journeys.getJourneys()) {

				int fyran = 4;


				
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":"
						+ journey.getDepDateTime().get(Calendar.MINUTE);

				try {
					if (Integer.parseInt(journey.getLineOnFirstJourney()) == fyran) {
						textField_14.setText(journey.getLineOnFirstJourney());
						textField_15.setText(journey.getEndStation().toString());
						textField_16.setText( journey.getTimeToDeparture()
								+ " minutes. And it is " + journey.getDepTimeDeviation() + " min late");

					}

				} catch (java.lang.NumberFormatException e) {
					System.out.println("errorBunkeflostrand");

				}
			}
		}

	}
	
	public class getLimhamn extends Thread {
		@Override
		public void run() {
			String searchURL = Constants.getURL("80000", "80310", 2);
			Journeys journeys = Parser.getJourneys(searchURL);

			for (Journey journey : journeys.getJourneys()) {

				int fyran = 4;


				
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":"
						+ journey.getDepDateTime().get(Calendar.MINUTE);

				try {
					if (Integer.parseInt(journey.getLineOnFirstJourney()) == fyran) {
						textField_20.setText(journey.getLineOnFirstJourney());
						textField_21.setText(journey.getEndStation().toString());
						textField_22.setText( journey.getTimeToDeparture()
								+ " minutes. And it is " + journey.getDepTimeDeviation() + " min late");

					}

				} catch (java.lang.NumberFormatException e) {
					System.out.println("errorLimhamn");

				}
			}
		}

	}
	
	public class getFullriggaren extends Thread {
		@Override
		public void run() {
			String searchURL = Constants.getURL("80000", "80080", 5);
			Journeys journeys = Parser.getJourneys(searchURL);

			for (Journey journey : journeys.getJourneys()) {

				int tva = 2;


				
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":"
						+ journey.getDepDateTime().get(Calendar.MINUTE);

				try {
					if (Integer.parseInt(journey.getLineOnFirstJourney()) == tva) {
						textField_26.setText(journey.getLineOnFirstJourney());
						textField_27.setText(journey.getEndStation().toString());
						textField_28.setText( journey.getTimeToDeparture()
								+ " minutes. And it is " + journey.getDepTimeDeviation() + " min late");
						Lines lines = Parser.getStationResults(new Station("80000"));
						for(int j = 0; j<lines.getLines().size() ; j++){
							
							if (lines.getLines().get(j).getLine().equals("2")){
						System.out.println("disco" + lines.getLines().get(j).getLine());
						System.out.println("disco" + lines.getLines().get(j).getDepTime().get(Calendar.HOUR_OF_DAY) + ":" + lines.getLines().get(j).getDepTime().get(Calendar.MINUTE));
							}
						
						}
					}


				} catch (java.lang.NumberFormatException e) {
					System.out.println("errorFullriggaren");

				}
			}
		}

	}
	
	public class getLindangen extends Thread {
		@Override
		public void run() {
			String searchURL = Constants.getURL("80000", "80600", 3);
			Journeys journeys = Parser.getJourneys(searchURL);

			for (Journey journey : journeys.getJourneys()) {

				int tva = 2;


				
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":"
						+ journey.getDepDateTime().get(Calendar.MINUTE);

				try {
					if (Integer.parseInt(journey.getLineOnFirstJourney()) == tva) {
						textField_32.setText(journey.getLineOnFirstJourney());
						textField_33.setText(journey.getEndStation().toString());
						textField_34.setText( journey.getTimeToDeparture()
								+ " minutes. And it is " + journey.getDepTimeDeviation() + " min late");

					}

				} catch (java.lang.NumberFormatException e) {
					System.out.println("errorLindangen");

				}
			}
		}

	}
	
	public class getOstraHamnen extends Thread {
		@Override
		public void run() {
			String searchURL = Constants.getURL("80000", "80020", 3);
			Journeys journeys = Parser.getJourneys(searchURL);

			for (Journey journey : journeys.getJourneys()) {

				int trettitva = 32;


				
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":"
						+ journey.getDepDateTime().get(Calendar.MINUTE);

				try {
					if (Integer.parseInt(journey.getLineOnFirstJourney()) == trettitva) {
						textField_38.setText(journey.getLineOnFirstJourney());
						textField_39.setText(journey.getEndStation().toString());
						textField_40.setText( journey.getTimeToDeparture()
								+ " minutes. And it is " + journey.getDepTimeDeviation() + " min late");

					}

				} catch (java.lang.NumberFormatException e) {
					System.out.println("errorOstraHamnen");

				}
			}
		}

	}
	
	
	public class getKaglinge extends Thread {
		@Override
		public void run() {
			String searchURL = Constants.getURL("80000", "80740", 3);
			Journeys journeys = Parser.getJourneys(searchURL);

			for (Journey journey : journeys.getJourneys()) {

				int trettitva = 32;


				
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":"
						+ journey.getDepDateTime().get(Calendar.MINUTE);

				try {
					if (Integer.parseInt(journey.getLineOnFirstJourney()) == trettitva) {
						textField_38.setText(journey.getLineOnFirstJourney());
						textField_39.setText(journey.getEndStation().toString());
						textField_40.setText( journey.getTimeToDeparture()
								+ " minutes. And it is " + journey.getDepTimeDeviation() + " min late");

					}

				} catch (java.lang.NumberFormatException e) {
					System.out.println("errorKaglinge");

				}
			}
		}

	}
	
	public class getFalsterbo extends Thread {
		@Override
		public void run() {
			String searchURL = Constants.getURL("80000", "33029", 50);
			Journeys journeys = Parser.getJourneys(searchURL);

			for (Journey journey : journeys.getJourneys()) {

				int hundra = 100;


				
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":"
						+ journey.getDepDateTime().get(Calendar.MINUTE);

				try {
					if (Integer.parseInt(journey.getLineOnFirstJourney()) == hundra) {
						textField_44.setText(journey.getLineOnFirstJourney());
						textField_45.setText(journey.getEndStation().toString());
						textField_46.setText( journey.getTimeToDeparture()
								+ " minutes. And it is " + journey.getDepTimeDeviation() + " min late");

					}

				} catch (java.lang.NumberFormatException e) {
					System.out.println("errorFalsterbo");

				}
			}
		}

	}
	
	public class getTrelleborg extends Thread {
		@Override
		public void run() {
			String searchURL = Constants.getURL("80000", "87071", 50);
			Journeys journeys = Parser.getJourneys(searchURL);

			for (Journey journey : journeys.getJourneys()) {

				int hundrafyrtisex = 146;


				
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":"
						+ journey.getDepDateTime().get(Calendar.MINUTE);

				try {
					if (Integer.parseInt(journey.getLineOnFirstJourney()) == hundrafyrtisex) {
						textField_50.setText(journey.getLineOnFirstJourney());
						textField_51.setText(journey.getEndStation().toString());
						textField_52.setText( journey.getTimeToDeparture()
								+ " minutes. And it is " + journey.getDepTimeDeviation() + " min late");

					}

				} catch (java.lang.NumberFormatException e) {
					System.out.println("errorTrelleborg");

				}
			}
		}

	}
	
	public class getVellinge extends Thread {
		@Override
		public void run() {
			String searchURL = Constants.getURL("80000", "33031", 50);
			Journeys journeys = Parser.getJourneys(searchURL);

			for (Journey journey : journeys.getJourneys()) {

				int hundrafemtio = 150;


				
				String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":"
						+ journey.getDepDateTime().get(Calendar.MINUTE);

				try {
					if (Integer.parseInt(journey.getLineOnFirstJourney()) == hundrafemtio) {
						textField_58.setText(journey.getLineOnFirstJourney());
						textField_56.setText(journey.getEndStation().toString());
						textField_59.setText( journey.getTimeToDeparture()
								+ " minutes. And it is " + journey.getDepTimeDeviation() + " min late");
						
						Lines lines = Parser.getStationResults(new Station("80000"));
						for(Line l : lines.getLines()){
							if (Integer.parseInt(l.getLine()) == hundrafemtio){
							
						System.out.println(l.getLine() + " DEPARTS " + l.getDepTime().get(Calendar.HOUR_OF_DAY) + ":"
								+ l.getDepTime().get(Calendar.MINUTE)+ " " + journey.getTimeToDeparture());
						}}

					}

				} catch (java.lang.NumberFormatException e) {
					System.out.println("errorVellinge");

				}
			}
		}

	}
	
	
	
}
