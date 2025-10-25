public class Girlfriend {
    // 定义女朋友的属性
    private String name; // 姓名
    private double height; // 身高
    private double weight; // 体重

    // 带参数的构造方法
    public Girlfriend(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // 提供set和get方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 展示属性值的方法
    public void show() {
        System.out.println("我女朋友叫" + name + ",身高" + height + "厘米,体重" + weight + "斤");
    }

    // 洗衣服的方法
    public void wash() {
        System.out.println("女朋友帮我洗衣服");
    }

    // 做饭的方法
    public void cook() {
        System.out.println("女朋友给我做饭");
    }
}