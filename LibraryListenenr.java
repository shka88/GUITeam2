import javax.swing.*;
import java.awt.event.*;
/**
 * 여기에 LibraryListenenr 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class LibraryListenenr extends LibraryPanel implements ActionListener
{
    JButton rbr,rbk,fl,ol,borrower,book,loan;
    JTextField txt;
    public void actionPerformed(ActionEvent e){
        Object obj = e.getSource();
        if(obj == rbr){
            String strName = JOptionPane.showInputDialog(null,"이름");
            txt.setText(strName);
        }
        else if(obj == rbk){
            String strBook = JOptionPane.showInputDialog(null,"책 제목");
            txt.setText(strBook);
            
            String str = JOptionPane.showInputDialog(null,"이름");
            txt.setText(str);
        }
        else if(obj == fl){
            String str = JOptionPane.showInputDialog(null,"이름");
            txt.setText(str);
        }
    }
}
