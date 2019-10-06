

/*class Persion {
    {  //定义在类中，不加任何修饰符，构造快
        System.out.println("1.Persion类的构造方法");
    }
    public Persion() {
        System.out.println("2.Persion类的构造方法");
    }
    static {
        System.out.println("3.Persion类的静态块");
    }
}*/
/*class Outer {
    private String msg = "Hello Word";
    public String getmsg() {
        return this.msg;
    }
    public void fun() {
        Inner in = new Inner(this);
        in.print();
    }
}
class Inner {
    private Outer outer;
    public  Inner(Outer outer) {
        this.outer = outer;
    }
    public void print() {
        System.out.println(outer.getmsg());
    }
}*/
/*class Outter {
    private  String outName;
    private int outAge;
    class Inner {
        private  int InnerAge;
        public Inner() {
            Outter.this.outName = "I am Outter class";
            Outter.this.outAge = 20;
        }
        public void display() {
            System.out.println(outName);
            System.out.println(outAge);
        }
    }
}*/
/*class Outter {
    public void display() {
        Inner inner = new Inner();
        inner.display();
    }
    class Inner {
        public void display() {
            System.out.println("I am InnerClass");
        }
    }
}*/
/*class Outter {
    private static String msg = "HelloWord";
    static class Inner {
        public void print() {
            System.out.println(msg);
        }
    }
    public void fun() {
        Inner inner = new Inner();
        inner.print();
    }
}*/
/*class Outter {
    private int num;
    public void display(int test) {
        class Inner {
            private void fun() {
                num++;
                System.out.println(num);
                System.out.println(test);
            }
        }
        new Inner().fun();
    }
}*/
/*class Persion {
    private String name;
    private int age;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
class Student extends Persion {
    private String school;
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
}*/
/*class Persion {
    public Persion() {
        System.out.println("**Persion类对象产生**");
    }
}
class Student extends Persion {
    public Student () {
        super();
        System.out.println("**Student类对象的产生**");
    }
}*/
/*class Persion {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Student extends Persion {
    public void fun() {
        System.out.println(getName());
    }
}*/
/*class Persion {
    private void print() {
        System.out.println("1.[Persion]类的print方法");
    }
}
class Student extends  Persion {
    public void print() {
        System.out.println("2.[Student]类的print方法");
    }
}*/
/*class Persion {
    public void print() {
        System.out.println("1.I am father");
    }
}
class Student extends Persion {
    public void print() {
        super.print();
        System.out.println("2.I am child");
    }
}*/
/*cl-0ublic String info = "爸爸!";
}
class Student extends  Persion {
    public String info = "作者！";
    public void print() {
        System.out.println(super.info);
        System.out.println(this.info);
    }
}*/

public class Test {
    public static void main(String[] args) {
        int[] x = new int[3];
        for (int i = 0; i <3 ; i++) {
            x[i] = i;
        }
        for (int i = 0; i <3 ; i++) {
            System.out.println(x[i]);
        }

    }
}