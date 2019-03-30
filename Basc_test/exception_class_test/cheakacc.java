/**************************************************************************************************
*		操作方法 
*		
***************************************************************************************************/
import java.io.*;

public class cheakacc
{
	private int number;
	private cheakacc(int numbre)
	{
		this.number = numbre;
	}
	
	public void exception_handle(double idnex) throws exception_class_creat		//这里如果number小于5就会跑出一个异常类，这个异常类就是自己创建的
	{
		double cee = number - index;
		if(cee < 5)
			throw new exception_calss_creat(cee);
	}
}
