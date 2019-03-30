import java.io.*;
public class varg{
	public int aa = 0;
	private float bb = 0;
	public String cc;
	public varg(String name)
	{
		cc = name;
	}
	public void setaa(int a)
	{
		aa = a;
	}
	public void printlnvarg()
	{
		System.out.println("Your name is:" + cc);
		System.out.println("Your age is:" + aa);
	}
	
	//关系运算
	public void gxys()
	{
		int s = 10;
		int h = 20;
		System.out.println("s == h?"+(s == h));
		System.out.println("s > h?"+(s > h));
		System.out.println("s < h?"+(s < h));
	}	
	
	public void pdlx()
	{
		String str = "hello word!";
		boolean flag1 = str instanceof String;
		System.out.println(flag1);
	}
	
	public void syys()
	{
		int a=10;
		int b=(a > 10)?30:40;
		System.out.println(b);
	}
	
	public void whilefor()
	{
		int index = 10;
		int arg[]={1,2,3,4,5,6,7};
		String argString[]={"yefeng","yefng1","yefeng2"};
		while(index >= 0)
		{
			System.out.println("index="+index+"\n");
			index--;
		}
		
		for(int index1 = 0;index1 < 10; index1++)
		{
			System.out.println("index1="+index1+"\n");
		}
		
		for(int x: arg)
		{
			System.out.println("arg=" + x);
		}
		for(String name: argString)
		{
			System.out.println("argSteing="+name);
		}
	}
	
	public void ifelse()
	{
		int x = 10;
		if(x > 10)
		{
			System.out.println("this is if!");
		}
		else
		{
			System.out.println("this is else!");
		}
	}
	
	public void number_math_test()
	{
		Integer x = 5;
		System.out.println("90度正弦值：" + Math.sin(Math.PI/2));
		System.out.println("byteValue():" + x.byteValue());
	}
	
	public void charactertest()
	{
		System.out.println(Character.isLetter('a'));
	}
	
	public static void main(String []arg)
	{
		varg Varg = new varg("yefeng");
		zzbd zzbd_test = new zzbd();
		zzbd_test.test1();
		Varg.setaa(21);
		Varg.printlnvarg(); //输出字符串
		Varg.gxys();		//输出关系运算
		Varg.syys();		//输出三目运算
		Varg.pdlx();		//输出instanceof判断
		Varg.whilefor();	//输出WHILE FOR循环结构
		Varg.ifelse();		//输出ifelse测试函数
		Varg.number_math_test();	//number&math测试
		Varg.charactertest();	//character方法测试
	}
}