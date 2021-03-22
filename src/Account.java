public class Account {
    private String accountId;
    private String accountPassword;
    private int id,age;
    private String name;


    @Override
    public String toString() {
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", accountPassword='" + accountPassword + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account(String accountId, String accountPassword, int id, int age, String name) {
        this.accountId = accountId;
        this.accountPassword = accountPassword;
        this.id = id;
        this.age = age;
        this.name = name;
    }



    public Account() {
    }

    public Account(String accountId, String accountPassword, int id) {
        this.accountId = accountId;
        this.accountPassword = accountPassword;
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
