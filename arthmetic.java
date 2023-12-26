package arthemetic_operations;
import java.util.Scanner;

public class arthmetic {

	public int res;
	public int i;
	public int j;
	public void arthmeticlink(int j, int i)
	{
		this.i=i;
		this.j=j;
				
	}
	public void arthmeticvar() {
		try (Scanner sc = new Scanner(System.in)) {
			int x ;
			int y;
			

			
System.out.println("------------------------");
System.out.println("Enter first number:");
x=sc.nextInt();
System.out.println("Enter Second number:");
y=sc.nextInt();
int i=x;
int j=y;
			
			arthmeticop( i,j);
		}
	}
public void  arthmeticop(int i, int j ) {

	while(true) {
		
		try (Scanner z = new Scanner(System.in)) {
			System.out.println("------------------------");
			   System.out.println("1)Enter  1 for add,");
			   System.out.println("2)Enter 2 for Substract:");
			   System.out.println("3)Enter 3 for multiply:");
			   System.out.println("4)Enter 4 for division:");
			   System.out.println("5)Enter 5 for all the answer:");
			   System.out.println("------------------------");
			   System.out.println("Enter choice:");
			   int d=z.nextInt();
			      
			   if (d==1)
			   {
				   arthmetic.add(i, j);
			   }
			   else if (d==2)
			   {
				   arthmetic.substract(i, j);
			   }
			   else if (d==3)
			   {
				   arthmetic.multiply(i, j);
			   }
			   else if (d==4)
			   {
				   arthmetic.divison(i, j);
			   }
			   else if(d==5) 
			   {
				   System.out.println("------------------------");
				   System.out.println("------------------------");
				   arthmetic.add(i, j);
				   System.out.println("------------------------");
				arthmetic.substract(i, j);
				  System.out.println("------------------------");
				arthmetic.multiply(i, j);
				  System.out.println("------------------------");
				arthmetic.divison(i, j);
				  System.out.println("===============-=-=-=-=-=-=-=-");
				
			   }
			   System.out.println("Want to do for another numbers .");
			   System.out.println("Press 1.");
			   System.out.println("For Exit Press 2.");
			   int e= z.nextInt();
			   if(e==1) 
			   {
				    new App();
			   }
			   else if(e==2)
			   {
				break;   
			   }
		}
	}
		   	}

	public static void add(int i, int j) 
	{
		try (Scanner z = new Scanner(System.in)) {
			int res= i+j;
			System.out.println("The Sum of "+i+" and " +j+ "is" +res);
			System.out.println("Want to do for another numbers .");
			   System.out.println("Press 1.");
			   System.out.println("Enter 3 for main menu");
			   System.out.println("For Exit Press 2.");
			   int e= z.nextInt();
			   if(e==1) 
			   {
				    new App();
			   }
			   else if(e==2)
			   {
				exit();  
			   }
		}
	}
	
	public static void substract(int i, int j) 
	{
		try (Scanner z = new Scanner(System.in)) {
			int res= i-j;
			System.out.println("The Substraction of "+i+" and " +j+ "is" +res);
			System.out.println("Want to do for another numbers .");
			   System.out.println("Press 1.");
System.out.println("For main menu press3");
			   System.out.println("For Exit Press 2.");
			   int e= z.nextInt();
			   if(e==1) 
			   {
				    substract(i,j);
			   }
			   else if(e==2)
			   {
			       exit();
			   }
			   else if(e==3)
			   {
				    new App();
			   }
		}
	}
	
	public  static void multiply(int i, int j) 
	{
		int res= i*j;
		System.out.println("The multiplication of "+i+"  and  " +j+ "is" +res);
		
	}
	public static void divison(int i, int j) 
	{
		int res= i/j;
	System.out.println("The divison of "+i+"  and  " +j+ "is" +res);
		
	}
	
	public void Squareroot()
	{
		int   s;
		 try (Scanner Sc = new Scanner(System.in)) {
			System.out.println("Enter number for Square root");
			 s=Sc.nextInt();
			 System.out.println("The sqaure root of "+s+"is" +Math.sqrt(s));
			 System.out.println("Want to do for another numbers .");
			   System.out.println("Press 1.");
			   System.out.println("For Exit Press 2.");
			   System.out.println("For Main menu Press 3.");
			   
			   int e= Sc.nextInt();
			   if(e==1) 
			   {
				    Squareroot();
			   }
			   else if(e==2)
			   {
			       exit();
			   }
			   else if(e==3)
			   {
				    new App();
			   }
		}
	}

	private static void exit() {
		System.exit(0);
	}
	public void Cuberoot()
	{
		double s;
		 try (Scanner Sc = new Scanner(System.in)) {
			System.out.println("Enter number for Cube root");
			 s=Sc.nextInt();
			 System.out.println("The sqaure root of "+s+" is " +Math.cbrt(s));
			
			 System.out.println("Want to do for another numbers .");
			   System.out.println("Press 1.");
			   System.out.println("For main Menu Press 2.");
			   System.out.println("For Exit Press 3.");
			   int e= Sc.nextInt();
			   if(e==1) 
			   {
				   Cuberoot();
			   }
			   else if(e==2)
			   {
				  arthmeticop( i, j);
			   }
			   else if(e==3)
			   {
				   exit();
			   }
		}
	}

	public void Area()
	{ 
		try (Scanner Sc = new Scanner(System.in)) {
			System.out.println("1)Enter 1 for rectangle. ");
			 System.out.println("1)Enter 2 for sqaure. ");
			 System.out.println("1)Enter 3 for circle. ");
			 System.out.println("Enter your choice :");
			 int c=Sc.nextInt();
			 
			 if(c==1) 
			 {
			 int l;
			 int b;
			 
			 System.out.println("Enter length of rectangle:");
			 l=Sc.nextInt();
			 System.out.println("Enter breadth of rectangle:");
			 b=Sc.nextInt();
			 int res=l*b;
			 System.out.println("The area of rectangle is "+res);
}
			 else if(c==2) 
			 {
			 int l;
			 
			 System.out.println("Enter length of side of  Square:");
			 l=Sc.nextInt();
			 
			 int res=l*l;
			 System.out.println("The Area of rectangle is "+res);
}
			 else if(c==3)
			 {
				 
			 int l;
			 Double pie=3.15;
			 
			 System.out.println("Enter radius  of  Circle:");
			 l=Sc.nextInt();
			 
			 int res= (int) (pie*l*l);
			 System.out.println("The perimeter of circle  is "+res);
}
			 System.out.println("Want to do for another numbers .");
			   System.out.println("Press 1.");
			   System.out.println("For  Menu Press 2.");
			   System.out.println("For Exit Press 3.");
			   int e= Sc.nextInt();
			   if(e==1) 
			   {
				    Area();
			   }
			   else if(e==2)
			   {
				arthmeticop(i,j);   
			   }
			   else if(e==3)
			   {
				   exit();
			   }
		}
	}

	public void Perimeter()
	{
		try (Scanner Sc = new Scanner(System.in)) {
			System.out.println("1)Enter 1 for Perimeter of rectangle. ");
			 System.out.println("1)Enter 2 for Perimeter of sqaure. ");
			 System.out.println("1)Enter 3 for Perimeter of circle. ");
			  System.out.println("Enter your choice :");
			 int c=Sc.nextInt();
			 
			 if(c==1) 
			 {
			 int l;
			 int b;
			 
			 System.out.println("Enter length of rectangle:");
			 l=Sc.nextInt();
			 System.out.println("Enter breadth of rectangle:");
			 b=Sc.nextInt();
			 int res=2*(l+b);
			 System.out.println("The perimeter of rectangle is "+res);
}
			 if(c==2) 
			 {
			 int l;
			 
			 System.out.println("Enter length of side of  Square:");
			 l=Sc.nextInt();
			 
			 int res=4*l;
			 System.out.println("The perimeter of rectangle is "+res);
}
			 else    if(c==3) 
			 {
				 int v=2;
			 int l;
			 Double pie=3.15;
			 
			 System.out.println("Enter radius  of  Circle:");
			 l=Sc.nextInt();
			 
			 int res= (int) (v*pie*l);
			 System.out.println("The perimeter of circle  is "+res);
}

 System.out.println("Want to do for another numbers .");
   System.out.println("Press 1.");
   System.out.println("For Main menu  Press 2.");
   System.out.println("For Exit Press 3.");
   int e= Sc.nextInt();
   if(e==1) 
   {
			 Perimeter();
   }
   else if(e==2)
   {
			arthmeticop(i,j);   
   }
   else if(e==3)
   {
	   exit();
   }
		}
}
}