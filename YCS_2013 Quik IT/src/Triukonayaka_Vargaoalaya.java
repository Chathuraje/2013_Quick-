import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;


public class Triukonayaka_Vargaoalaya extends JFrame {

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
					Triukonayaka_Vargaoalaya frame = new Triukonayaka_Vargaoalaya();
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
	public Triukonayaka_Vargaoalaya() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTrikonayakaVargapalaya = new JLabel(";%sfldaKfha j¾.M,h fidhuq");
		lblTrikonayakaVargapalaya.setFont(new Font("FMBindumathi",Font.PLAIN,25));
		
		lblTrikonayakaVargapalaya.setBounds(65, 11, 325, 38);
		contentPane.add(lblTrikonayakaVargapalaya);
		
		JLabel lblAdharakaya = new JLabel("wdOdrlh");
		lblAdharakaya.setFont(new Font("FMBindumathi",Font.PLAIN,20));
		
		lblAdharakaya.setBounds(25, 72, 100, 19);
		contentPane.add(lblAdharakaya);
		
		textField = new JTextField();
		textField.setBounds(61, 91, 91, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblLambaUsa = new JLabel(",ïn Wi");
		lblLambaUsa.setFont(new Font("FMBindumathi",Font.PLAIN,20));
		
		lblLambaUsa.setBounds(25, 140, 100, 19);
		contentPane.add(lblLambaUsa);
		
		textField_1 = new JTextField();
		textField_1.setBounds(61, 170, 91, 19);
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
		btnOk.setBounds(171, 117, 87, 23);
		contentPane.add(btnOk);
		
		
		
	}
}
