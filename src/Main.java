public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        Manager manager = new Manager();
        ShowMenu showMenu = new ShowMenu();
        do{
            System.out.println("1.Sign in by Adm");
            System.out.println("2.Sign in by User");
            System.out.println("3. Exit");
            String choose  = new InputandOutput().inputString();
            switch (choose){
                case "1":
                    if(manager.checkSignIn()){
                        showMenu.showMenuAdmin();
                        break;
                    }

                case "2":
                    if(manager.checkSignIn()){
                        showMenu.showMenuUser();
                        break;
                    }

                case "3":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        } while (!exit);
     System.exit(3);
        }

}
