import java.io.*;
import java.io.File;

public class iotest{
	public static void main(String[] arg) throws IOException
	{
		byte[] str = {1,2,3,4,5};
		String[] str1 = {"asdasda"};
		File f = new File("test.txt");
		File d = new File("./bin");
		FileOutputStream ff = new FileOutputStream(f);
		ff.write(str);
		d.mkdirs();
		isDirectory_test();
		dlefile_test();
	}
	public static void isDirectory_test()			//isDirectory是一个判断是文件还是路径的函数，如果是路径，则返回真，文件返回假
	{
		File f = new File("../JAVA");
		if(f.isDirectory())
		{
			String s[] = f.list();
			for(int i = 0;i<s.length;i++)
			{
				File ff = new File(s[i]);
				if(ff.isDirectory())
					System.out.println(s[i]+" is a dir");
				else
					System.out.println(s[i]+" is a file");
			}
		}
	}
	
	public static void dlefile_test()	//删除目录和文件
	{
		File f = new File("./bin");
		dle_file_dir(f);
	}
	
	public static void dle_file_dir(File x)		//file.delete()是删除这个文件或者目录
	{
		File[] s = x.listFiles();//列出这个目录下全部
		if(s!=null)
		{
			for(File f:s)
			{
					f.delete();
			}
		}
	}
}