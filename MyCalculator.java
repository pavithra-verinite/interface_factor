package interfaces;

interface AdvArithmetic
{
	int divisorSum(int n);
	
	
}

public class MyCalculator implements AdvArithmetic {

	
	public int divisorSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String args[])
	{
		MyCalculator m=new MyCalculator();
		int k=m.divisorSum(6);
		System.out.println(k);
	}
}
