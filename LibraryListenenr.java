import javax.swing.*;
import java.awt.event.*;
/**
 * 여기에 LibraryListenenr 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class LibraryListenenr implements ActionListener
{
    JButton rbr,rbk,fl,ol,borrower,book,loan;
    JTextField txt; 
    public LibraryListenenr(){
        
        rbr.addActionListener(this);
        rbk.addActionListener(this);
        fl.addActionListener(this); 
        ol.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        Object obj = e.getSource();
        
        if(obj == rbr){
            String strName = JOptionPane.showInputDialog(null,"name");
            txt.setText(strName);
        }
        else if(obj == rbk){
            String strBook = JOptionPane.showInputDialog(null,"title");
            txt.setText(strBook);
            
            String strAuthor = JOptionPane.showInputDialog(null,"author");
            txt.setText(strAuthor);
            
        }
        else if(obj == fl){
            String str = JOptionPane.showInputDialog(null,"title");
            txt.setText(str);
            
            String strAuthor = JOptionPane.showInputDialog(null,"author");
            txt.setText(strAuthor);
            
            String strNumber = JOptionPane.showInputDialog(null,"catalogueNumber");
            txt.setText(strNumber);
        }
        else if(obj == ol){
            String str = JOptionPane.showInputDialog(null,"title");
            txt.setText(str);
            
            String strAuthor = JOptionPane.showInputDialog(null,"author");
            txt.setText(strAuthor);
            
            String strNumber = JOptionPane.showInputDialog(null,"catalogueNumber");
            txt.setText(strNumber);
        }
        else{
            return;
        }
    }
}
