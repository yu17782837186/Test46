public class SxtStudent {

    int id;
    String name;
    int age;

    Computer comp;

     void study() {
         System.out.println("我在认真学习！！"+comp.brand);
     }
     void play() {
         System.out.println("我在玩游戏，王者荣耀！！");
     }
     //构造方法，用于创造这个类的对象，无参的构造方法可以由系统自动创建
     SxtStudent(){

     }

    public static void main(String[] args) {
        SxtStudent student = new SxtStudent();
        student.id = 1001;
        student.name = "余小浩";
        student.age = 18;
        Computer c1 = new Computer();
        c1.brand = "联想";
        student.comp = c1;
        student.play();
        student.study();
    }
    static class Computer{
         String brand;
    }
}
