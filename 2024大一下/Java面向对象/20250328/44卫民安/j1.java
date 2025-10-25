public class j1 {
    public static void main(String[] args) {
        int rs = add(5);
        System.out.println("1-5的和是：" + rs);

        int rs1 = add(6);
        System.out.println("1-6的和是：" + rs1);
}
    public static int add(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            // i = 1 2 3 ... n
            sum += i;
        }
        return sum;
    }






}
