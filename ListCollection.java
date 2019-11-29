import javax.swing.*;
import java.awt.*;
import java.util.Vector;
import java.awt.event.*;
import javax.swing.event.*;
/**
 * Borrower, Book, Loan Collection를 구현하는 클래스.
 * 
 * @author (2018315056 우메모토 세이야, 2018315036 양유석, 2018315030 이가영, 2018315053 테라오카 유이카) 
 * @version (2019.11.2)
 */
public class ListCollection extends JFrame 
{
    protected JList list;
    protected JTextField text;
    protected DefaultListModel model;
    
    JButton borrower,book,loan;
    public ListCollection(){
        //ListCollection test = new ListCollection("");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setBounds( 10, 10, 250, 180);
        this.setVisible(true);
        
        
        
    }

    protected ListCollection(String title){
       
        setTitle(title);
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

        //JButton addButton = new JButton("AddElement");
        //addButton.addActionListener(this);
        //addButton.setActionCommand("addButton");

        //JButton insertButton = new JButton("Add");
        //insertButton.addActionListener(this);
        //insertButton.setActionCommand("insertButton");

        //JPanel p2 = new JPanel();
        //p2.add(addButton);
        //p2.add(insertButton);

        //getContentPane().add(p2, BorderLayout.SOUTH);

        text = new JTextField(10);
        JPanel p3 = new JPanel();
        p3.add(text);

        getContentPane().add(p3, BorderLayout.NORTH);
    }

    //public void actionPerformed(ActionEvent e){
    // String actionCommand = e.getActionCommand();

    // if (actionCommand.equals("addButton")){
    //  model.addElement(text.getText());

    // list.ensureIndexIsVisible(model.getSize() - 1);
    // }else if (actionCommand.equals("insertButton")){
    // 현재 리스트에서 선택하고 있는 항목의 index를 찾는다.            
    //   int index = list.getSelectedIndex();
    //   if (index == -1){
    //      model.add(0, text.getText());
    //   }else{
    //      model.add(index + 1, text.getText());
    //   }

    //  list.ensureIndexIsVisible(index + 1);
    //  }else{
    //      return;
}

