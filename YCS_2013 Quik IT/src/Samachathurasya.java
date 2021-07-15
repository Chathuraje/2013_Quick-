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


public class Samachathurasya extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Samachathurasya frame = new Samachathurasya();
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
	public Samachathurasya() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblSamachathurasrayeVargapalaya = new JLabel("Samachathurasraye Vargapalaya");
		lblSamachathurasrayeVargapalaya.setFont(new Font("FMBindumathi",Font.PLAIN,25));
		
		
		JLabel lblPadayakaDiga = new JLabel("mdohl os.");
		lblPadayakaDiga.setFont(new Font("FMBindumathi",Font.PLAIN,20));
		
		
		lblPadayakaDiga.setBounds(10, 77, 115, 36);
		contentPane.add(lblPadayakaDiga);
		
		textField = new JTextField();
		textField.setBounds(32, 112, 107, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		final Label label_1 = new Label("New label");
		label_1.setBounds(345, 119, 62, 22);
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = Double.valueOf(textField.getText());
				double b = a*a;
				
				label_1.setText(String.valueOf(b));
				contentPane.add(label_1);
				
				lblSamachathurasrayeVargapalaya.setBounds(143, 10, 156, 14);
				contentPane.add(lblSamachathurasrayeVargapalaya);
			}
		});
		btnOk.setBounds(167, 111, 87, 23);
		contentPane.add(btnOk);
		
		JLabel lblNewLabel = new JLabel("iup;=ri%fha j¾.M,h fidhuq");
		lblNewLabel.setFont(new Font("FMBindumathi",Font.PLAIN,25));
		
		lblNewLabel.setBounds(52, 11, 382, 42);
		contentPane.add(lblNewLabel);
		
		
	}

}
