 import javax.swing.*;
/**
 * 여기에 LibraryFrame 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class LibraryFrame extends JFrame 
{
    JLabel ml;
    JPanel mp;
    JButton rbr,rbk,fl,ol,borrower,book,loan;
    public LibraryFrame(){
        this.setTitle("체크박스 만들기 예제");
        this.setSize(300,400);
        
        mp = new LibraryPanel();
        this.add(mp);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
