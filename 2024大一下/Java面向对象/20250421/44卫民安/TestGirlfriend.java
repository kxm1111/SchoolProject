public class TestGirlfriend {
    public static void main(String[] args) {
        // 使用有参构造方法创建对象并赋值
        Girlfriend girlfriend = new Girlfriend("凤姐", 155.0, 130.0);

        // 调用展示方法
        girlfriend.show();

        // 调用洗衣服方法
        girlfriend.wash();

        // 调用做饭方法
        girlfriend.cook();
    }
}