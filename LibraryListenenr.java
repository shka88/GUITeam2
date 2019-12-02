import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.awt.*;
/**
 * LibraryListenenr를 구현하는 클래스.
 * 
 * @author (2018315056 우메모토 세이야, 2018315036 양유석, 2018315030 이가영, 2018315053 테라오카 유이카) 
 * @version (2019.11.29)
 */
public class LibraryListenenr extends JFrame implements ActionListener
{
    JTextField text, text2, text3, text4 ; 

    JButton rbr,rbk,fl,ol,borrower,book,loan;

    protected JList list;
    //protected JTextField t;
    protected DefaultListModel model;
    JFrame jf = new JFrame();
    public LibraryListenenr(){
        // rbr.addActionListener(this);
        // rbk.addActionListener(this);
        // fl.addActionListener(this); 
        // ol.addActionListener(this);
    }

    protected JList ListCollection(String title){

        setTitle(title);
        model = new DefaultListModel();

        list = new JList(model);
        JScrollPane sp = new JScrollPane();
        sp.getViewport().setView(list);
        sp.setPreferredSize(new Dimension(200, 80));

        JPanel p = new JPanel();
        p.add(sp);

        getContentPane().add(p, BorderLayout.CENTER);
        text = new JTextField(10);
        JPanel p3 = new JPanel();
        p3.add(text);

        getContentPane().add(p3, BorderLayout.NORTH);
        return list;

    }

    public void actionPerformed(ActionEvent e){
        //Object obj = e.getSource();
        jf.setBounds( 10, 10, 250, 180);

        if(((JButton)e.getSource()).getText().equals("RegisterBorrower")){                      
            String text = JOptionPane.showInputDialog(null,"name","Borrower",
                    JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null,"Registered");

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

            String text = JOptionPane.showInputDialog(null,"name","OnLoan",
                    JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null,"Registered");

            String text2 = JOptionPane.showInputDialog(null,"catalogueNumber","OnLoan",
                    JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null,"Registered");

        }
        else if(((JButton)e.getSource()).getText().equals("Borrower")){
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
        else if(((JButton)e.getSource()).getText().equals("Book")){
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
        }else{
            return;
        }
    }
}
