public class SDemo {
    public static void main(String[] args) {
        Stu s = new Stu();
        //使用对象
        System.out.println(s.name + "," + s.age);
        s.name = "林青霞";
        s.age = 30;
        System.out.println(s.name + "," + s.age);
        s.study();
        s.doHomework();
    }
}
