class SilverCard extends Card {
    public SilverCard(String name, double balance) {
        super(name, balance);
    }

    @Override
    public double pay(double amount) {
        double payment = amount * 0.85;     // 计算8.5折
        this.balance -= payment;             // 扣除余额
        return payment;                     // 返回实际支付金额
    }
}