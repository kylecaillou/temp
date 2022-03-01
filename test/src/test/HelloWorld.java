package test;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class HelloWorld extends JFrame {
	static JButton btnCalculate = new JButton();
	static JTextField InputField1 = new JTextField(5);
	static JTextField InputField2 = new JTextField(5);
	static JTextField Output1 = new JTextField() ;
	static String input;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorld frame = new HelloWorld();
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
	public HelloWorld() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JLabel Label = new JLabel();
		
		
		
		
		add(InputField1);
		add(InputField2);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        add(Label);
        add(btnCalculate);
        setVisible(true);
	}
	{
	btnCalculate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    btnCalculate.setText("Calculate");
    btnCalculate.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCalculateActionPerformed(evt);
        }
    });

	}
	
	private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
		input = InputField1.getText();
    }
	
}
