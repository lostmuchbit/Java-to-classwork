package quation;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("请依次(a,b,c)输入方程的三个系数");
			a=sc.nextDouble();
			b=sc.nextDouble();
			c=sc.nextDouble();
			explain ex=new explain(a,b,c);
			
			if(ex.m_flag) {
				ex.figureUp();
				System.out.println("一元二次方程"+a+"x^2+"+b+"x+"+c+"=0"+"的解为");
				System.out.println("x1="+ex.m_x1+"  "+"x2="+ex.m_x2);
				
			}
			else {
				System.out.println("一元二次方程"+a+"x^2"+b+"x+"+c+"=0"+"无解");
			}
			
			int sure;
			System.out.print("你是否要结束程序(1:结束 2:不结束):");
			sure=sc.nextInt();
			sc.nextLine();
			if(sure==1) {
				System.out.println("欢迎下次使用!");
				System.exit(0);
			}
			else {
				System.out.println("您可以继续使用");
			}
		}
	}

}
