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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPasswordField;
import javax.swing.JMenu;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class interfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Tbx_user_name;
	private JPasswordField Tbx_password;

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
		
		Tbx_user_name = new JTextField();
		Tbx_user_name.setBounds(143, 109, 135, 20);
		contentPane.add(Tbx_user_name);
		Tbx_user_name.setColumns(10);
		
		JLabel nlbTitulo = new JLabel("Nombre_restaurante");
		nlbTitulo.setFont(new Font("Mistral", Font.BOLD, 20));
		nlbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		nlbTitulo.setBounds(130, 10, 168, 39);
		contentPane.add(nlbTitulo);
		
		JLabel nlbBienvenido = new JLabel("RESTAURANTE");
		nlbBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		nlbBienvenido.setFont(new Font("Mistral", Font.BOLD, 20));
		nlbBienvenido.setBounds(143, 51, 128, 34);
		contentPane.add(nlbBienvenido);
		
		JLabel nlbIsAutorized = new JLabel("New label");
		nlbIsAutorized.setVisible(false);;
		nlbIsAutorized.setBounds(46, 194, 232, 23);
		contentPane.add(nlbIsAutorized);
		
		Tbx_password = new JPasswordField();
		Tbx_password.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Tbx_password.setEchoChar('●');
		Tbx_password.setBounds(106, 139, 160, 21);
		contentPane.add(Tbx_password);
		
		JButton btnCliente = new JButton("Login");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Metodo que consulta a la base de datos si existe el usuario (empleado o administrador)
				VerificarEmpleado(Tbx_user_name, Tbx_password, nlbIsAutorized);
			}
		});
		btnCliente.setBounds(309, 155, 89, 23);
		contentPane.add(btnCliente);
		
		JButton btnShow_password = new JButton("");
		btnShow_password.setIcon(new ImageIcon(interfaz.class.getResource("/Images/hide_password.png")));
		btnShow_password.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ShowPass(Tbx_password, btnShow_password);;
			}
		});
		btnShow_password.setBounds(264, 139, 20, 20);
		contentPane.add(btnShow_password);
	}
	
	public static void VerificarEmpleado(JTextField user, JPasswordField password, JLabel welcome) {
		empleadoDB empDB = new empleadoDB();
		empleado emp = empDB.buscarEmpleado(user.getText());
		if(emp!=null) {
			if(emp.verificarPassword(password.getPassword())){
				welcome.setText("Bienvenido "+emp.getName_user());
			}
			else {
				welcome.setText("Contraseña incorrecta");
			}
		}
		else {
			welcome.setText("Usuario invalido o Inexistente");
		}
		welcome.setVisible(true);
	}
	
	public static void ShowPass(JPasswordField password, JButton boton) {
		if(password.getEchoChar()=='●') {
			password.setEchoChar((char) 0);
			boton.setIcon(new ImageIcon(interfaz.class.getResource("/Images/show_password.png")));
		}
		else {
			password.setEchoChar('●');
			boton.setIcon(new ImageIcon(interfaz.class.getResource("/Images/hide_password.png")));
		}	
	}
}
