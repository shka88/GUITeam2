import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
/**
 * 여기에 LibraryPanel 클래스 설명을 작성하십시오.
 * 
 * @author (2018315056 우메모토 세이야, 2018315036 양유석, 2018315030 이가영, 2018315053 테라오카 유이카) 
 * @version (버전번호나 날짜)
 */
public class LibraryPanel extends JPanel
{
    JLabel ml;
    JButton rbr,rbk,fl,ol,borrower,book,loan;
    JTextField txt;
    
    public LibraryPanel(){
        rbr = new JButton("RegisterBorrower");
        rbk = new JButton("RegisterBook");
        fl = new JButton("ForLoan");
        ol = new JButton("OnLoan");

        borrower = new JButton("Borrower");
        book = new JButton("Book");
        loan = new JButton("Loan");
        
        txt = new JTextField(10);
        //FlowLayout fl= new FlowLayout();
        //this.setLayout(fl);

        ml = new JLabel("Library Application");
        this.add(ml);

        //this.setLayout(new FlowLayout(FlowLayout.LEFT), 30,40);

        this.add(rbr);
        this.add(rbk);
        this.add(fl);
        this.add(ol);

        this.add(borrower);
        this.add(book);
        this.add(loan);
        
        // rbr.addActionListener(this);
        // rbk.addActionListener(this);
        // fl.addActionListener(this);
        // ol.addActionListener(this);

        // borrower.addActionListener(this);
        // book.addActionListener(this);
        // loan.addActionListener(this);
        
    }
}
