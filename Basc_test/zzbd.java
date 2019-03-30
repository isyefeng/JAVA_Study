import java.util.regex.*;
import java.io.*;
public class zzbd{
	public void test1()
	{
		String content = "I am noob " +
        "from runoob.com.";
 
      String pattern = ".*runoob.*";
 
      boolean isMatch = Pattern.matches(pattern, content);
      System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
	}
	
	public void fxfunction(int...size)
	{
		int[] buf = new int[size.length];
		for(int i=0;i<size.length;i++)
		{
			System.out.println(size[i]);
		}
	}
	
	public static void main(String[] arg)throws IOException
	{
		char c;
		String str;
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		do{
			c = (char)rd.read();
			System.out.println(c);
		}while(c!='c');
		System.out.println("please input \"end\" exit function");
		do{
			str = rd.readLine();
		}while(!str.equals("end"));
		zzbd zzbd_test= new zzbd();
		zzbd_test.test1();
		zzbd_test.fxfunction(1,2,3,4,5,6,7);
	}
}