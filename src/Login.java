import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public static void main(String[] args) {

		Login frame = new Login();
		frame.setVisible(true);

	}

	
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
<<<<<<< HEAD
		setTitle("Login");
		
=======
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(286, 187, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(335, 227, 89, 23);
		contentPane.add(btnBack);
>>>>>>> refs/heads/Alumno1
	}
}
