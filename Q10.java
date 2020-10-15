import java.util.*;
class Q10
{
	public static void main(String agrs[])
	{
		float temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter temperature in farenheit");
		temp=s.nextInt();
		temp=((temp-32)*5)/9;
		System.out.println("tepmrature in celcius:"+temp);

			
	}
}