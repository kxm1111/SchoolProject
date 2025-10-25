public class TestPayment {
    public static void main(String[] args) {
        // 创建金卡用户（预存1万）
        Card goldUser = new GoldCard("张三", 10000);
        // 创建银卡用户（预存5千）
        Card silverUser = new SilverCard("李四", 5000);

        // 模拟加油消费
        double oilPrice = 500; // 假设加油费用500元

        // 金卡支付
        System.out.println("金卡支付：" + goldUser.pay(oilPrice) + "元");
        System.out.println("剩余余额：" + goldUser.balance + "元");

        // 银卡支付
        System.out.println("\n银卡支付：" + silverUser.pay(oilPrice) + "元");
        System.out.println("剩余余额：" + silverUser.balance + "元");
    }
}