
import java.util.Scanner;

public class hotel {

	public static void main(String[] args) 
	{
		int choice,ch1;
		int total=0;
		int qut=0;
		char ans;
		String item_ord="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Sonali's Hotel");
		do
		{
			System.out.println("\n1:Starters\n2:Main Course\n3:Deserts\n4:Drink");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
					System.out.println("Starters:");
					System.out.println("1:MasalaPapad       40Rs.");
					System.out.println("2:Soupe             50Rs.");
					System.out.println("3:Paneer tikka      70Rs.");
					System.out.println("4:pasta             40Rs.");
					ch1=sc.nextInt();
                    switch (ch1) {
						case 1:
							total=total+40;
							qut=qut+1;
							item_ord+="MasalaPapad \n";
							break;

							case 2:
							total=total+40;
							qut+=1;
							item_ord+="Soupe\n";
							break;

							case 3:
							total=total+50;
							qut+=1;
							item_ord+="chilli\n";
							break;

							case 4:
							total=total+40;
							qut+=1;
							item_ord+="pasata\n";
							break;
						default:
						System.out.println("Sorry we don't have this item\n");
						
					}
				break;
			case 2:
				System.out.println("Main course:");
				System.out.println("1:Palak Paner         120Rs.");
				System.out.println("2:Butter Chicken      140Rs.");
				System.out.println("3:Green Salad         80Rs.");
				System.out.println("4:Pepper Patatoes     70Rs.");
				ch1=sc.nextInt();
				 switch (ch1) {
						case 1:
							total=total+120;
							qut=qut+1;
							item_ord+="Palak Paner \n";
							break;

							case 2:
							total=total+140;
							qut+=1;
							item_ord+="Butter Chicken\n";
							break;

							case 3:
							total=total+80;
							qut+=1;
							item_ord+="Green Salad\n";
							break;

							case 4:
							total=total+70;
							qut+=1;
							item_ord+="Pepper Patatoes\n";
							break;
						default:
						System.out.println("Sorry we don't have this item\n");
						
					}
			break;
			case 3:
				System.out.println("Deserts:");
				System.out.println("1:Ice-cream           40Rs.");
				System.out.println("2:Chocolate Cake      180Rs.");
				System.out.println("3:Cookie Delight      70Rs.");
				System.out.println("4:Chocolate Pastry    50Rs.");
				ch1=sc.nextInt();
				 switch (ch1) {
						case 1:
							total=total+40;
							qut=qut+1;
							item_ord+="Ice-cream \n";
							break;
							case 2:
							total=total+180;
							qut+=1;
							item_ord+="Chocolate Cake\n";
							break;
							case 3:
							total=total+70;
							qut+=1;
							item_ord+="Cookies Delight\n";
							break;
							case 4:
							total=total+50;
							qut+=1;
							item_ord+="Chocolate Pastry\n";
							break;
						default:
						System.out.println("Sorry we don't have this item\n");
						
					}
			break;
			case 4:
				System.out.println("Drinks:");
				System.out.println("1:Tea           20Rs.");
				System.out.println("2:Fresh Juice   30Rs.");
				System.out.println("3:Cocktel       60Rs.");
				System.out.println("4:Water Bottle  15Rs.");
				ch1=sc.nextInt();
				 switch (ch1) {
						case 1:
							total=total+20;
							qut=qut+1;
							item_ord+="Tea \n";
							break;
							case 2:
							total=total+30;
							qut+=1;
							item_ord+="Fresh Juice\n";
							break;
							case 3:
							total=total+60;
							qut+=1;
							item_ord+="Cocktel\n";
							break;
							case 4:
							total=total+15;
							qut+=1;
							item_ord+="Water Bottle\n";
							break;
						default:
						System.out.println("Sorry we don't have this item\n");
						
					}
			break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			
			System.out.println("Do you want to add any other item Y/N");
			ans=sc.next().charAt(0);
		}
		while(ans=='Y'||ans=='y');
		
		System.out.println("\nBilli :-");
		System.out.println("The Order items are :\n"+item_ord);
		System.out.println("The Quntity of items :\n"+qut);
		System.out.println("Total Amount :\n"+total);
		System.out.println("\nThanks for Coming... \n Visite Again");
	}

}