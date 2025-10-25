public class Test {
    public static void main(String[] args) {
        student s = new student("波妞");
        System.out.println(s);

    }
}
public class student extends object {
    private String name;
    private int age;
    public student() {

    }
    public student(String name,int age){
        this.name;
        this.age;
    }
    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String tostring() {
        return "student{" +
                "name" + name + '\'' +
                ", age=" + age +
                '}';

    }
}