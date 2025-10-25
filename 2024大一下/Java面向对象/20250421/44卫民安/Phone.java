public class Phone {
    // 定义手机的属性
    private String brand; // 品牌
    private double price; // 价格
    private String color; // 颜色

    // 空参构造方法
    public Phone() {
    }

    // 带参数的构造方法
    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    // 提供set和get方法
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 打电话功能
    public void call() {
        System.out.println("正在使用价格为" + price + "元" + color + "的" + brand + "手机打电话....");
    }

    // 发短信功能
    public void sendMessage() {
        System.out.println("正在使用价格为" + price + "元" + color + "的" + brand + "手机发短信....");
    }
}