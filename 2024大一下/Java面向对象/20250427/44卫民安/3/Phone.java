public class Phone {
    private String brand;
    private double price;

    // 无参构造函数
    public Phone() {
    }

    // 有参构造函数
    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // 打电话方法
    public void call() {
        System.out.println(brand + " 正在打电话...");
    }

    // 发短信方法
    public void sendMessage(String content) {
        System.out.println(brand + " 正在发送短信: " + content);
    }

    // 玩游戏方法
    public void playGame(String gameName) {
        System.out.println(brand + " 正在玩 " + gameName);
    }

    // Getter 和 Setter 方法
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

    @Override
    public String toString() {
        return "手机品牌: " + brand + ", 价格: " + price + "元";
    }
}