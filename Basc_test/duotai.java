/**********************************************************************************************
*	多态测试
*	
**********************************************************************************************/

public class duotai{

	public static void main(String[] arg)
	{
		show(new cat());
		show(new dog());
		
		
		Animal a = new cat();		//向上转型
		a.eat();			
		cat c = (cat)a;				//向下转型
		c.word();
	}
	public static void show(Animal sub)
	{
		sub.eat();
		if(sub instanceof cat){
			cat a = (cat)sub;
			a.word();
		}else if(sub instanceof dog)
		{
			dog a = (dog)sub;
			a.word();
		}
	}
}

/*抽象的一个类，abstract是抽象的   这里定义一个父类*/
abstract class Animal{	
	abstract void eat();
}

/*定义一个子类cat*/
class cat extends Animal{
	public void eat()
	{
		System.out.println("eat fish");
	}
	public void word()
	{
		System.out.println("catch the mouse");
	}
}

/*定义一个子类*/
class dog extends Animal{
	public void eat()
	{
		System.out.println("eat bone");
	}
	public void word()
	{
		System.out.println("see the door");
	}
}

