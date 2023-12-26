package arthemetic_operations;
import java.util.Scanner;
public class App {
	
	public static void main(String[] args) {
		arthmetic arth=new arthmetic();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("1) Press 1 to perform arthmetic operations.");
			System.out.println("2) Press 2 to perform Squareroot operations.");
			System.out.println("3) Press 3 to perform Cube root operations.");
			System.out.println("4) Press 4 to perform Area operations.");
			System.out.println("5) Press 5 to perform perimeter operations.");
			System.out.println("Enter your choice:");
			int d= sc.nextInt();
			
			if(d==1) {
			   arth.arthmeticvar();
			   
			}
			else if(d==2)
			{
				arth.Squareroot();
			}
			else if(d==3)
			{
				arth.Cuberoot();
			}
			else if(d==4)
			{
				arth.Area();
			}
			else if(d==5)
			{
				arth.Perimeter();
			}
		}
		
	

   
  
  
}
}