import java.util.Scanner;
class Q7
{
	public static void main(String args[])
	{
	
	int marks[]=new int [5];
	int i;
	float sum=0,avg,per;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the marks");
	for(i=0;i<5;i++)
	{
		marks[i]=s.nextInt();
		sum= sum + marks[i];
	}
	avg=sum/5;
	per = (sum/500) * 100;
	System.out.print("Average Marks = " +avg);
		
        System.out.print("\nPercentage = " +per+ "%");
    	}

}
 
	
		
	
