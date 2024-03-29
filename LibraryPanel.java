import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
/**
 * LibraryPanel를 구현하는 클래스.
 * 
 * @author (2018315056 우메모토 세이야, 2018315036 양유석, 2018315030 이가영, 2018315053 테라오카 유이카) 
 * @version (2019.11.29)
 */
public class LibraryPanel extends JPanel
{
    JLabel ml;
    JButton rbr,rbk,fl,ol,lbk,rtbk;
    JTextField txt;
    Library lib;
    public LibraryPanel(Library lib, String title){
        this.lib = lib;
        this.setLayout(new BorderLayout());

        ml = new JLabel(title);
        ml.setFont(new Font("Serif", Font.BOLD+Font.ITALIC, 70));
        ml.setForeground(Color.WHITE);
        ml.setHorizontalAlignment(SwingConstants.CENTER);
        ml.setOpaque(false);

        this.add(ml, BorderLayout.NORTH);

        //아래에 CenterPanel 클래스가 정의되어 있음.
        CenterPanel cp = new CenterPanel();
        this.add(cp, BorderLayout.CENTER); 
        cp.setOpaque(false);

        txt = new JTextField(10);

        LibraryListener listener = new LibraryListener (lib);

        rbr.addActionListener(listener);
        rbk.addActionListener(listener);
        fl.addActionListener(listener); 
        ol.addActionListener(listener);
        lbk.addActionListener(listener);
        rtbk.addActionListener(listener);
    }
    class CenterPanel extends JPanel {
        public CenterPanel() {
            GridLayout gd = new GridLayout(3, 2);
            gd.setVgap(100);
            gd.setHgap(10);
            this.setLayout(gd);
            rbr = new JButton("RegisterBorrower", new ImageIcon("images/registerBorrower.v1.png"));
            rbk = new JButton("RegisterBook", new ImageIcon("images/registerBook.v1.png"));
            fl = new JButton("ForLoan", new ImageIcon("images/forLoan.v1.png"));
            ol = new JButton("OnLoan", new ImageIcon("images/onLoan.v1.png"));
            lbk = new JButton("LendBook", new ImageIcon("images/lendBook.v1.png"));
            rtbk = new JButton("ReturnBook", new ImageIcon("images/returnBook.v1.png"));
            JButton[] btnArray = {rbr, rbk, fl, ol, lbk, rtbk};
            for(JButton btn : btnArray) 
                this.setDesignForButton(btn);
            this.add(rbr);
            this.add(rbk);
            this.add(fl);
            this.add(ol);
            this.add(lbk);
            this.add(rtbk);
        }
        private void setDesignForButton(JButton btn) {
            btn.setOpaque(true);
            btn.setFont(new Font("Serif", Font.BOLD+Font.ITALIC, 25));
            btn.setMargin(new Insets(10, 10, 10, 10));
            btn.setBackground(new Color(211,211,211));
            btn.setFocusPainted(false);
        }
    }
}
