import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.awt.*;
/**
 * 여기에 LibraryListenenr 클래스 설명을 작성하십시오.
 * 
 * @author (2018315056 우메모토 세이야, 2018315036 양유석, 2018315030 이가영, 2018315053 테라오카 유이카) 
 * @version (버전번호나 날짜)
 */
public class LibraryListenenr extends JComponent implements ActionListener
{
    JTextField text, text2, text3, text4 ; 
    JList<String> jlBorrower,jlBook, jlLoan;
    JButton rbr,rbk,fl,ol,borrower,book,loan;
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
        else if(((JButton)e.getSource()).getText().equals("Book")){
            String[] jiBook= {"대출 가능한 책"};
            JList list1 = new JList<String> (jiBook); 
            JScrollPane sp1 = new JScrollPane();
            sp1.getViewport().setView(list1); 
            sp1.setPreferredSize(new Dimension(200, 80));
            JPanel p1 = new JPanel();
            p1.add(sp1); 

            
        }
        else if(((JButton)e.getSource()).getText().equals("Borrower")){
            String[] jlBorrower = {"등록된 이용자"};                        
            JList list2 = new JList<String> (jlBorrower); 

            JScrollPane sp2 = new JScrollPane();
            sp2.getViewport().setView(list2); 
            sp2.setPreferredSize(new Dimension(200, 80));
            JPanel p2 = new JPanel();
            p2.add(sp2);    //パネルにスクロールペインを追加
        }
        else if(((JButton)e.getSource()).getText().equals("Loan")){                              
            String[] jlLoan = {"대출 되어 있는 책 컬랙션"};                        
            JList list3 = new JList<String> (jlLoan); 

            JScrollPane sp3 = new JScrollPane();
            sp3.getViewport().setView(list3); 
            sp3.setPreferredSize(new Dimension(200, 80));
            JPanel p3 = new JPanel();
            p3.add(sp3);    //パネルにスクロールペインを追加
        }
        else{
            return;
        }
    }
}
