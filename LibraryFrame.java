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
    public LibraryFrame() throws IOException{
        this.setTitle("Library Application");
        this.setSize(300,400);
        
        BufferedImage img = ImageIO.read(new File("images/libraryImage.jpg"));
        this.setContentPane(new JLabel(new ImageIcon(img)));
        
        this.setLayout(new BorderLayout());
        mp = new LibraryPanel();
        mp.setOpaque(false);
        this.add(mp);
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    class ImagePanel extends JPanel {
        private Image img;
        public ImagePanel(String img) {
            this(new ImageIcon(img).getImage());
        }

        public ImagePanel(Image img) {
            this.img = img;
            Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
            setPreferredSize(size);
            setMinimumSize(size);
            setMaximumSize(size);
            setSize(size);
            setLayout(null);
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, this);
        }
    }
}

