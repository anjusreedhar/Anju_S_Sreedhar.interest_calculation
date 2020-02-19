package interest;
import java.util.*;
import java.lang.*;
public class Compound 
{
	float principle,rate,time,noi; 
	Scanner s=new Scanner(System.in);
	public Compound(float principle,float rate,float time,float noi)
	{
		this.principle=principle;
		this.rate=rate;
		this.time=time;
		this.noi=noi;
	}
	public void result()
	{
		float ci=(float)(principle*Math.pow((rate/noi),(noi*time)));
		System.out.format("%s","The compound interest is:"+ci);
	}

}