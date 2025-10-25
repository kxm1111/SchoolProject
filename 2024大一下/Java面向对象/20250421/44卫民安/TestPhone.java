public class TestPhone {
    public static void main(String[] args) {
        // 使用空参构造创建对象
        Phone phone = new Phone();

        // 使用set方法赋值
        phone.setBrand("小米");
        phone.setPrice(3998);
        phone.setColor("黑色");

        // 调用对象的两个功能
        phone.call();
        phone.sendMessage();
    }
}