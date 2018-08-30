package May29programes;

public class FindDuplicatevaluesinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] Array1={'0','0','1','2','3','3','4'} ;
		
		for (int i=0 ;i<Array1.length-1 ; i++){
			
			for(int j=i+1 ; j<Array1.length ; j++)
			{
				
				if(Array1[i]==Array1[j] && (i!=j))
				{
					System.out.println( Array1[j]);
					
				}
			}
		}

	}

}
