package person;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignIn {
	static JTextField txtUserName ;
	static JPasswordField txtPassword;
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Login");
		
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		Components(panel);
		frame.setVisible(true);

	}

	private static void Components(JPanel panel) {

		panel.setLayout(null);

		JLabel userLabel = new JLabel("Username:");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		txtUserName = new JTextField(20);
		txtUserName.setBounds(100, 10, 160, 25);
		panel.add(txtUserName);

		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);

        txtPassword = new JPasswordField(20);
		txtPassword.setBounds(100, 40, 160, 25);
		panel.add(txtPassword);

		JButton btnLogin = new JButton("login");
		btnLogin.setBounds(10, 80, 80, 25);
		panel.add(btnLogin);
		 //Add action listener to button
		btnLogin.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e)
            {
            	
            	Login signin = new Login();
                String name = txtUserName.getText();
                char[]  passArr = txtPassword.getPassword();
                String pass = new String(passArr);
            	signin.login(name,pass);							                            	                    
            }
        });      
		
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(180, 80, 80, 25);
		panel.add(btnRegister);
		btnRegister.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
               
                System.out.println("You clicked the Register button.");
                
            }
        });      
	}

}
