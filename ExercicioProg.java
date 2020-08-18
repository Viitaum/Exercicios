import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.Scanner;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class ExercicioProg extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	String login, senha;
	
	
	Scanner leitor = new Scanner(System.in);
	private JPasswordField txtSenha;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExercicioProg frame = new ExercicioProg();
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
	public ExercicioProg() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 347, 202);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFaçaSeuLogin = new JLabel("Fa\u00E7a Seu Login");
		lblFaçaSeuLogin.setFont(new Font("Showcard Gothic", Font.BOLD, 30));
		lblFaçaSeuLogin.setBounds(34, 11, 260, 32);
		contentPane.add(lblFaçaSeuLogin);
		
		JLabel lblLogin = new JLabel("Username :");
		lblLogin.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblLogin.setBounds(10, 54, 100, 23);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Password :");
		lblSenha.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblSenha.setBounds(10, 85, 100, 23);
		contentPane.add(lblSenha);
		
		txtLogin = new JTextField();
		txtLogin.setColumns(10);
		txtLogin.setBounds(103, 54, 168, 20);
		contentPane.add(txtLogin);
		
		
		
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				if ("admin".equals(txtLogin.getText())  && "swordfish".equals(txtSenha.getText())) { 
				JOptionPane.showMessageDialog(null, "Successfully logged in!");

				}
				else
				JOptionPane.showMessageDialog(null, "Invalid username or password!");

		
			
		
				
				
				
				
			}
		});
		btnLogin.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		btnLogin.setBounds(113, 129, 107, 23);
		contentPane.add(btnLogin);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(103, 85, 167, 20);
		contentPane.add(txtSenha);
	}
}
