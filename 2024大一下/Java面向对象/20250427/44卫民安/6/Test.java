// 测试类
public class Test {
    public static void main(String[] args) {
        // 创建狗对象并测试
        Dog dog = new Dog(2, "黑色");
        dog.eat("骨头");
        dog.lookHome();

        System.out.println(); // 空行分隔

        // 创建猫对象并测试
        Cat cat = new Cat(2, "白色");
        cat.eat("小鱼干");
        cat.catchMouse();

        System.out.println(); // 空行分隔

        // 创建人对象并测试喂养宠物的方法
        Person person = new Person("张三", 25);
        person.keepPet(dog, "骨头");
        person.keepPet(cat, "小鱼干");
    }
}