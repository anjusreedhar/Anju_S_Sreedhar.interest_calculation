import interest.Simple;
import interest.Compound;
import java.util.*;
public class Driver {

		public static void main(String[] args) 
		{
			int Choice;
			System.out.println("Enter the method in which you want to calculate the interest:"
					+ "1:Simple interest 2:Compound interest");
			Scanner s=new Scanner(System.in);
			Choice=s.nextInt();
			if(Choice==1)
			{
				System.out.format("%s","Enter the principle amount,rate and time(in days) for which simple interest needs to be calculated");
				float principle=s.nextFloat();
				float rate=s.nextFloat();
				float time=s.nextFloat();
				Simple obj1=new Simple(principle,rate,time);
				obj1.result();
			}
			if(Choice==2)
			{
				System.out.format("%s","Enter the principle amount,rate,time(in days) and number of times interest is applied per time period for which compound interest needs to be calculated");
				float principle=s.nextFloat();
				float rate=s.nextFloat();
				float time=s.nextFloat();
				float noi=s.nextFloat();
				Compound obj2=new Compound(principle,rate,time,noi);
				obj2.result();
			}
			
		}

	}