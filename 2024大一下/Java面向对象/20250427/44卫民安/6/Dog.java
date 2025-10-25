// 狗类
public class Dog extends Animal {
    // 无参构造
    public Dog() {
    }

    // 有参构造
    public Dog(int age, String color) {
        super(age, color);
    }

    // 重写eat方法
    @Override
    public void eat(String something) {
        System.out.println(getColor() + "的" + getAge() + "岁的狗，在吃" + something);
    }

    // 看家方法
    public void lookHome() {
        System.out.println(getColor() + "的" + getAge() + "岁的狗正在看家");
    }
}