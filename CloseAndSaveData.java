import java.awt.event.*;
import java.io.*;
import java.util.*;
/**
 * Write a description of class CloseAndSaveData here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CloseAndSaveData extends WindowAdapter
{
    HashSet<Borrower> borrowers;
    TreeSet<Book> books;
    LinkedList<Loan> loans;
    public CloseAndSaveData(HashSet<Borrower> borrowers,TreeSet<Book> books,LinkedList<Loan> loans){
        
    }
    public void windowClosing​(WindowEvent e){
        try{
            FileWriter out = new FileWriter("Library.csv",true);
            
            BufferedWriter writer = new BufferedWriter(out);
        }
        catch(Exception ex){
        }
        System.exit(0);
    }
}
