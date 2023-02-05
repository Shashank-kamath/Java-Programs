import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.*;
public class Form {
    public static void main(String[] args){
        JFrame f=new JFrame("User Entry Form developed by Ashwin Bekal");
        f.setVisible(true);
        f.setBounds(0, 0, 500, 300);
        f.setSize(500,300);
        f.setLayout(new FlowLayout());
        System.out.println("\n");
        JLabel l1=new JLabel("Enter your User Name: ");
        f.add(l1);
        JTextField t1=new JTextField(25);
        f.add(t1);
        System.out.println("\n");
        JLabel l2=new JLabel("Enter your Password: ");
        f.add(l2);
        JPasswordField t2=new JPasswordField(25);
        t2.setEchoChar('•');
        f.add(t2);
        System.out.println("\n");
        JButton b=new JButton("Submit your Entry");
        f.add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    URI uri=new URI("https://sahyadri.edu.in/");
                    java.awt.Desktop.getDesktop().browse(uri);
                }catch(Exception f){
                    f.printStackTrace();
                }
            }
        });
    }
}
