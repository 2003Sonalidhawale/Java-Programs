import java.util.Scanner;
class personalInfo
{
	public static void main(String args[])
	{
		String name;
		int age;
		char Gender;
		Scanner sc=new Scanner(System.in);
		// Accepting the value from user
		System.out.println("Enter the name=");
		name=sc.next();
		System.out.println("Enter the age=");
		age=sc.nextInt();
		System.out.println("Enter gender=");
		Gender=sc.next().charAt(0);
		//Display the value 
		System.out.println("Name:"+name+"\nAge:"+age+"\nGender:"+Gender);
	}
}

