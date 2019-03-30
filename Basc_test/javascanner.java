/**************************************************************************************************
*  Scanner方法
*	Scanner xxx = new Scanner(System.in)
*  创建一个输入的对象
***************************************************************************************************/
import java.io.*;
import java.util.Scanner; //include the file

public class javascanner{
	public static void main(String[] arg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("next receive!");
		if(scan.hasNext())//判断是否有数据输入
		{
			String str1 = scan.next();
			System.out.println("next data is:"+str1);
		}
		
		//test1();
		test2(scan);
		test3(scan);
		scan.close();
	}
	
	public static void test1()
	{
		Scanner scan1 = new Scanner(System.in);
		if(scan1.hasNext())
		{
			String str2 = scan1.nextLine();
			System.out.println("this is nextLine data:"+str2);
		}
		scan1.close();
	}
	
	public static void test2(Scanner xx)			//nextXxx是代表输入的类型 Xxx可是是int float bool等等
	{
		if(xx.hasNextInt())
		{
			int intbuf = xx.nextInt();
			System.out.println("输入的整数为："+intbuf);
		}
		else
		{
			System.out.println("输入的不是整数");
		}
		
		if(xx.hasNextFloat())
		{
			float floatbuf = xx.nextFloat();
			System.out.println("输入的浮点数为："+floatbuf);
		}
		else
		{
			System.out.println("输入的不是浮点数");
		}
	}	
	
	public static void test3(Scanner xx)
	{
		int sum = 0;
		System.out.println("输入一个数字，回车一次，如要退出，输入非数字，退出后求出所输入数字的和");
		while(xx.hasNextInt())
		{
			sum = sum + xx.nextInt();
		}
		System.out.println("sum="+sum);
	}
}

