public class User3 {
    int id;
    String name;
    String pwd;
    public User3(int id,String name) {
        this.id = id;
        this.name = name;
    }
    public void testParmeterTransfer01(User3 u) {
        u.name = "余小浩";
    }
    public void testParmeterTransfer02(User3 u) {
        u = new User3(100,"余小二");
    }

    public static void main(String[] args) {
        User3 u1= new User3(200,"马云");
        u1.testParmeterTransfer01(u1);
        System.out.println(u1.name);
        u1.testParmeterTransfer02(u1);
        System.out.println(u1.name);
    }
}
