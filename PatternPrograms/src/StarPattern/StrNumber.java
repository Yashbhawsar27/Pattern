package StarPattern;

public class StrNumber 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		int n=4;
		
		for(int i=1;i<=n;i++)
			
		{
			for(int j=1;j<=n;j++)
				
			{
				if (i==j)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}
