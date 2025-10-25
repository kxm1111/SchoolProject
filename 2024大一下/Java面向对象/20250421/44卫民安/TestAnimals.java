public class TestAnimals {
    public static void main(String[] args) {
        // 创建猫对象并赋值
        Cat cat = new Cat("花", "波斯");
        // 调用猫的行为方法
        cat.eat();
        cat.catchMouse();

        // 创建狗对象并赋值
        Dog dog = new Dog("黑", "藏獒");
        // 调用狗的行为方法
        dog.eat();
        dog.lookHome();
    }
}