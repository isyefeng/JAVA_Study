//length()的方法是用于测量字符串长度的
//concat()方法是用于连接字符串的
//String,format()用于格式化输出一个字符串到一个字符串变量
//String这种字符串是不可修改的，只有StringBuffer这种方法才是可以修改的
public class test2{
	public void stringtest()
	{
		String myname = "yefeng";
		System.out.println(myname);
		System.out.println("myname length is:" + myname.length());
		System.out.println("my sister name is:".concat("yejiayu"));
		String fs = String.format("my name is %s,and my sister name is %s","yefeng","yejiayu");
		System.out.printf("%s\n",fs);
	}
	public void stringbuffer()
	{
		StringBuffer sstr = new StringBuffer("hello ");
		sstr.append("word!");
		System.out.println(sstr);
	}
		
	public static void main(String[] arg)
	{
		test2 test = new test2();
		test.stringtest();
		test.stringbuffer();
	}
}