import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Vruthayaka_paridiya extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vruthayaka_paridiya frame = new Vruthayaka_paridiya();
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
	public Vruthayaka_paridiya() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("jD;a;fha j¾.M,h fidhuq");
		lblNewLabel.setFont(new Font("FMBindumathi",Font.PLAIN,25));
		
		lblNewLabel.setBounds(70, 11, 341, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblAraya = new JLabel("wrh");
		lblAraya.setFont(new Font("FMBindumathi",Font.PLAIN,20));
		
		lblAraya.setBounds(10, 86, 87, 19);
		contentPane.add(lblAraya);
		
		textField = new JTextField();
		textField.setBounds(29, 116, 91, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		final Label label_1 = new Label("New label");
		label_1.setBounds(345, 119, 62, 22);
	    final Label label = new Label("New label");
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = Double.valueOf(textField.getText());
				double b = 22/7*a*a;
				
				
				label_1.setText(String.valueOf(b));
				contentPane.add(label_1);
				
			}
		});
		
		btnNewButton.setBounds(154, 115, 87, 23);
		contentPane.add(btnNewButton);
		
		
	}

}
