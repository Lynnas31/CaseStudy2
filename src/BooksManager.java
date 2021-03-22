import java.util.ArrayList;
import java.util.List;

public class BooksManager {
    static List<Books> booksList = new ArrayList<>();
    static Books book1  =  new Books("Java","Java",23,2300,3);
    static Books book2  = new Books("PHP","PHP",12,2020,2);
    static {
        booksList.add(book1);
        booksList.add(book2);
    }
    public boolean checkById(int id){
        for (Books books :
                booksList) {
            if(books.getBookid()== id){
                return true;
            }
        }
        return false;
    }
    public boolean checkByName(String s){
        for (Books book: booksList
             ) {
            if(book.getName().equals(s)){
                return false;
            }
        } return true;
    }
    public void addNewBooks(){
        System.out.println("Input the new book name");
        String name = new InputandOutput().inputString();
        if(checkByName(name)){
            System.out.println("Input author");
            String author = new InputandOutput().inputString();
            System.out.println("Input book id");
            int id = new InputandOutput().inputInt();
            System.out.println(" Input the book's price");
            int price = new InputandOutput().inputInt();
            System.out.println(" Input the number of book");
            int number = new InputandOutput().inputInt();
            booksList.add( new Books(name,author,id,price,number));
            System.out.println("Add book successful");

        } else {
            System.out.println("This book has defined");
        }
    }
    public Books findByID(int id ){
        Books books = null;
        for (Books book: booksList
             ) {
            if(checkById(id)){
                books = book;
            } else {
                System.out.println("The book has not defined");
            }
        }
        return books;
    }
    public void editByID(int id){
        if (checkById(id)){
            System.out.println("Edit author");
            findByID(id).setAuthor(new InputandOutput().inputString());
            System.out.println("Edit Book Name");
            findByID(id).setName(new InputandOutput().inputString());
            System.out.println("Edit Book Id");
            findByID(id).setBookid(new InputandOutput().inputInt());
            System.out.println("Edit Book Price");
            findByID(id).setPrice(new InputandOutput().inputInt());
            System.out.println("Edit The number of Book");
            findByID(id).setBooksnumber(new InputandOutput().inputInt());

        }
        else {
            System.out.println("The book is not exist");
        }

    }
    public void deleteByID(int id){
        if(checkById(id)){
            booksList.remove(findByID(id));
            System.out.println("Delete book successful");
        }
        else
            System.out.println("The book is not exist");
    }
    public void displayBook(){
        for (Books book: booksList
             ) {
            System.out.println(book);
        }
    }
    public Books findByName(String s){

            Books book = null;
            for (Books books:booksList
                 ) {
                if (books.getName().equals(s)){
                    book = books;
                }
            }
            return book;

    }
}
