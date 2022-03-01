/**
 * Roller coaster
 * 
 * modified     20220224
 * date         20220224
 * @filename    Rollercoaster.java
 * @author      Michael Zhou
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Rollercoaster extends JFrame {

	private JPanel contentPane;
	private JTextField heightCm;
	private JTextField BackTroubleText;
	private JTextField HeartTroubleText;
	private JTextField TextResponse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rollercoaster frame = new Rollercoaster();
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
	public Rollercoaster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("Rollercoaster Ride");
		title.setFont(new Font("Tahoma", Font.PLAIN, 16));
		title.setBounds(150, 11, 147, 14);
		contentPane.add(title);
		
		JLabel lblHeightInCm = new JLabel("Height in cm?");
		lblHeightInCm.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblHeightInCm.setBounds(29, 70, 72, 14);
		contentPane.add(lblHeightInCm);
		
		JLabel lblBackInTr = new JLabel("Back Trouble (Y/N)?");
		lblBackInTr.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblBackInTr.setBounds(29, 95, 100, 14);
		contentPane.add(lblBackInTr);
		
		JLabel lblHeartTroubleyn = new JLabel("Heart Trouble (Y/N)?");
		lblHeartTroubleyn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblHeartTroubleyn.setBounds(29, 124, 100, 14);
		contentPane.add(lblHeartTroubleyn);
		
		heightCm = new JTextField();
		heightCm.setBounds(253, 67, 86, 20);
		contentPane.add(heightCm);
		heightCm.setColumns(10);
		
		BackTroubleText = new JTextField();
		BackTroubleText.setColumns(10);
		BackTroubleText.setBounds(253, 92, 86, 20);
		contentPane.add(BackTroubleText);
		
		HeartTroubleText = new JTextField();
		HeartTroubleText.setColumns(10);
		HeartTroubleText.setBounds(253, 121, 86, 20);
		contentPane.add(HeartTroubleText);
		
		TextResponse = new JTextField();
		TextResponse.setColumns(10);
		TextResponse.setBounds(29, 165, 342, 20);
		contentPane.add(TextResponse);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(40, 212, 89, 23);
		contentPane.add(btnCalculate);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(250, 212, 89, 23);
		contentPane.add(btnExit);
		
		btnExit.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent evt) {
	            btnExitActionPerformed(evt);
	        }
	    });
	    
	    btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
	}
	
	private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0); 
    };
    
    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	String input1, input2, input3;
    	int height = 0;
    	char backTrouble = ' ', heartTrouble = ' ';
    	input1 = heightCm.getText();
    	input2 = BackTroubleText.getText().toLowerCase();   	
    	input3 = HeartTroubleText.getText().toLowerCase();
    	
    	if (inputCheck(input2) && inputCheck(input3) && intCheck(input1)) {
    		height = Integer.parseInt(input1);
    		backTrouble = input2.charAt(0);
        	heartTrouble = input3.charAt(0);
        	
        	if (height > 188 || height < 122 || backTrouble == 'y' || heartTrouble == 'y') {
                TextResponse.setText("Sorry, it is not safe for you to ride this roller coaster.");
            } else {
                TextResponse.setText("It is OK for you to ride this roller coaster. Have fun!");
            }
    	} else {
    		 TextResponse.setText("Please enter a valid response.");
    	}
    	
        
        
    }
    
    private static boolean inputCheck(String s) {
    	if (s.length() == 1 && (s.charAt(0) == 'y' || s.charAt(0) == 'n')) {
    		return true;
    	} else {
    		return false;
    	}
    }
    private static boolean intCheck(String s) {
    	try {
			  int a = Integer.parseInt(s);
			  return true;
			}
			catch(Exception e) {
				return false;
			}
    }
}
