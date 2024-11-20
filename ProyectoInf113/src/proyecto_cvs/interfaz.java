package proyecto_cvs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class interfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz frame = new interfaz();
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
	public interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(69, 123, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnCliente = new JButton("Registar");
		btnCliente.setBounds(274, 68, 89, 23);
		contentPane.add(btnCliente);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(104, 172, 5, 22);
		contentPane.add(textArea);
		
		JLabel nlbTitulo = new JLabel("RESTAURANTE");
		nlbTitulo.setFont(new Font("Mistral", Font.BOLD, 20));
		nlbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		nlbTitulo.setBounds(157, 11, 128, 34);
		contentPane.add(nlbTitulo);
	}
}
