// 猫类
public class Cat extends Animal {
    // 无参构造
    public Cat() {
    }

    // 有参构造
    public Cat(int age, String color) {
        super(age, color);
    }

    // 重写eat方法
    @Override
    public void eat(String something) {
        System.out.println(getColor() + "的" + getAge() + "岁的猫，在吃" + something);
    }

    // 逮老鼠方法
    public void catchMouse() {
        System.out.println(getColor() + "的" + getAge() + "岁的猫正在逮老鼠");
    }
}