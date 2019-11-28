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
    JTextField text, text2, text3, text4 ; 
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
            String text = JOptionPane.showInputDialog(null,"title","Book",
            JOptionPane.INFORMATION_MESSAGE);
            
            JOptionPane.showMessageDialog(null,"Registered");
            

            String text2 = JOptionPane.showInputDialog(null,"author","Book",
            JOptionPane.INFORMATION_MESSAGE);
            
            JOptionPane.showMessageDialog(null,"Registered");

        }
        else if(((JButton)e.getSource()).getText().equals("ForLoan")){
            String text = JOptionPane.showInputDialog(null,"title","ForLoan",
            JOptionPane.INFORMATION_MESSAGE);
            
            JOptionPane.showMessageDialog(null,"Registered");
            

            String text2 = JOptionPane.showInputDialog(null,"author","ForLoan",
            JOptionPane.INFORMATION_MESSAGE);
            
            JOptionPane.showMessageDialog(null,"Registered");
            
            
            String text3 = JOptionPane.showInputDialog(null,"catalogueNumber","ForLoan",
            JOptionPane.INFORMATION_MESSAGE);
            
            JOptionPane.showMessageDialog(null,"Registered");
            
            
        }
        else if(((JButton)e.getSource()).getText().equals("OnLoan")){
            String text = JOptionPane.showInputDialog(null,"name","ForLoan",
            JOptionPane.INFORMATION_MESSAGE);
            
            JOptionPane.showMessageDialog(null,"Registered");
            

            String text2 = JOptionPane.showInputDialog(null,"catalogueNumber","ForLoan",
            JOptionPane.INFORMATION_MESSAGE);
            
            JOptionPane.showMessageDialog(null,"Registered");
            
            
            
        }
        else if(((JButton)e.getSource()).getText().equals("Borrower")){
            String jlBorrower[]= {"대출가능한 책"};
            jl = new JList(jlBorrower); 
        }
        else if(((JButton)e.getSource()).getText().equals("RegisterBorrower")){
            String jlBook[]= {"등록된 이용자"};                        
            jl = new JList(jlBook);   
        }
        else if(((JButton)e.getSource()).getText().equals("RegisterBorrower")){
            String jlLoan[]= {"대출 되어 있는 책 컬랙션"};                        
            jl = new JList(jlLoan);          
        }
        else{
            return;
        }
    }
}
