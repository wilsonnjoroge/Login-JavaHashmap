package Log_in_2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class LoginPage2 implements ActionListener {
    JFrame frame2 = new JFrame();
    JButton loginButton2 = new JButton("Log in");
    JButton resetButton2 = new JButton("Reset");
    JTextField userIDField2 = new JTextField();
    JPasswordField userPasswordField2 = new JPasswordField();
    JLabel userIDLabel2 = new JLabel("User ID:");
    JLabel userPasswordLabel2 = new JLabel("Password:");
    JLabel messageLabel2 = new JLabel();
    HashMap<String, String> logininfo2 = new HashMap<String, String>();

    LoginPage2(HashMap<String, String> loginInfo2Original){
        logininfo2 = loginInfo2Original;

        userIDLabel2.setBounds(50, 100, 75,25);
        userPasswordLabel2.setBounds(50, 150, 75,25);

        messageLabel2.setBounds(125,250,250,35);
        messageLabel2.setFont(new Font(null,Font.ITALIC, 25));

        userIDField2.setBounds(125,100,200,25);
        userPasswordField2.setBounds(125,150,200,25);

        loginButton2.setBounds(125,200,100,25);
        loginButton2.setFocusable(false);
        loginButton2.addActionListener(this);

        resetButton2.setBounds(225,200,100,25);
        resetButton2.setFocusable(false);
        resetButton2.addActionListener(this);

        frame2.add(userIDField2);
        frame2.add(userPasswordField2);
        frame2.add(messageLabel2);
        frame2.add(userIDLabel2);
        frame2.add(userPasswordLabel2);
        frame2.add(loginButton2);
        frame2.add(resetButton2);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(420, 420);
        frame2.setLayout(null);
        frame2.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== resetButton2){
            userIDField2.setText("");
            userPasswordField2.setText("");
        }

        if (e.getSource()== loginButton2){
            String userID = userIDField2.getText();
            String password = String.valueOf(userPasswordField2.getPassword());

            if(logininfo2.containsKey(userID)){
                if(logininfo2.get(userID).equals(password)){
                    messageLabel2.setForeground(Color.green);
                    messageLabel2.setText("Login Succesful");
                    WelcomePage2 welcomePage2 = new WelcomePage2();
                }
                else{
                    messageLabel2.setForeground(Color.red);
                    messageLabel2.setText("Wrong Password");
                }

            }
            else{
                messageLabel2.setForeground(Color.red);
                messageLabel2.setText("Username Not Found, Please register");
            }


        }

    }
}
