import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class WelcomeApplet extends Applet implements ActionListener {
    Label lblName;
    TextField txtName;
    TextField txtDisp;

    public void init(){
        lblName = new Label("Input Your Name");
        txtName = new TextField(8);
        txtDisp = new TextField(20);
        add(lblName);
        add(txtName);
        add(txtDisp);
        txtName.addActionListener((this));
    }
    public void actionPerformed(ActionEvent e) {
        txtDisp.setText(txtName.getText() + "Welcome to JAVA World" );
    }

    public static void main(String args[]) {
        Frame f = new Frame("Welcome");
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }    
        });
        WelcomeApplet a = new WelcomeApplet();
        a.init();
        f.add("Center", a);
        f.setSize(400,300);
        f.show();
        a.start();
    }
}