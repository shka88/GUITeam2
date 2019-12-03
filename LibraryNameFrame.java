import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;
/**
 *도서관의 이름을 지정해주는 Frame.
 *
 * @author (2018315056 우메모토 세이야, 2018315036 양유석, 2018315030 이가영, 2018315053 테라오카 유이카)
 * @version (2019/12/03)
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
        tf.addActionListener(this);
        
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
        new LibraryFrame(lib, tf.getText());
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
