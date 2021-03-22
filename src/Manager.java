import java.util.ArrayList;
import java.util.List;

public class Manager {
    public Manager() {
    }
    BooksManager booksManager = new BooksManager();

    static List<Account> accountList = new ArrayList<>();
    static Account acc = new Account("abc","abc",123,12,"Thanh");
    static Account acc2 = new Account("mnb", "mnb",234,23,"Tiep");
    static {
        accountList.add(acc);
        accountList.add(acc2);
    }
    public void addAccount(){

        System.out.println("Input ID");
        int id = new InputandOutput().inputInt();
        if(!checkByID(id)){
        System.out.println("Input Account Id");
        String accid = new InputandOutput().inputString();
        System.out.println("Input Account Password");
        String pw = new InputandOutput().inputString();

        System.out.println("Input Name");
        String name = new InputandOutput().inputString();
        System.out.println("Input Age");
        int age = new InputandOutput().inputInt();
        Account account = new Account(accid,pw,id,age,name);
        accountList.add(account);
            System.out.println("Creat account successful");}
        else {
            System.out.println("Account has been defined");
        }
    }
    public Account findByID(int id){
        Account account = null;
        for (Account acc : accountList) {
            if(checkByID(id)){
                if(acc.getId() == id){
                account = acc;
                break;}
            }
        }
        return account;
    }
    public boolean checkByID(int id){
        for (Account a:accountList) {
            if(a.getId() == id){
                return true;
            }
        }
        return false;
    }
    public void editByID(int id){
        findByID(id).setAccountId(new InputandOutput().inputString());
        findByID(id).setAccountPassword(new InputandOutput().inputString());
        findByID(id).setId(new InputandOutput().inputInt());
        findByID(id).setAge(new InputandOutput().inputInt());
        findByID(id).setName(new InputandOutput().inputString());
    }
    public void deleteById(int id){
    if (checkByID(id)){
        accountList.remove(findByID(id));
        System.out.println("Deleted");
    }
    else {
        System.out.println("Id is not defined");
    }
    }
    public void displayAccoutlist(){
        for (Account acc: accountList
             ) {
            System.out.println(acc.toString());
        }
    }
    public boolean checkAccountID(String s){
        for (Account account: accountList
             ) {
            if(account.getAccountId().equals(s)){
                return true;
            }
        }
        return false;
    }
    public boolean checkAccountPassword(String s){
        for (Account account:accountList
             ) {
            if(account.getAccountPassword().equals(s))
                return true;
        }
        return false;
    }

    public  boolean checkSignIn(){
        System.out.println("Input Account ID");
        String accountid = new InputandOutput().inputString();
        if (!checkAccountID(accountid)){
            System.out.println("Account ID is not defined");
            System.out.println("Repeat");
            checkSignIn();
        } else {
            System.out.println("Input Account Password");
            String pwid = new InputandOutput().inputString();
            if(checkAccountPassword(pwid)){
                System.out.println("Sign in succesful");
                return true;
            }
        }
        return false;

    }
    public void borrowBooks(){
        System.out.println("Input the name of book");
        String name = new InputandOutput().inputString();
        if (!booksManager.checkByName(name)){
           int value = booksManager.findByName(name).getBooksnumber() - 1;
           booksManager.findByName(name).setBooksnumber(value);
            System.out.println("Input days want to borrow");
           int days = new InputandOutput().inputInt();
           int pay = booksManager.findByName(name).getPrice()*days;
            System.out.println("Pay for " + days +" days is " + pay);

        } else {
            System.out.println("The book is not existed");
        }
    }


}
