/**************************************************************************************************
*		创建一个继承exception的类   
*		
***************************************************************************************************/
import java.io.*;

public class exception_class_creat extends Exception
{
	private double amm;
	public void exception_calss_creat(double amm)
	{
		this.amm = amm;
	}
	public double getamm()
	{
		return amm;
	}
}
