/**
 * SDEV460 Assignment 1 Login Application
 * By Mark Kardash
 * 21 March 2024
 */
package assignment1SDEV460LoginApplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class SDEV460LoginAppMarkKardash {
	
	/* Importing all functions necessary for the app (Using WindowBuilder) */
	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SDEV460LoginAppMarkKardash window = new SDEV460LoginAppMarkKardash();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SDEV460LoginAppMarkKardash() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	/* Method to record login attempts in log */
	public static void logRecord(String username) {
		String dateFormat = "yyyy/MM/dd HH:mm:ss";
		SimpleDateFormat timestamp = new SimpleDateFormat(dateFormat);
		String log = "Username: " + username + " Attempted login timestamp: " + timestamp + "\n";
		BufferedWriter logwriter = null;
		
		try {
			logwriter = new BufferedWriter(new FileWriter("AttemptLog.txt", true));
			logwriter.write(log);
		}
		catch (IOException io) {
			System.out.println("File IO Exception" + io.getMessage());
		}
		finally {
			try {
				if (logwriter != null) {
					logwriter.close();
				}
			}
			catch (IOException io) {
				System.out.println("Issue closing the file." + io.getMessage());
			}
		}
		
	}
	
	/*Creating method to use with the login button*/
	public void userLogin() {
		/* Hardcoding the valid username and password*/
		String validUsername = "TestUser";
		String validPassword = "1234";
		
		/*Fields for user to enter credentials*/
		String username = textField.getText();
		String password = passwordField_2.getText();
		logRecord(username);
		
		/*"If" loop for messages in case of login success or error*/
		if (username.contains(validUsername) && password.contains(validPassword))
		{
			JOptionPane.showMessageDialog(null, "Congratulations! You have logged in successfully!",
					"Login Success", JOptionPane.INFORMATION_MESSAGE);
			
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Oops, invalid Credentials! Please try again!",
					"Login Failure", JOptionPane.ERROR_MESSAGE);
		}
	}
	/*Creating window and buttons of the app using the "Design" feature*/
	
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 644, 368);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		/*Setting up main window*/
		JLabel lblNewLabel = new JLabel("WELCOME! PLEASE LOGIN:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(108, 31, 349, 46);
		frame.getContentPane().add(lblNewLabel);
		
		/*Creating "Username" label*/
		JLabel lblNewLabel_1 = new JLabel("USERNAME:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(41, 104, 148, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		/*Creating "Password" label*/
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1_1.setBounds(41, 137, 148, 22);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		/*Creating username field*/
		textField = new JTextField();
		textField.setBounds(199, 104, 298, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		/*Creating password field*/
		passwordField = new JPasswordField();
		passwordField.setBounds(199, 151, 29, -6);
		frame.getContentPane().add(passwordField);
		
		/*Creating two more password fields for easier reset. Final will be used as main*/
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(248, 142, -42, 22);
		frame.getContentPane().add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(199, 137, 298, 25);
		frame.getContentPane().add(passwordField_2);
		
		/*Creating and activating "LOGIN" button*/
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userLogin();
			}
		});
		
		/*Creating and activating "RESET" button*/
		btnNewButton.setBounds(21, 263, 120, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField_2.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReset.setBounds(237, 263, 120, 31);
		frame.getContentPane().add(btnReset);
		
		/*Creating and activating "CANCEL" button*/
		JButton btnExit = new JButton("CANCEL");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExit.setBounds(484, 263, 120, 31);
		frame.getContentPane().add(btnExit);
	}
	
	
}

