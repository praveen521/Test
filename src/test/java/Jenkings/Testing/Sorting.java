package Jenkings.Testing;

public class Sorting {
	
	public static int[] arr = {10,8,9};
	public static int temp = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					}
			}
		}
		
		//System.out.println(temp);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
