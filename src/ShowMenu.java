
public class ShowMenu {
    Manager manager = new Manager();

    public void showMenuAdmin(){

        boolean exit = false;
        do{
            System.out.println("--------------------");
            System.out.println("1. Add new account ");
            System.out.println("2. Edit Account");
            System.out.println("3. Delete Account");
            System.out.println("4  List Account");
            System.out.println("5. Add new book");
            System.out.println("6. Edit Book");
            System.out.println("7. Delete Books");
            System.out.println("8. Display Book");
            System.out.println("9. Exit");
            String choose = new InputandOutput().inputString();
            switch (choose){
                case "1":
                    manager.addAccount();
                    break;
                case "2":
                    System.out.println("Input Id");
                    manager.editByID(new InputandOutput().inputInt());
                    break;
                case "3":
                    System.out.println("Input ID");
                    manager.deleteById(new InputandOutput().inputInt());
                    break;
                case "4":
                    manager.displayAccoutlist();
                    break;
                case "5":
                    manager.booksManager.addNewBooks();
                    break;
                case "6":
                    System.out.println("Input Id");
                    manager.booksManager.editByID(new InputandOutput().inputInt());
                    break;
                case "7":
                    System.out.println("Input Id");
                    manager.booksManager.deleteByID(new InputandOutput().inputInt());
                    break;
                case "8":
                    manager.booksManager.displayBook();
                    break;
                case "9":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }

        } while (!exit);
        System.exit(9);
    }
    public void showMenuUser(){
        boolean exit = false;
        do{
            System.out.println("-----------------");
            System.out.println("1.List Book");
            System.out.println("2.Find Book by Id");
            System.out.println("3.Find Book by Name");
            System.out.println("4.Borrow Book");
            System.out.println("5.Exit ");
            String choose = new InputandOutput().inputString();
            switch (choose){
                case "1":
                    manager.booksManager.displayBook();
                    break;
                case "2":
                    System.out.println("Input Name of Book");
                    System.out.println(manager.booksManager.findByName(new InputandOutput().inputString()));
                    break;
                case "3":
                    System.out.println("Input Id of Book");
                    System.out.println(manager.booksManager.findByID(new InputandOutput().inputInt()));
                    break;
                case "4":
                    manager.borrowBooks();
                    break;
                case "5":
                    exit =true;
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
        while (!exit);
        System.exit(5);
    }
}
