public class j2 {



    public static void judge(int number){
        if(number % 2 == 0){
            System.out.println(number + "是一个偶数！");
        }else {
            System.out.println(number + "是一个奇数！");
        }
    }



    public static void main(String[] args) {
        judge(7); //调用后打印：7是一个奇数
        judge(8); //调用后打印：8是一个偶数
    }
}
