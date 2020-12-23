/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userlogin;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class Login extends JFrame implements ActionListener {
    
   Container panel;
   JLabel user_label, password_label;
   JTextField userName_text;
   JPasswordField password_text;
   JButton submit;
   
   Login() {
      // Username Label 
      user_label = new JLabel();
      user_label.setText("User Name :");
      userName_text = new JTextField(15);
      // Password Label
      password_label = new JLabel();
      password_label.setText("Password :");
      password_text = new JPasswordField(15);
      // Submit
      submit = new JButton("Login");   
      panel = new Container();

      
      panel.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
      panel.add(user_label);
      panel.add(userName_text);
      panel.add(password_label);
      panel.add(password_text);
      panel.add(submit);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      //onsubmit
      submit.addActionListener(this);
      add(panel, BorderLayout.CENTER);
      setTitle("Login");
      setSize(330,340);
      setResizable(false);
      setVisible(true);
   }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String userName = userName_text.getText();
        String password = password_text.getText();
        String password_vali = "";
        String userName_vali = "";
        String password_vali2 = "";
          
      
        JFrame frame = new JFrame();
      
       //validate if username field is empty 
       if(userName.trim().isEmpty()){
         userName_vali = "\n" +" Username is Required " +"\n" ;
      }else{
          userName_vali = "" ;
      }
       
       //validate if password field is empty 
      if(password.trim().isEmpty()){
          password_vali = " Passowrd is Required ";
      }else{
            password_vali = " ";
      }
      
      //vslidate password length must not be less than 8
      if(password.trim().length() >0  && password.trim().length() < 8){
        password_vali2 = "passowrd must containe 8 or more characters ";
      }else{
           password_vali2 = " ";
      }
      
    if (userName.trim().equals("admin") && password.trim().equals("password")) {
          
    JOptionPane.showMessageDialog(frame,
      "Login was Successful ");
      } else {
        JOptionPane.showMessageDialog(frame,
       " Unable to login " + password_vali + userName_vali + password_vali2 + "" );
      }
      
     
   }
    
    
}
