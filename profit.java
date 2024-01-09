import java.util.Scanner;
public class profit
{
    public static void main(String  args[]){
    Scanner sc=new Scanner(System.in);
    //accept selling price and cost price 
    System.out.println("Enter the selling price");
    int sp=sc.nextInt();
    System.out.println("Enter the cost price");
    int cp = sc.nextInt();
    int profit =sp-cp;
    //display the profit
    System.out.println("Enter the profit is "+profit);
}
}