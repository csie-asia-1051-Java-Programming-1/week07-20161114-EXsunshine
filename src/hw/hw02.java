package hw;
import java.util.*;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
long a = scn.nextLong();
System.out.println(fun(a));
	}
	public static Long fun(Long x){
		Long sum = (long) 0;
		
			while(x>0){
				sum++;
				x = x/10;
				
			}
			return sum;
			
			
		}
		
	
}
