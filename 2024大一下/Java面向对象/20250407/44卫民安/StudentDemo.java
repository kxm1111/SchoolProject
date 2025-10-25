public class Student {
    //成员变量
    String name;
    int age;
    //成员方法
    public void study() {
        System.out.println("好好学习，天天向上");
    }
    public void doHomework() {
        System.out.println("键盘敲烂，月薪过万");
    }
}
/*
   学生测试类
*/
public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        //使用对象
        System.out.println(s.name + "," + s.age);
        s.name = "林青霞";
        s.age = 30;
        System.out.println(s.name + "," + s.age);
        s.study();
        s.doHomework();
    }
}
