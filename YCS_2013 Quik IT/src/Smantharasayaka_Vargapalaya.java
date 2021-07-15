import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Smantharasayaka_Vargapalaya extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Smantharasayaka_Vargapalaya frame = new Smantharasayaka_Vargapalaya();
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
	public Smantharasayaka_Vargapalaya() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSamantharasrayakaVargapalaya = new JLabel("iudka;rdi%fha j�.M,h fidhuq");
		lblSamantharasrayakaVargapalaya.setFont(new Font("FMBindumathi",Font.PLAIN,25));
		lblSamantharasrayakaVargapalaya.setBounds(58, 10, 339, 32);
		
		
		contentPane.add(lblSamantharasrayakaVargapalaya);
		
		JLabel lblPadayakaDiga = new JLabel("mdohl os.");
		lblPadayakaDiga.setFont(new Font("FMBindumathi",Font.PLAIN,20));
		
		
		lblPadayakaDiga.setBounds(10, 70, 125, 22);
		contentPane.add(lblPadayakaDiga);
		
		JLabel lblLambaUsa = new JLabel(",�n Wi");
		lblLambaUsa.setFont(new Font("FMBindumathi",Font.PLAIN,20));
		
		lblLambaUsa.setBounds(10, 153, 107, 20);
		contentPane.add(lblLambaUsa);
		
		textField = new JTextField();
		textField.setBounds(44, 97, 91, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(44, 178, 91, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		final Label label_1 = new Label("New label");
		label_1.setBounds(345, 119, 62, 22);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				    double a = Double.valueOf(String.valueOf(textField.getText()));
					double b = Double.valueOf(String.valueOf(textField_1.getText()));
					double c = (a*b)/2;
					
					
					label_1.setText(String.valueOf(c));
					contentPane.add(label_1);
			}
		});
		btnOk.setBounds(191, 135, 87, 23);
		contentPane.add(btnOk);
	}
}
