package interest;
import java.util.*;
public class Simple 
{
	float principle,rate,time; 
	Scanner s=new Scanner(System.in);
	public Simple(float principle,float rate,float time)
	{
	this.principle=principle;
	this.rate=rate;
	this.time=time;
	}
	public void result()
	{
		float si=(principle*rate*time)/100;
		System.out.format("%s","The simple interest is:"+si);
	}

}
