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
import java.awt.Canvas;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Stujukonasraye_Vargapalaya extends JFrame {

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
					Stujukonasraye_Vargapalaya frame = new Stujukonasraye_Vargapalaya();
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
	public Stujukonasraye_Vargapalaya() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStujukonasrayevargapalaya = new JLabel("RcqfldaKdi%fha j¾.M,h fidhuq");
		lblStujukonasrayevargapalaya.setFont(new Font("FMBindumathi",Font.PLAIN,25));
		
		lblStujukonasrayevargapalaya.setBounds(30, 10, 373, 34);
		contentPane.add(lblStujukonasrayevargapalaya);
		
		textField = new JTextField();
		textField.setBounds(120, 80, 91, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 137, 91, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPadayakaDiga = new JLabel("mdofha os.");
		lblPadayakaDiga.setFont(new Font("FMBindumathi",Font.PLAIN,20));
		
		lblPadayakaDiga.setBounds(10, 80, 122, 19);
		contentPane.add(lblPadayakaDiga);
		
		JLabel label = new JLabel("mdofha m<,");
		label.setFont(new Font("FMBindumathi",Font.PLAIN,20));
		
		label.setBounds(10, 137, 100, 19);
		contentPane.add(label);
		
		final Label label_1 = new Label("New label");
		label_1.setBounds(345, 119, 62, 22);
		
		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = Double.valueOf(String.valueOf(textField.getText()));
				double b = Double.valueOf(String.valueOf(textField_1.getText()));
				double c = a*b;
				
				label_1.setText(String.valueOf(c));
				contentPane.add(label_1);
		}
	});
	btnOk.setBounds(220, 106, 87, 23);
	contentPane.add(btnOk);
		
		
	}
}
