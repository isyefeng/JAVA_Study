/**********************************************************************************************
*		方法的重写和重载
*
**********************************************************************************************/
import java.io.*;

class Animal{	//重写
	
	public void rong()
	{
		System.out.println("animal can rong");
	}
	
}

class dog extends Animal{
	
	public void rong()
	{
		super.rong();
		System.out.println("dog can rong");
	}
	
	public void word()
	{
		System.out.println("dog can word");
	}
	
}


//重载  重载可以同一个函数名，但是一定要有不同的参数，或者不同的返回值，也可以重新抛出一个异常
class testclass{
	public void test()
	{
		System.out.println("test1");
	}
	
	public void test(String args)
	{
		System.out.println("test2:"+args);
	}
	
	public void test(int x)
	{
		System.out.println("test3:"+x);
	}
}

public class overridetest{
	
	
	
	public static void main(String[] arg)
	{
		dog a = new dog();
		Animal b = new Animal();
		Animal c = new dog();
		
		testclass d = new testclass();
		
		//重载
		d.test();
		d.test("hello");
		d.test(5);
		
		//重写
		System.out.println("重写测试");
		b.rong();
		//a.rong();
		//a.word();
		c.rong();
		//c.woed();
		
		
		System.out.println("重载测试：");
		//重载
	}
	
}

