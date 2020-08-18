import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExercicioProg2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExercicioProg2 frame = new ExercicioProg2();
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
	public ExercicioProg2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Selecione 2 n\u00FAmeros:");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTitulo.setBounds(47, 11, 335, 60);
		contentPane.add(lblTitulo);
		
		JLabel lblN1_1 = new JLabel("N\u00BA 1:");
		lblN1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblN1_1.setBounds(10, 82, 52, 29);
		contentPane.add(lblN1_1);
		
		JLabel lblN2 = new JLabel("N\u00BA 2:");
		lblN2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblN2.setBounds(10, 133, 52, 19);
		contentPane.add(lblN2);
		
		txtN1 = new JTextField();
		txtN1.setBounds(70, 82, 217, 29);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setColumns(10);
		txtN2.setBounds(72, 123, 217, 29);
		contentPane.add(txtN2);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String N1 = txtN1.getText();
				String N2 = txtN2.getText();
				int x = Integer.parseInt(N1);
				int y = Integer.parseInt(N2);
				String R = "";
				
				
				for (int i=x; i<=y; i++ ) {
				
					if (i>x && y>i) {
						R = R+" "+i;
						
										}			
					
				}
				JOptionPane.showMessageDialog(null, "Os números entre o Nº1 e o Nº2 são: "+ R);
				
			
				
				
				
				
				
				
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnCalcular.setBounds(124, 184, 163, 43);
		contentPane.add(btnCalcular);
	}
}
