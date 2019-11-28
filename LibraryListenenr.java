import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

/**
 * 여기에 LibraryListenenr 클래스 설명을 작성하십시오.
 * 
 * @author (2018315056 우메모토 세이야, 2018315036 양유석, 2018315030 이가영, 2018315053 테라오카 유이카) 
 * @version (버전번호나 날짜)
 */
public class LibraryListenenr implements ActionListener
{
    JTextField text; 
    JList<String> jl;
    public LibraryListenenr(){
        // rbr.addActionListener(this);
        // rbk.addActionListener(this);
        // fl.addActionListener(this); 
        // ol.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
            //Object obj = e.getSource();
            if(((JButton)e.getSource()).getText().equals("RegisterBorrower")){                      
                String text = JOptionPane.showInputDialog(null,"name","Borrower",
                JOptionPane.INFORMATION_MESSAGE);

                JOptionPane.showMessageDialog(null,"Registered"+ text);
                
                
                //txt.setText(strName); 
                //JOptionPane.PLAIN_MESSAGE, null, null, null);
                //System.out.println("strName : " + strName); //입력한 단어가 리턴된다.

            }
            else if(((JButton)e.getSource()).getText().equals("RegisterBook")){
                String strBook = JOptionPane.showInputDialog(null,"title");
                text.setText(strBook);

                String strAuthor = JOptionPane.showInputDialog(null,"author");
                text.setText(strAuthor);
    
            }
            else if(((JButton)e.getSource()).getText().equals("ForLoan")){
                String str = JOptionPane.showInputDialog(null,"title");
                text.setText(str);
    
                String strAuthor = JOptionPane.showInputDialog(null,"author");
                text.setText(strAuthor);
    
                String strNumber = JOptionPane.showInputDialog(null,"catalogueNumber");
                text.setText(strNumber);
            }
            else if(((JButton)e.getSource()).getText().equals("OnLoan")){
                String str = JOptionPane.showInputDialog(null,"title");
                text.setText(str);
    
                String strAuthor = JOptionPane.showInputDialog(null,"author");
                text.setText(strAuthor);
    
                String strNumber = JOptionPane.showInputDialog(null,"catalogueNumber");
                text.setText(strNumber);
            }
            else if(((JButton)e.getSource()).getText().equals("Borrower")){
                String jlBorrower[]= {"대출가능한 책"};
                jl = new JList(jlBorrower); 
            }
            else if(((JButton)e.getSource()).getText().equals("Book")){
                String jlBook[]= {"등록된 이용자"};                        
                jl = new JList(jlBook);   
            }
            else if(((JButton)e.getSource()).getText().equals("Loan")){
                String jlLoan[]= {"대출 되어 있는 책 컬랙션"};                        
                jl = new JList(jlLoan);          
            }
            else{
                return;
            }
    }
}
