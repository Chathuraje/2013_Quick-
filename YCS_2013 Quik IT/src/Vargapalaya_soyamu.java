import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;
import javax.swing.JLabel;


public class Vargapalaya_soyamu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vargapalaya_soyamu frame = new Vargapalaya_soyamu();
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
	public Vargapalaya_soyamu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 375, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("iup;=ri%fha j¾.M,h fidhuq");
		btnNewButton.setFont(new Font("FMBindumathi",Font.PLAIN,20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Samachathurasya frame = new Samachathurasya ();
				frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 59, 333, 46);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("iudka;rdi%fha j¾.M,h fidhuq");
		button.setFont(new Font("FMBindumathi",Font.PLAIN,20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Smantharasayaka_Vargapalaya frame = new Smantharasayaka_Vargapalaya();
				frame.setVisible(true);
			}
		});
		button.setBounds(10, 173, 333, 46);
		contentPane.add(button);
		
		JButton button_1 = new JButton("jD;a;fha j¾.M,h fidhuq");
		button_1.setFont(new Font("FMBindumathi",Font.PLAIN,20));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Vruthayaka_paridiya frame = new Vruthayaka_paridiya();
				frame.setVisible(true);
			}
		});
		button_1.setBounds(10, 287, 333, 40);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("RcqfldaKdi%fha j¾.M,h fidhuq");
		button_2.setFont(new Font("FMBindumathi",Font.PLAIN,20));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Stujukonasraye_Vargapalaya frame = new Stujukonasraye_Vargapalaya();
				frame.setVisible(true);
			}
		});
		button_2.setBounds(10, 116, 333, 46);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton(";%sfldaKfha j¾.M,h fidhuq");
		button_3.setFont(new Font("FMBindumathi",Font.PLAIN,20));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Triukonayaka_Vargaoalaya frame = new Triukonayaka_Vargaoalaya();
				frame.setVisible(true);
			}
		});
		button_3.setBounds(10, 230, 333, 46);
		contentPane.add(button_3);
		
		JLabel lblJmhFidhuq = new JLabel("j\u00BE.M,h fidhuq");
		lblJmhFidhuq.setFont(new Font("FMBindumathi",Font.PLAIN,30));
		lblJmhFidhuq.setBounds(63, 0, 296, 54);
		contentPane.add(lblJmhFidhuq);
		
	
		
	
	}
}
