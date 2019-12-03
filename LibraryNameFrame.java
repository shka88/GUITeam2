import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;
/**
 * Write a description of class LibraryNameFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LibraryNameFrame extends JFrame implements ActionListener, WindowListener
{
    JLabel lb;
    JTextField tf;
    JButton btn;
    public LibraryNameFrame() {
        this.setTitle("Type a library name");
        this.setLayout(new FlowLayout());
        
        lb = new JLabel("Type a library name: ");
        
        tf = new JTextField(20);
        // tf.addActionListener(this);
        
        btn = new JButton("Enter");
        btn.addActionListener(this);
        
        this.add(lb);
        this.add(tf);
        this.add(btn);
        
        this.setSize(400, 100);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        Library lib = new Library(tf.getText());
        
        new LibraryFrame(lib);
        this.setVisible(false);
    }
    public void windowActivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowClosing(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}
}
