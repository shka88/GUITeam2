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
    JButton btnbr, btnbk;
    protected JList list;
    //protected JTextField t;
    protected DefaultListModel model;
    JFrame jf = new JFrame();
    JTextArea ta;
    JTextField mtfName, mtfTitle, mtfAuthor, mtfCatalogueNumber;
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

    protected JList ListCollection(String title){

        // setTitle(title);
        // model = new DefaultListModel();

        // list = new JList(model);
        // JScrollPane sp = new JScrollPane();
        // sp.getViewport().setView(list);
        // sp.setPreferredSize(new Dimension(200, 80));

        // JPanel p = new JPanel();
        // p.add(sp);

        // getContentPane().add(p, BorderLayout.CENTER);
        // text = new JTextField(10);
        // JPanel p3 = new JPanel();
        // p3.add(text);

        // getContentPane().add(p3, BorderLayout.NORTH);
        return list;

    }

    public void actionPerformed(ActionEvent e){
        //Object obj = e.getSource();
        jf.setBounds( 10, 10, 250, 180);
        JButton btn1 = (JButton)e.getSource();
        if(((JButton)e.getSource()).getText().equals("RegisterBorrower")){                      
            JFrame f = new JFrame();
            f.setTitle("Borrwer");
            f.setSize(300,250);
            f.show();

            JPanel mp = new JPanel();

            JLabel mlName = new JLabel("Name");
            mp.add(mlName);
            mtfName = new JTextField(" ",10);
            mp.add(mtfName);

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
            

            
            JLabel mlTitle = new JLabel("Title");
            mp.add(mlTitle);
            mtfTitle = new JTextField(" ",10);
            mp.add(mtfTitle);

            JLabel mlAuthor = new JLabel("Author");
            mp.add(mlAuthor);
            mtfAuthor = new JTextField(" ",10);
            mp.add(mtfAuthor);
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
            f.setSize(680,300);
            f.show();

            JPanel mp = new JPanel();
            JList jlb = new JList(lib.displayBooksForLoan());
            JScrollPane sp = new JScrollPane(jlb);
            sp.setPreferredSize(new Dimension(500, 250));
            
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
            f.setTitle("ForLoan");
            f.setSize(680,300);
            f.show();

            JPanel mp = new JPanel();
            JList jlb = new JList(lib.displayBooksOnLoan());
            JScrollPane sp = new JScrollPane(jlb);
            sp.setPreferredSize(new Dimension(500, 250));
            
            mp.add(sp);
            f.add(mp);
        }
        else if(((JButton)e.getSource()).getText().equals("LendBook")){
            jf.setVisible(true);
            jf.setTitle("Borrower");
            model = new DefaultListModel();
            StringBuffer sb;
            for (int i = 1 ; i < 15 ; i++){ //나중에 실제 이용자로 바꿈.
                sb = new StringBuffer();
                sb.append("Borrower");
                sb.append(i);
                model.addElement(new String(sb));
            }

            list = new JList(model);
            JScrollPane sp = new JScrollPane();
            sp.getViewport().setView(list);
            sp.setPreferredSize(new Dimension(200, 80));

            JPanel p = new JPanel();
            p.add(sp);
            getContentPane().add(p, BorderLayout.CENTER);

            //text = new JTextField(10);
            JPanel p3 = new JPanel();
            //p3.add(text);
            getContentPane().add(p3, BorderLayout.NORTH);
            p3.add(p);

            jf.add(p3);
        }
        else if(((JButton)e.getSource()).getText().equals("ReturnBook")){
            jf.setVisible(true);
            jf.setTitle("Book");
            model = new DefaultListModel();
            StringBuffer sb;
            for (int i = 1 ; i < 15 ; i++){
                sb = new StringBuffer();
                sb.append("Book");
                sb.append(i);
                model.addElement(new String(sb));
            }

            list = new JList(model);

            JScrollPane sp = new JScrollPane();
            sp.getViewport().setView(list);
            sp.setPreferredSize(new Dimension(200, 80));

            JPanel p = new JPanel();
            p.add(sp);
            getContentPane().add(p, BorderLayout.CENTER);

            //text = new JTextField(10);
            JPanel p3 = new JPanel();
            //p3.add(text);
            getContentPane().add(p3, BorderLayout.NORTH);
            p3.add(p);

            jf.add(p3);
        }
        else if(((JButton)e.getSource()).getText().equals("Loan")){                              

            jf.setVisible(true);
            jf.setTitle("Loan");
            model = new DefaultListModel();
            StringBuffer sb;
            for (int i = 1 ; i < 15 ; i++){
                sb = new StringBuffer();
                sb.append("Loan");
                sb.append(i);
                model.addElement(new String(sb));
            }

            list = new JList(model);

            JScrollPane sp = new JScrollPane();
            sp.getViewport().setView(list);
            sp.setPreferredSize(new Dimension(200, 80));

            JPanel p = new JPanel();
            p.add(sp);
            getContentPane().add(p, BorderLayout.CENTER);

            //text = new JTextField(10);
            JPanel p3 = new JPanel();
            //p3.add(text);
            getContentPane().add(p3, BorderLayout.NORTH);
            p3.add(p);

            jf.add(p3);
        }else if(((JButton)e.getSource()).getText().equals("RegistBook")){
            btnbk.setEnabled(true);
            catalogueNumber = makeCatalogueNumber(jb.getSelectedIndex());
            ta.append("Title: " + mtfTitle.getText() + "\n");
            ta.append("Author: " + mtfAuthor.getText() + "\n");
            ta.append("CatalogueNumber: " + String.format("%015d",catalogueNumber) + "\n");
            ta.append("-------------------------------------------------------------\n");
            boolean check = lib.registerOneBook(mtfTitle.getText(), mtfAuthor.getText(), catalogueNumber);
            if(check){
                ta.append("regist complete");
                btnbk.setEnabled(false);
            }else{
                ta.append("Duplicate Error!\n");
            }
        }else if(((JButton)e.getSource()).getText().equals("RegistBorrower")){
            btnbr.setEnabled(true);
            ta.append("Name: " + mtfName.getText() + "\n");
            ta.append("-------------------------------------------------------------\n");
            boolean check = lib.registerOneBorrower(mtfName.getText());
            if(check){
                ta.append("regist complete");
                btnbr.setEnabled(false);
            }else{
                ta.append("Duplicate Error!\n");
            }
            
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
