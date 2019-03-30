/**************************************************************************************************
*		主函数
*		
***************************************************************************************************/

import java.io.*;

public class ext_main{
	public static void main(String[] arg)
	{
		cheakacc acc = new cheakacc(2);
		//调用异常函数
		try{
			acc.exception_handle();
		}catch(exception_class_creat t)
		{
			int x = t.getamm();
			System.out.println(x);
		}
	}
}