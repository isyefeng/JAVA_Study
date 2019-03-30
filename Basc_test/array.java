//数组操作
//定义数组的方式   				type[] name = new type[size];
//定义数组，并直接赋值的方式			type[] name = {x,x,x,x,x};
//二维数组						type[][] name = new type[size][size];
public class array{
	public void array_init(int arraysize)
	{
		int[] arraylist = new int[arraysize];
		for(int index = 0;index < arraylist.length;index++)
		{
			arraylist[index] = index;
			System.out.println(arraylist[index]);
		}
	}	
	
	public void array_2()
	{
		int[] arraylist = {0,1,1,2,3,41,2};
		for(int index = 0;index < arraylist.length;index++)
		{
			System.out.println(arraylist[index]);
		}
	}	
	
	public void array_for_element()
	{
		int[] array_t = {0,102,31,421,12};
		   
		for(int element:array_t)
		{
			System.out.println(element);
		}
	}
	
	public static int[] array_reture()
	{
		int[] test = {1,2,3,4};
		return test;
	}
	
	public void array_user(int[] array_rt)
	{
		for(int element:array_rt)
		{
			System.out.println(element);
		}
	}

	public static void main(String[] arg)
	{
		array list = new array();
	
		//list.array_init(5);
		//list.array_2();
		//list.array_for_element();
		list.array_user(list.array_reture());
	}
}	