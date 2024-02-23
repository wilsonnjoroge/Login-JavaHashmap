package Log_in_2;

import javax.swing.*;
import java.awt.*;

public class WelcomePage2 {
    JFrame frame = new JFrame();
    JLabel welcomLabel = new JLabel("Welcome");

    WelcomePage2(){

        welcomLabel.setBounds(20,20,200,35);
        welcomLabel.setFont(new Font(null,Font.PLAIN, 25));

        frame.add(welcomLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(420,420);
        frame.setLayout(null);
    }
}
