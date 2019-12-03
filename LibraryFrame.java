import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.net.*;
import java.io.*;
/**
 * JFrame를 상속받는  LibraryFrame 클래스.
 * 
 * @author (2018315056 우메모토 세이야, 2018315036 양유석, 2018315030 이가영, 2018315053 테라오카 유이카) 
 * @version (2019.11.28)
 */
public class LibraryFrame extends JFrame
{
    JLabel ml;
    JPanel mp;
    JButton rbr,rbk,fl,ol,borrower,book,loan;
    Library lib;
    BufferedImage img;
    public LibraryFrame(Library lib, String title){
        this.lib = lib;
        this.setTitle(title);
        this.setSize(300,400);
        
        try{
            BufferedImage img = ImageIO.read(new File("images/libraryimage3.jpg"));
            this.setContentPane(new JLabel(new ImageIcon(img)));
        }catch(IOException e){
        }
        this.setLayout(new BorderLayout());
        mp = new LibraryPanel(lib, title);

        mp.setOpaque(false);
        this.add(mp);
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

