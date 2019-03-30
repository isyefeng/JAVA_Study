/**************************************************************************************************
*		继承练习
*		继承的关键字为extend
* 		一个子类只能有一个父类
*		但是一个父类可以有很多子类	
* 
***************************************************************************************************/
import java.io.*;

class Animal{			//创建一个名为Animal的父类
	void eat(){
		System.out.println("animal:eat");
	}
}

class dog extends Animal{		//创建一个继承Animal的子类
	void eat(){
		System.out.println("dog:eat");
	}
	void eattest()
	{
		this.eat();					//this是调用本类的方法，super是调用父类的方法
		super.eat();
	}
}

final class notfatherclass{
	void eat()
	{
		System.out.println("notfatherclass");
	}
}

/*class cat extends notfatherclass{			//这里使用final创建的类不能被继承
	void eat()
	{
		System.out.println("can't class");
	}
}*/

/**********************************************************************************************
*		构造器
*		如果父类中有参数，则子类要用super（）调用父类构造器并配以适当的参数列表
**********************************************************************************************/
class superclass{
	private int n;
	superclass()
	{
		System.out.println("superclass()");
	}
	superclass(int n)
	{
		System.out.println("superclass(int n)");
		this.n = n;
	}
}

class subclass extends superclass{

	private int n;
	subclass()
	{
		System.out.println("subclass()");
	}
	
	public subclass(int n)
	{
		super(300);
		System.out.println("subclass(int n)"+n);
		this.n = n;
	}

}

class subclass2 extends superclass{
	private int n;
	subclass2()
	{
		super(300);
		System.out.println("subclass2()");
	}
	public subclass2(int n)
	{
		System.out.println("subclass2(int n)");
		this.n = n;
	}
}	
	
/**********************************************************************************************
*		主函数
*
**********************************************************************************************/
public class chlemain{

	public static void main(String[] arg)
	{
		dog dogclass = new dog();
		//notfatherclass not = new notfatherclass();
		subclass sb1 = new subclass();
		subclass sb2 = new subclass(100);
		
		subclass2 sb3 = new subclass2();
		subclass2 sb4 = new subclass2(200);
		
		dogclass.eat();
		dogclass.eattest();
	}

}