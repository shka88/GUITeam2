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
public class LibraryListenenr extends JFrame implements ActionListener
{
    JTextField text, text2, text3, text4 ; 
    JList li;
    JButton rbr,rbk,fl,ol,borrower,book,loan;

    protected JList list;
    protected JTextField t;
    protected DefaultListModel model;
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
            
            String text = JOptionPane.showInputDialog(null,"name","OnLoan",
                    JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null,"Registered");

            
            String text2 = JOptionPane.showInputDialog(null,"catalogueNumber","OnLoan",
                    JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showMessageDialog(null,"Registered");


        }
        else if(((JButton)e.getSource()).getText().equals("Book")){
            
            ListCollection test = new ListCollection("Book");

            test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            test.setBounds( 10, 10, 250, 180);
            test.setVisible(true);

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

            JButton addButton = new JButton("AddElement");
            addButton.addActionListener(this);
            addButton.setActionCommand("addButton");

            JButton insertButton = new JButton("Add");
            insertButton.addActionListener(this);
            insertButton.setActionCommand("insertButton");

            JPanel p2 = new JPanel();
            p2.add(addButton);
            p2.add(insertButton);

            getContentPane().add(p2, BorderLayout.SOUTH);

            text = new JTextField(10);
            JPanel p3 = new JPanel();
            p3.add(text);

            getContentPane().add(p3, BorderLayout.NORTH);

            
        }
        else if(((JButton)e.getSource()).getText().equals("Borrower")){
            
            ListCollection test = new ListCollection("Borrower");

            test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            test.setBounds( 10, 10, 250, 180);
            test.setVisible(true);

            model = new DefaultListModel();
            StringBuffer sb;
            for (int i = 1 ; i < 15 ; i++){
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

            JButton addButton = new JButton("AddElement");
            addButton.addActionListener(this);
            addButton.setActionCommand("addButton");

            JButton insertButton = new JButton("Add");
            insertButton.addActionListener(this);
            insertButton.setActionCommand("insertButton");

            JPanel p2 = new JPanel();
            p2.add(addButton);
            p2.add(insertButton);

            getContentPane().add(p2, BorderLayout.SOUTH);

            text = new JTextField(10);
            JPanel p3 = new JPanel();
            p3.add(text);

            getContentPane().add(p3, BorderLayout.NORTH);

            

        }
        else if(((JButton)e.getSource()).getText().equals("Loan")){                              

            ListCollection test = new ListCollection("Loan");

            test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            test.setBounds( 10, 10, 250, 180);
            test.setVisible(true);

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

            JButton addButton = new JButton("AddElement");
            addButton.addActionListener(this);
            addButton.setActionCommand("addButton");

            JButton insertButton = new JButton("Add");
            insertButton.addActionListener(this);
            insertButton.setActionCommand("insertButton");

            JPanel p2 = new JPanel();
            p2.add(addButton);
            p2.add(insertButton);

            getContentPane().add(p2, BorderLayout.SOUTH);

            text = new JTextField(10);
            JPanel p3 = new JPanel();
            p3.add(text);

            getContentPane().add(p3, BorderLayout.NORTH);

        }else{
            return;
        }
    }
}
