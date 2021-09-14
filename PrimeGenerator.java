import java.util.*;
import java.lang.*;

class Main
{
	public static boolean isPrime(long num) {    
        for(long i = 2; i <= Math.sqrt(num); ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		long a,b;
		
		for(int i=0;i<t;i++){
			
			a = sc.nextInt();
			b = sc.nextInt();
			
			for(long j =a;j<=b;j++){
				
				if(isPrime( j) == true){
					if(j!=1 ) {
						System.out.println(j+"");
					}
					
				}
			}
			
		}
		
	}
}
