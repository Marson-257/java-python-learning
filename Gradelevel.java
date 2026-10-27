
import java.util.Scanner;

public class Gradelevel {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = sc.nextInt();
        if (score>100 || score <0){
            System.out.println("输入错误，请输入0-100之间的整数");
        }else if(score>=90){
            System.out.println("优秀");
        }else if(score>=80){
            System.out.println("良好");
        }else if(score>=70){
            System.out.println("中等");
        }else if (score>=60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
        sc.close();

    }
}
