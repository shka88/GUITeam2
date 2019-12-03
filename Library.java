import java.util.*;
/**
 * Library Class where 6 usecases are implemented
 *
 * @author (2018315056 우메모토 세이야, 2018315036 양유석, 2018315030 이가영, 2018315053 테라오카 유이카)
 * @version (2019/11/28)
 */
public class Library
{ 
    private String name;
    private TreeSet<Book> registeredBooks;
    private HashSet<Borrower> registeredBorrowers;
    public Library(String name) {
        this.name = name;
        registeredBooks = new TreeSet<Book>();
        registeredBorrowers = new HashSet<Borrower>();
    }

    public boolean registerOneBorrower(String name) {
        Borrower eachBorrower = null;
        Iterator<Borrower> it = registeredBorrowers.iterator();
        while(it.hasNext()) {
            eachBorrower = it.next();
            if(eachBorrower.getName().equals(name)){
                return false;}
        }
        Borrower borrowerToRegister = new Borrower(name);
        System.out.println(borrowerToRegister);
        registeredBorrowers.add(borrowerToRegister);
        return true;
    }

    public boolean registerOneBook(String title, String author, long catalogNumber) {
        Book eachBook = null;
        Iterator<Book> it = registeredBooks.iterator();
        while(it.hasNext()) {
            eachBook = it.next();
            if((eachBook.getTitle().equals(title)) && (eachBook.getAuthor().equals(author))) {
                return false;}
        }
        Book bookToRegister = new Book(title, author, catalogNumber);
        System.out.println(bookToRegister);
        registeredBooks.add(bookToRegister);
        return true;
    }

    public Vector<String> displayBooksForLoan() {
        Book eachBook;
        Vector<String> result = new Vector<String>();
        Iterator<Book> it = registeredBooks.iterator();
        while(it.hasNext()) {
            eachBook = it.next();
            if(eachBook.checkIfAvailable() == true)
                result.add(eachBook.toString());
        }
        return result;
    }

    public Vector<String> displayBooksOnLoan() {
        Book eachBook;
        Vector<String> result = new Vector<String>();
        Iterator<Book> it = registeredBooks.iterator();
        while(it.hasNext()) {
            eachBook = it.next();
            if (eachBook.checkIfAvailable() == false){
                result.add(eachBook.toString());
            }
        }
        return result;
    }

    public String lendOneBook(String name, long catalogueNumber) {
        Borrower eachBorrower = null;
        Book eachBook = null;
        Loan newLoan = null;
        Iterator<Borrower> itBorrowers = registeredBorrowers.iterator();
        while(itBorrowers.hasNext()) {
            eachBorrower = itBorrowers.next();
            if(eachBorrower.getName().equals(name)){
                break;
            }else{
                return "Borrower Can't be found";
            }
        }
        Iterator<Book> itBooks = registeredBooks.iterator();
        while(itBooks.hasNext()) {
            eachBook = itBooks.next();
            if(eachBook.getCatalogueNumber() == catalogueNumber)
                break;
            else
                return "Book Can't be found";
        }
        if((eachBorrower.checkIfEligible()) && (eachBook.checkIfAvailable())) {
            newLoan = new Loan();
            eachBorrower.registerLoans(newLoan);
            eachBook.registerLoan(newLoan);
            return "Lend complete!";
        } else if(eachBook.checkIfAvailable() == false){
            return eachBook.toString() + " - can't be borrowed";
        }else if(eachBorrower.checkIfEligible() == false){
            return eachBorrower.toString() + " - can't borrow";
        }
        else{
            return "";
        }
    }

    public void returnOneBook(String name, long catalogueNumber) {
        Borrower eachBorrower = null;
        Book eachBook = null;
        Iterator<Borrower> itBorrowers = registeredBorrowers.iterator();
        while(itBorrowers.hasNext()) {
            eachBorrower = itBorrowers.next();
            if(eachBorrower.getName().equals(name))
                break;
        }
        Iterator<Book> itBooks = registeredBooks.iterator();
        while(itBooks.hasNext()) {
            eachBook = itBooks.next();
            if (eachBook.getCatalogueNumber() == catalogueNumber){
                break;
            }
        }
        Loan loan = eachBook.deleteLoan();
        eachBorrower.deleteLoan(loan);
    }

    public String toString(){
        return "Library Name: "+this.name;
    }
    public String getName(){
        return this.name;
    }
    public TreeSet<Book> getBooks(){
        return registeredBooks;
    }
    public HashSet<Borrower> getBorrwers(){
        return registeredBorrowers;
    }
}
