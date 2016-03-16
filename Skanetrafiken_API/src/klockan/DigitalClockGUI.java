package klockan;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.util.Calendar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private ClockLogic clockLogic;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblKlockanr;
	private JLabel lblAlarmet;
	private JLabel lblAlarmStatus;
	private int setAlarm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(DigitalClockGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/Warn.gif")));
		setTitle("AlarmClock");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblKlockanr = new JLabel("00:00:00");
		lblKlockanr.setFont(new Font("Vladimir Script", Font.PLAIN, 60));
		lblKlockanr.setBounds(93, 11, 240, 111);
		contentPane.add(lblKlockanr);

		
	
	
		clockLogic = new ClockLogic(this);
		
	}

	public void setTimeOnLabel(String time) {
		lblKlockanr.setText(time);
			
		
	}

}
