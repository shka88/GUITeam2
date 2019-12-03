import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
    // borrower,book,loan;
    JTextField txt;
    //JList li;
    Library lib;
    public LibraryPanel(Library lib){
        this.lib = lib;
        //배치관리자 설정
        this.setLayout(new BorderLayout());

        ml = new JLabel("Library Application");
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
        // borrower.addActionListener(listener);
        // book.addActionListener(listener); 
        // loan.addActionListener(listener);

        //borrower.addActionListener(this);
        // book.addActionListener(this);
        // loan.addActionListener(this);
    }
    class CenterPanel extends JPanel {
        public CenterPanel() {
            GridLayout gd = new GridLayout(3, 2);
            gd.setVgap(80);
            gd.setHgap(10);
            this.setLayout(gd);
            rbr = new JButton("RegisterBorrower");
            rbk = new JButton("RegisterBook");
            fl = new JButton("ForLoan");
            ol = new JButton("OnLoan");
            lbk = new JButton("LendBook");
            rtbk = new JButton("ReturnBook");
            // borrower = new JButton("Borrower");
            // book = new JButton("Book");
            // loan = new JButton("Loan");
            JButton[] btnArray = {rbr, rbk, fl, ol, lbk, rtbk};
            for(JButton btn : btnArray) 
                this.setDesignForButton(btn);
            this.add(rbr);
            this.add(rbk);
            this.add(fl);
            this.add(ol);
            this.add(lbk);
            this.add(rtbk);
            // this.add(borrower);
            // this.add(book);
            // this.add(loan);
        }
        private void setDesignForButton(JButton btn) {
            btn.setOpaque(true);
            btn.setFont(new Font("Serif", Font.BOLD+Font.ITALIC, 50));
            btn.setMargin(new Insets(10, 10, 10, 10));
        }
    }
    public int makeCatalogueNumber(int item) {
        //일련번호 = 장르+초+분+연+월+일
        LocalDateTime ld = LocalDateTime.now();
        String smh = ld.format(DateTimeFormatter.ofPattern("ssmmHH"));
        String u = ld.format(DateTimeFormatter.ofPattern("uu"));
        String md = ld.format(DateTimeFormatter.ofPattern("MMdd"));
        String result = "";
        result += item + "00" + smh + u + md;
        return Integer.parseInt(result);
    }
}
