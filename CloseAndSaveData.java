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
    public CloseAndSaveData(HashSet<Borrower> borrowers,TreeSet<Book> books){
        this.borrowers = borrowers;
        this.books = books;
    }
    public void windowClosing​(WindowEvent e){
        try{
            FileWriter out = new FileWriter("Library.csv",false);
            BufferedWriter writer = new BufferedWriter(out);
            Iterator<Borrower> itBor = borrowers.iterator();
            while(itBor.hasNext()){
                Borrower bor = itBor.next();
                if (bor.getloans().size() == 0){
                    writer.write(bor + ",null,null,null,null,null");
                    writer.newLine();
                }
                else{
                    Iterator<Loan> itLoan = bor.getloans().iterator();
                    while(itLoan.hasNext()){
                        Loan loan = itLoan.next();
                        Iterator<Book> itBook = books.iterator();
                        while(itBook.hasNext()){
                            Book book = itBook.next();
                            if (book.getLoan().equals(loan)){
                            writer.write(bor + "," + book.getCatalogueNumber()
                                         + "," + book.getTitle()
                                         + "," + book.getAuthor()
                                         + "," + loan.getBorrowDate()
                                         + "," + loan.getReturnDate());
                            }
                        }
                    }
                }
            }
            Iterator<Book> itBook = books.iterator();
            while(itBook.hasNext()){
                Book book = itBook.next();
                if(book.checkIfAvailable() == true){
                    writer.write("null,"+ book.getCatalogueNumber()
                                 + "," + book.getTitle()
                                 + "," + book.getAuthor() + ",null,null");
                }
            }
        }
        catch(Exception ex){
        }
        System.exit(0);
    }
}
