public class User {
    int id;
    String name;
    String password;
    static String company = "百度";
    public User(int id,String name ) {
        this.id = id;
        this.name = name;
    }
    public void login() {
        printCompany();
        System.out.println(company);
        System.out.println("登陆"+name);
    }
    public static void printCompany() {
      //  login();
        System.out.println(company);
    }

    public static void main(String[] args) {
        User u = new User(9527,"余小浩");
        User.printCompany();
        User.company = "腾讯";
        User.printCompany();
    }
}
