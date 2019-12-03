import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * LibraryListenenr를 구현하는 클래스.
 * 
 * @author (2018315056 우메모토 세이야, 2018315036 양유석, 2018315030 이가영, 2018315053 테라오카 유이카) 
 * @version (2019.11.29)
 */
public class LibraryListener extends JFrame implements ActionListener
{
    String libName;
    JTextField text, text2, text3, text4 ; 
    JButton btnbr, btnbk ,btnl, btnr;
    protected JList list;
    //protected JTextField t;
    protected DefaultListModel model;
    JTextArea ta;
    JTextField rbrNameTxt, rbkTitleTxt, rbkAuthorTxt, mtflCNum, mtfrName, mtfrCNum, mtflName;
    Library lib;
    long catalogueNumber;
    JComboBox jb;
    public LibraryListener(Library lib){
        this.lib = lib;
        // rbr.addActionListener(this);
        // rbk.addActionListener(this);
        // fl.addActionListener(this); 
        // ol.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        //Object obj = e.getSource();
        // jf.setBounds( 10, 10, 250, 180);
        JButton btn1 = (JButton)e.getSource();
        if(((JButton)e.getSource()).getText().equals("RegisterBorrower")){                      
            JFrame f = new JFrame();
            f.setTitle("Borrwer");
            f.setSize(300,250);
            f.show();

            JPanel mp = new JPanel();

            JLabel rbrNameLabel = new JLabel("Name");
            mp.add(rbrNameLabel);
            rbrNameTxt = new JTextField(" ",10);
            mp.add(rbrNameTxt);

            btnbr = new JButton("RegistBorrower");
            mp.add(btnbr);
            btnbr.addActionListener(this);

            ta = new JTextArea(10,24);
            mp.add(ta);
            f.add(mp);

            //JOptionPane.showConfirmDialog(null,"Register","Borrower",JOptionPane.YES_NO_OPTION);
            //btn1.addActionListener(this);
            //txt.setText(strName); 
            //JOptionPane.PLAIN_MESSAGE, null, null, null);
            //System.out.println("strName : " + strName); //입력한 단어가 리턴된다.

        }
        else if(((JButton)e.getSource()).getText().equals("RegisterBook")){
            JFrame f = new JFrame();
            f.setTitle("Book");
            f.setSize(400,280);
            f.show();
            
            JPanel mp = new JPanel();
            String[] str = {"총류", "철학", "종교", "사회과학", "자연과학", "기술과학", "예술", "언어", "문학", "역사"};
            jb = new JComboBox(str);
            

            
            JLabel rbkTitleLabel = new JLabel("Title");
            mp.add(rbkTitleLabel);
            rbkTitleTxt = new JTextField(" ",10);
            mp.add(rbkTitleTxt);

            JLabel rbkAuthorLabel = new JLabel("Author");
            mp.add(rbkAuthorLabel);
            rbkAuthorTxt = new JTextField(" ",10);
            mp.add(rbkAuthorTxt);
            mp.add(jb);
            btnbk = new JButton("RegistBook");
            mp.add(btnbk);
            btnbk.addActionListener(this);

            ta = new JTextArea(10,30);
            mp.add(ta);
            f.add(mp);

            // ta.append(jl.getText() + " : ");
            // ta.append(tf.getText() + " \n "); 
            // ta.append(jl2.getText() + " : ");
            // ta.append(tf2.getText() + " \n "); 
            // ta.append("----------------------------------------------------------------------------------------");

            //JOptionPane.showConfirmDialog(null,"Register","Book",JOptionPane.YES_NO_OPTION);
        }
        else if(((JButton)e.getSource()).getText().equals("ForLoan")){
            JFrame f = new JFrame();
            f.setTitle("ForLoan");
            f.setSize(750,300);
            f.show();

            JPanel mp = new JPanel();
            JLabel jl = new JLabel("For Loan Book");
            mp.add(jl);
            JList jlb = new JList(lib.displayBooksForLoan());
            JScrollPane sp = new JScrollPane(jlb);
            sp.setPreferredSize(new Dimension(700, 200));
            
            mp.add(sp);
            f.add(mp);

            // ta.append(jl.getText() + " : ");
            // ta.append(tf.getText() + " \n "); 
            // ta.append(jl2.getText() + " : ");
            // ta.append(tf2.getText() + " \n ");
            // ta.append(jl3.getText() + " : ");
            // ta.append(tf3.getText() + " \n "); 
            // ta.append("----------------------------------------------------------------------------------------");

            //JOptionPane.showConfirmDialog(null,"Register","ForLoan",JOptionPane.YES_NO_OPTION);
        }
        else if(((JButton)e.getSource()).getText().equals("OnLoan")){
            JFrame f = new JFrame();
            f.setTitle("OnLoan");
            f.setSize(750,300);
            f.show();

            JPanel mp = new JPanel();
            JLabel jl = new JLabel("On Loan Book");
            mp.add(jl);
            JList jlb = new JList(lib.displayBooksOnLoan());
            JScrollPane sp = new JScrollPane(jlb);
            sp.setPreferredSize(new Dimension(700, 200));
            
            mp.add(sp);
            f.add(mp);
        }
        else if(((JButton)e.getSource()).getText().equals("LendBook")){
            JFrame f = new JFrame();
            f.setTitle("LendBook");
            f.setSize(750,300);
            f.show();

            JPanel mp = new JPanel();

            JLabel mllName = new JLabel("Name");
            mp.add(mllName);
            mtflName = new JTextField(" ",20);
            mp.add(mtflName);
            
            JLabel mllCNum = new JLabel("Book Catalogue Number");
            mp.add(mllCNum);
            mtflCNum = new JTextField(" ",20);
            mp.add(mtflCNum);
            
            btnl = new JButton("Lend");
            mp.add(btnl);
            btnl.addActionListener(this);

            ta = new JTextArea(13,70);
            mp.add(ta);
            f.add(mp);
        }
        else if(((JButton)e.getSource()).getText().equals("ReturnBook")){
            JFrame f = new JFrame();
            f.setTitle("ReturnBook");
            f.setSize(750,300);
            f.show();

            JPanel mp = new JPanel();

            JLabel mlrName = new JLabel("Name");
            mp.add(mlrName);
            mtfrName = new JTextField(" ",20);
            mp.add(mtfrName);
            
            JLabel mlrCNum = new JLabel("Book Catalogue Number");
            mp.add(mlrCNum);
            mtfrCNum = new JTextField(" ",20);
            mp.add(mtfrCNum);
            
            btnr = new JButton("Return");
            mp.add(btnr);
            btnr.addActionListener(this);

            ta = new JTextArea(13,70);
            mp.add(ta);
            f.add(mp);
        }else if(((JButton)e.getSource()).getText().equals("RegistBook")){
            btnbk.setEnabled(true);
            catalogueNumber = makeCatalogueNumber(jb.getSelectedIndex());
            ta.append("Title: " + rbkTitleTxt.getText() + "\n");
            ta.append("Author: " + rbkAuthorTxt.getText() + "\n");
            ta.append("CatalogueNumber: " + String.format("%015d",catalogueNumber) + "\n");
            ta.append("-------------------------------------------------------------\n");
            boolean check = lib.registerOneBook(rbkTitleTxt.getText().trim(), rbkAuthorTxt.getText().trim(), catalogueNumber);
            if(check){
                ta.append("regist complete");
                btnbk.setEnabled(false);
            }else{
                ta.append("Duplicate Error!\n");
            }
            rbkTitleTxt.setText("");
            rbkAuthorTxt.setText("");
        }else if(((JButton)e.getSource()).getText().equals("RegistBorrower")){
            btnbr.setEnabled(true);
            ta.append("Name: " + rbrNameTxt.getText() + "\n");
            ta.append("-------------------------------------------------------------\n");
            boolean check = lib.registerOneBorrower(rbrNameTxt.getText().trim());
            if(check){
                ta.append("regist complete");
                btnbr.setEnabled(false);
            }else{
                ta.append("Duplicate Error!\n");
            }
            rbrNameTxt.setText("");
        }else if(((JButton)e.getSource()).getText().equals("Lend")){
            btnl.setEnabled(true);
            ta.append("Name: " + mtflName.getText() + "\n");
            ta.append("CatalogueNumber: " + mtflCNum.getText() + "\n");
            ta.append("-------------------------------------------------------------\n");
            
            String check = lib.lendOneBook(mtflName.getText().trim(), Long.parseLong(mtflCNum.getText().trim()));
       
            ta.append(check);
            if (check.equals("Lend complete!")){
                btnl.setEnabled(false);
            }
            mtflName.setText("");
            mtflCNum.setText("");
        }else if(((JButton)e.getSource()).getText().equals("Return")){
            
            btnr.setEnabled(true);
            ta.append("Name: " + mtfrName.getText() + "\n");
            ta.append("CatalogueNumber: " + mtfrCNum.getText() + "\n");
            ta.append("-------------------------------------------------------------\n");
            
            lib.returnOneBook(mtfrName.getText().trim(), Long.parseLong(mtfrCNum.getText().trim()));
       
            ta.append("Return complete!\n");
            btnr.setEnabled(false);
            mtfrName.setText("");
            mtfrCNum.setText("");
        }else{
            return;
        }
        
    }

    public void setLib(Library lib) {
        this.lib = lib;
    }
    public long makeCatalogueNumber(int item) {
        // 일련번호 = 장르+초+분+연+월+일
        LocalDateTime ld = LocalDateTime.now();
        String smh = ld.format(DateTimeFormatter.ofPattern("ssmmHH"));
        String u = ld.format(DateTimeFormatter.ofPattern("uu"));
        String md = ld.format(DateTimeFormatter.ofPattern("MMdd"));
        String result = "";
        result += item + "00" + smh + u + md;
        return Long.parseLong(result);
    }
}
