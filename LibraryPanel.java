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
        rbr = new JButton("RegisterBorrower");
        rbk = new JButton("RegisterBook");
        fl = new JButton("ForLoan");
        ol = new JButton("OnLoan");
        borrower = new JButton("Borrower");
        book = new JButton("Book");
        loan = new JButton("Loan");
        
        
        
        txt = new JTextField(10);

        ml = new JLabel("Library Application");
        this.add(ml);

        this.add(rbr);
        this.add(rbk);
        this.add(fl);
        this.add(ol);
        this.add(borrower);
        this.add(book);
        this.add(loan);

        
        


        
        LibraryListenenr listener = new  LibraryListenenr ();

        rbr.addActionListener(new LibraryListenenr ());
        rbk.addActionListener(new LibraryListenenr ());
        fl.addActionListener(new LibraryListenenr ()); 
        ol.addActionListener(new LibraryListenenr ());
        borrower.addActionListener(new LibraryListenenr ());
        book.addActionListener(new LibraryListenenr ()); 
        loan.addActionListener(new LibraryListenenr ());

        //borrower.addActionListener(this);
        // book.addActionListener(this);
        // loan.addActionListener(this); 
    }
}
