public class Dog {
    // 私有属性
    private String color; // 毛的颜色
    private String breed; // 品种

    // 空参构造方法
    public Dog() {
    }

    // 带参数的构造方法
    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    // 提供set和get方法
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // 吃饭方法
    public void eat() {
        System.out.println(color + "色的" + breed + "狗正在啃骨头.....");
    }

    // 看家方法
    public void lookHome() {
        System.out.println(color + "色的" + breed + "狗正在看家.....");
    }
}