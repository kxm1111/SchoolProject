public class Cat {
    // 私有属性
    private String color; // 毛的颜色
    private String breed; // 品种

    // 空参构造方法
    public Cat() {
    }

    // 带参数的构造方法
    public Cat(String color, String breed) {
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
        System.out.println(color + "色的" + breed + "猫正在吃鱼.....");
    }

    // 抓老鼠方法
    public void catchMouse() {
        System.out.println(color + "色的" + breed + "猫正在逮老鼠.....");
    }
}