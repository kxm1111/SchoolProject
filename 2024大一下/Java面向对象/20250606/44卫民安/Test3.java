import java.text.SimpleDateFormat;

public class Test3 {
    public static void main(String[] args) throws ParseException {
        
        String start = "2023年11月11日 0:0:0";
        String end = "2023年11月11日 0:10:0";
        String xj = "2023年11月11日 0:01:18";
        String xp = "2023年11月11日 0:10:57";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startDt = sdf.parse(start);
        Date endDt = sdf.parse(end);
        Date xjDt = sdf.parse(xj);
        Date xpDt = sdf.parse(xp);


        long startTime = startDt.getTime();
        long endTime = endDt.getTime();
        long xjTime = xjDt.getTime();
        long xpTime = xpDt.getTime();

        if(xjTime >= startTime && xjTime <= endTime){
            System.out.println("小贾您秒杀成功了~~");
        }else {
            System.out.println("小贾您秒杀失败了~~");
        }
        if(xpTime >= startTime && xpTime <= endTime){
            System.out.println("小皮您秒杀成功了~~");
        }else {
            System.out.println("小皮您秒杀失败了~~");
        }
    }
}
