package tester;
import java.util.Scanner;
import com.app.Calculator;
class TestCalculator
{

public static void main(String[] args)
{   

//	Calculator calc =new Calculator();
	int ll;
	double n1,n2,ans;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number");
	n1=sc.nextDouble();
	System.out.println("Enter the second number");
	n2=sc.nextDouble();
	Calculator calc1=new Calculator();
	System.out.println("operation you want to perform");
	System.out.println("1. Addition");
	System.out.println("2. Subtraction");
	System.out.println("3. div");
	System.out.println("4.mul");
	System.out.println("Enter your choice");
	ll=sc.nextInt();
	
	switch(ll)
	{
	case 1:
	calc1.setter(n1,n2);
	ans=calc1.addition();
	System.out.println(ans);
	break;
	case 2:
  
  calc1.setter(n1,n2);
	
	ans=calc1.subtraction();
	System.out.println(ans);
	break;
	case 3 :
calc1.setter(n1,n2);
	
    ans=calc1.divide();
    System.out.println(ans);
    break;
	
	

	
	

	
	case 4:
	calc1.setter(n1,n2);
	ans=calc1.multiplication();
	System.out.println(ans);
	break;
	case 5:
	break;
	}
}
}