package June7;

public class DuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char ch1[] ={'a', 'b','c','d','d','b'} ;
		
		for(int i=0 ; i<ch1.length-1 ; i++)
		{
			
			for(int j=i+1 ; j<ch1.length ; j++)
			{
				
				if((ch1[i]==ch1[j])&&(i!=j))
				{
					
					System.out.println(ch1[j]);
				}
				
			}
		}
	}

}
