public class PhoneTest {
    public static void main(String[] args) {
        // 创建Phone对象
        Phone phone = new Phone("iPhone", 5000);

        // 打印手机信息
        System.out.println(phone);

        // 调用Phone的方法
        phone.call();
        phone.sendMessage("你好，世界！");
        phone.playGame("王者荣耀");
    }
}