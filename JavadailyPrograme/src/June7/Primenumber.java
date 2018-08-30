package June7;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number =33 ;
		
		boolean flag = false ;
		
		for(int i=2 ; i<=number/2 ; i++)
		{
			
			if(number%i==0)
			{
				
				flag=true ;
				break ;
			}
			
			
		}
		
		if(!flag)
			
			System.out.println("prime number");
		
		else
			
			System.out.println("not prime number");

	}

}
