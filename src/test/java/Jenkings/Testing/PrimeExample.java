package Jenkings.Testing;

public class PrimeExample{    
	public static void main(String[] args) {
		
		int m=0,flag=0,n;
		n=3;
		m=n/2;
		
		if(n==0||n==1) {
			System.out.println("not a prime number");
		}
		
		else {
			
			for(int i=2;i<=m;i++) {
				if(n%i==0) {
					//System.out.println("not");
					flag=1;
					break;
				}
			}
			
			if(flag==0) {
				System.out.println("prime");
			}
			else {
				System.out.println("not");
			}
			
		}
		
		
		
		
	}
	
	
	
	
	
	
		}   
