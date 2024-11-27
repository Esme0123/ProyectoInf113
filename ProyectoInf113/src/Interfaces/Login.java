package interfaces;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import db_clases.empleadoDB;
import proyecto_cvs.empleado;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.KeyStroke;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import java.awt.FlowLayout;
import javax.swing.JLayeredPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setBounds(100, 100, 1000, 864);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		getContentPane().setLayout(null);
		
		 contentPane = new JPanel() {
	            private static final long serialVersionUID = 1L;

	            private Image backgroundImage = new ImageIcon("C:\\Users\\Felipe Mejia\\git\\ProyectoInf113\\ProyectoInf113\\src\\images\\restaurant_font.jpg").getImage();

	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                // Dibujar la imagen de fondo escalada al tamaño del panel
	                if (backgroundImage != null) {
	                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
	                }
	            }
	        };
		
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel panel_general = new JPanel();
		panel_general.setBackground(new Color(255, 255, 255)); // Color de fondo del panel
		panel_general.setSize(450, 300); // Definimos el tamaño del panel, pero no la posición
        contentPane.add(panel_general);
        GridBagLayout gbl_panel_general = new GridBagLayout();
        gbl_panel_general.columnWidths = new int[]{308, 142, 0};
        gbl_panel_general.rowHeights = new int[]{21, 279, 0};
        gbl_panel_general.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
        gbl_panel_general.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
        panel_general.setLayout(gbl_panel_general);
        
        JLabel lbl_IsAutorized = new JLabel("New label");
        lbl_IsAutorized.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_IsAutorized.setVisible(false);
        
        JLabel nlbTitulo = new JLabel("Nombre_restaurante");
        nlbTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        nlbTitulo.setFont(new Font("Mistral", Font.BOLD, 20));
        nlbTitulo.setBounds(130, 10, 168, 39);
        GridBagConstraints gbc_nlbTitulo = new GridBagConstraints();
        gbc_nlbTitulo.anchor = GridBagConstraints.NORTH;
        gbc_nlbTitulo.fill = GridBagConstraints.HORIZONTAL;
        gbc_nlbTitulo.insets = new Insets(0, 0, 5, 0);
        gbc_nlbTitulo.gridwidth = 2;
        gbc_nlbTitulo.gridx = 0;
        gbc_nlbTitulo.gridy = 0;
        panel_general.add(nlbTitulo, gbc_nlbTitulo);
        
        lbl_IsAutorized.setBounds(46, 194, 232, 23);
        GridBagConstraints gbc_lbl_IsAutorized = new GridBagConstraints();
        gbc_lbl_IsAutorized.fill = GridBagConstraints.BOTH;
        gbc_lbl_IsAutorized.insets = new Insets(0, 0, 0, 5);
        gbc_lbl_IsAutorized.gridx = 0;
        gbc_lbl_IsAutorized.gridy = 1;
        panel_general.add(lbl_IsAutorized, gbc_lbl_IsAutorized);
        
        JPanel panel_login = new JPanel();
        GridBagConstraints gbc_panel_login = new GridBagConstraints();
        gbc_panel_login.anchor = GridBagConstraints.WEST;
        gbc_panel_login.fill = GridBagConstraints.VERTICAL;
        gbc_panel_login.gridx = 1;
        gbc_panel_login.gridy = 1;
        panel_general.add(panel_login, gbc_panel_login);
        panel_login.setLayout(new BoxLayout(panel_login, BoxLayout.Y_AXIS));
        
        JPanel panel_relleno_arriba = new JPanel();
        panel_relleno_arriba.setPreferredSize(new Dimension(100, 100));
        panel_login.add(panel_relleno_arriba);
        
        JLabel lblNameUser = new JLabel("Nombre de Usuario:");
        panel_login.add(lblNameUser);
        
        JTextField Tbx_user_name = new JTextField();
        Tbx_user_name.setBounds(143, 109, 135, 20);
        Tbx_user_name.setColumns(10);
        panel_login.add(Tbx_user_name);
        
        JLabel lblPassword = new JLabel("Contraseña:");
        panel_login.add(lblPassword);
        
        JPanel panel_password = new JPanel();
        panel_login.add(panel_password);
        panel_password.setLayout(new BoxLayout(panel_password, BoxLayout.X_AXIS));
        
        JPasswordField Tbx_password = new JPasswordField();
        Tbx_password.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Tbx_password.setEchoChar('●');
        Tbx_password.setBounds(106, 139, 160, 21);
        panel_password.add(Tbx_password);
        
        JButton btnShow_password = new JButton("");
        btnShow_password.setIcon(new ImageIcon(interfaz.class.getResource("/Images/hide_password.png")));
        btnShow_password.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		ShowPass(Tbx_password, btnShow_password);;
        	}
        });
        btnShow_password.setBounds(264, 139, 20, 20);
        panel_password.add(btnShow_password);
        
        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//Metodo que consulta a la base de datos si existe el usuario (empleado o administrador)
        		VerificarEmpleado(Tbx_user_name, Tbx_password, lbl_IsAutorized);
        	}
        });
        btnLogin.setBounds(309, 155, 89, 23);
        panel_login.add(btnLogin);
        
        JPanel panel_relleno_abajo = new JPanel();
        panel_relleno_abajo.setPreferredSize(new Dimension(100, 100));
        panel_login.add(panel_relleno_abajo);
        
        // Listener para centrar el panel cuando cambie el tamaño de la ventana
        contentPane.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                int x = (contentPane.getWidth() - panel_general.getWidth()) / 2;
                int y = (contentPane.getHeight() - panel_general.getHeight()) / 2;
                panel_general.setLocation(x, y); // Actualizamos la posición para centrarlo
            }
        });;
        
        bindEscapeKey();
        
	}
	
	private void bindEscapeKey() {
        // Obtener InputMap y ActionMap del contentPane
        InputMap inputMap = contentPane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actionMap = contentPane.getActionMap();

        // Asignar la tecla Esc a una acción
        inputMap.put(KeyStroke.getKeyStroke("ESCAPE"), "exitFullScreen");
        actionMap.put("exitFullScreen", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitFullScreen();
            }
        });
        
    }

    private void exitFullScreen() {
        dispose();
        setUndecorated(false);           // Mostrar el borde de la ventana
        setExtendedState(JFrame.NORMAL); // Salir de pantalla completa
        setBounds(100, 100, 800, 600);  // Restaurar tamaño estándar
        setVisible(true);
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
