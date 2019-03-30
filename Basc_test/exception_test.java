/**************************************************************************************************
*	exception 的历程
*   exception是在程序发生错误的时候，抛出一个方法，后者其他
*	使用try{
*
*			}catch(异常类型 异常变量)
*			{
*				如果发生错误，就会执行这里的程序
*			}
*			catch(异常类型 异常变量)
*			{
*
*			}...后面可跟多个catch()
***************************************************************************************************/
import java.io.*;

public class exception_test{

	public static void main(String[] arg)
	{
		test1();
	}
	
	/*数组调用溢出错误*/
	public static void test1()
	{
		int[] arry = new int[2];
		try{
			System.out.println(arry[3]);
		}catch(ArrayIndexOutOfBoundsException  e)
		{
			System.out.println("error:"+e);
		}finally{
			System.out.println("这个语句放于tyr的最后，无论程序对不对都会执行");
		}
	}
}




