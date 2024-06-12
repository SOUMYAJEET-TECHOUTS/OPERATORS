package codingstandards;

public class operators {
public static void main(String[] args) {
	//arithmetic operators
	int a=20;
	int b=10;
	int sum=0, sub=0, mul=0,div;
	System.out.println("Number1=" +a);
	System.out.println("Number2=" +b);
	sum = a+b;
	System.out.println("sum of numbers=" +sum);
	sub = a-b;
	System.out.println("sub of numbers=" +sub);
	mul = a*b;
	System.out.println("mul of numbers=" +mul);
	div = a/b;
	System.out.println("div of numbers=" +div);
	
	//Unary operators
	//Unary minus
	int n1=15;
	System.out.println(n1);
		n1 = -n1;
		System.out.println("Result=" +n1);
		//increment
		int d=25;
				System.out.println(++d);
				//decrement
				int v=99;
				System.out.println(--v);
				//assignment operators
				int c = 10, e = 20;
				 
		        System.out.println("num1 = " + c);
		        System.out.println("num2 = " + e);
		        
		        c += e;
		        
		        System.out.println("result 1 = " + c);
		        
		        c -= e;
		        System.out.println("result 2 = " + c);
		        
		        c *= e;
		        System.out.println("result 3 = " + c);
		        
		        //relational operator
		        int n = 10;
		        int m = 3;
		        int l = 5;

		        System.out.println("n > m: " + (n > m));
		        System.out.println("n < l: " + (n < l));
		        System.out.println("m >= l: " + (m >= l));
		        System.out.println("m <= l: " + (m <= l));
		        System.out.println("n == m: " + (n == m));
		        System.out.println("l != m: " + (l != m));
		        
		        //logical operators
		        boolean x = true;
		        boolean y = false;
		      
		        System.out.println("x && y: " + (x && y));
		        System.out.println("x || y: " + (x || y));
		        
		        //ternary operator
		        
		                int i=10;
		        		int i2= 40;
		        		int i3 =20;
		        		int result;
		        		
		        		result = ((i > i2)? (i > i3)? i : i3 : (i2 > i3) ? i2 : i3);
		        		 System.out.println("Max of three numbers=" +result);
		        //bitwise operators
		        		 int p1=1010;
		        		 int p2=1100;
		        		 System.out.println("p1 & p2:" +(p1 & p2));
		        		 System.out.println("p1 | p2:" +(p1 | p2));
		        		 
		        		 //shift operators
		        		 int g=10;
		        		 
		        		 System.out.println("g << 2 = " + (g << 2));
		        		 System.out.println("g >> 1 = " + (g >> 1));
		       
		        
}
}
