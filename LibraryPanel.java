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
    JButton rbr,rbk,fl,ol,borrower,book,loan;
    JTextField txt; 
    //JList li;
    public LibraryPanel(){
        //배치관리자 설정
        this.setLayout(new BorderLayout());

        ml = new JLabel("Library Application");
        ml.setFont(new Font("Serif", Font.BOLD+Font.ITALIC, 25));
        ml.setHorizontalAlignment(SwingConstants.CENTER);
        
        this.add(ml, BorderLayout.NORTH);
        
        //아래에 CenterPanel 클래스가 정의되어 있음.
        CenterPanel cp = new CenterPanel();
        this.add(cp, BorderLayout.CENTER);        

        txt = new JTextField(10);       

        LibraryListener listener = new  LibraryListener ();

        rbr.addActionListener(listener);
        rbk.addActionListener(listener);
        fl.addActionListener(listener); 
        ol.addActionListener(listener);
        borrower.addActionListener(listener);
        book.addActionListener(listener); 
        loan.addActionListener(listener);

        //borrower.addActionListener(this);
        // book.addActionListener(this);
        // loan.addActionListener(this); 
    }
    class CenterPanel extends JPanel {
        public CenterPanel() {
            GridLayout gd = new GridLayout(4, 2);
            gd.setVgap(40);
            gd.setHgap(10);
            this.setLayout(gd);
            rbr = new JButton("RegisterBorrower");
            rbk = new JButton("RegisterBook");
            fl = new JButton("ForLoan");
            ol = new JButton("OnLoan");
            borrower = new JButton("Borrower");
            book = new JButton("Book");
            loan = new JButton("Loan");
            JButton[] btnArray = {rbr, rbk, fl, ol, borrower, book, loan};
            for(JButton btn : btnArray) 
                this.setFontForButton(btn);
            this.add(rbr);
            this.add(rbk);
            this.add(fl);
            this.add(ol);
            this.add(borrower);
            this.add(book);
            this.add(loan);
        }
        private void setFontForButton(JButton btn) {
            btn.setFont(new Font("Serif", Font.BOLD+Font.ITALIC, 14));
        }
    }
}
