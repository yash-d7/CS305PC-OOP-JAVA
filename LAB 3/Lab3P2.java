import java.util.Scanner;

class Lab3P2{
	public static void main(String...args){
		Scanner s = new Scanner(System.in);
			
		int n = s.nextInt();
		int i = 2;
		do{
			int j=2, count = 0;
			if(i == 2)	count++;
			do{
				
				if(i == 2)	
					count++;
				if(i%j == 0) break;
				else count++;
				j++;
					
			}while(j<i);
			if(count > 0)
				System.out.println(i);
			i++;	
		}while(i<n);
	}
}
						
