abstract class Card {
    protected String name;
    protected double balance;

    public Card(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // 抽象支付方法
    public abstract double pay(double amount);
}