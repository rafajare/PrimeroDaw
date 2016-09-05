import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.*;


public class Prueba {

	

		
		JTextField usernameTextField;
		JTextField passwordTextField;
		JButton loginButton;
		JFrame ventanaLogin;
		
	
		public Prueba(){
			ventanaLogin=new JFrame();
			
			ventanaLogin.add(new JLabel("Username"));
		
			
			usernameTextField= new JTextField(20);
			ventanaLogin.add(usernameTextField);
			
			JLabel passwordJLabel = new JLabel("Password");
			ventanaLogin.add(passwordTextField);
			
			passwordTextField=new JTextField(20);
			ventanaLogin.add(passwordTextField);
			
			loginButton =new JButton("Login");
			ventanaLogin.add(loginButton);
			
			ventanaLogin.setSize(400,100);
			ventanaLogin.setVisible(true);
			
		}
		
		class OyenteBoton implements ActionListener {
			public void ActionPermormed(ActionEvent e){
				
			}
		}
}
