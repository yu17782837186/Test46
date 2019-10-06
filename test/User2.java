public class User2 {
    int id;
    String name;
    static String company;
    static {
        System.out.println("执行类的初始化工作！！");
        company = "百度";
        printCompany();
    }
    public static void printCompany() {
        System.out.println(company);
    }

    public static void main(String[] args) {
        User2 u2 = null;
    }
}
