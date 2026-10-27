import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入第一个数");
        double a = scanner.nextDouble();

        System.out.println("请输入第二个数");
        double b = scanner.nextDouble();


        System.out.println("请输入第三个数");
        double c = scanner.nextDouble();


        if(a+b>c && a+c>b && b+c>a){
            if(a==b && b==c){
                System.out.println("等边三角形");
            } else if (a==b || b==c) {
                System.out.println("等腰三角形");

            }else if (a*a+b*b==c*c){
                System.out.println("直角三角形");
            }else {
                System.out.println("普通三角形");
            }

        }else {
            System.out.println("不能构成三角形");
        }


    }
}
