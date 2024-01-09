import java.util.Scanner;
class Main
{
    public static void main (String[] args) 
    {
       Scanner sc = new Scanner (System.in);
	int num1,num2,res;
	System.out.println("Enter 2 numbers :");
	num1=sc.nextInt();
	num2=sc.nextInt();
	res=num1+num2;
	System.out.println("Addition of two numbers :" + res);
	 res=num1-num2;
	System.out.println("Subtraction of two numbers :" + res);
	res=num1*num2;
	System.out.println("Multipication of two numbers :" + res );
	res=num1/num2;
	System.out.println("Division of two numbers :" + res );
	res=num1%num2;
	System.out.println("Module of two numbers :" + res );

    }

}
