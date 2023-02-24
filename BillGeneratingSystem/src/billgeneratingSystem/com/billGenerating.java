package billgeneratingSystem.com;

import java.util.Scanner;

public class billGenerating {

	public static Scanner input= new Scanner(System.in);
	public static int choice,quality=1;
	public static String again;
	public static double total=0,pay;

	public static void menu() {
		System.out.println("------------------------");
		System.out.println("Wellcome to the restuarent");
		System.out.println("menu card");

		System.out.println("\t1.pizza  BDI $90.00");
		System.out.println("\t2.burger  BDI $70.00");
		System.out.println("\t3.coffe  BDI $80.00");

		System.out.println("\t4.cancel");
		System.out.println("==========================");
	}
	public static void order() {
		System.out.println("1 to pizza || 2 to burger || 3 to coffee");
		System.out.println("==========================");

		System.out.println("enter which one you want");
		choice=input.nextInt();
		if(choice==1) {
			System.out.println("your choice is pizza");
			System.out.println("how many pizzas you want?:");
			quality=input.nextInt();
			total=total+quality*90;
			System.out.println("you want to buy again ");
			System.out.println("press y for yes no for n");
			again=input.next();
			if(again.equalsIgnoreCase("y"))
				order();
			else {
				System.out.println("enter your payment");
				pay=input.nextDouble();
				if(pay<total) {
					System.out.println("no need more");
				}
				else {
					System.out.println("total="+total);
					total=pay-total;
					System.out.println("customers return"+total+"tk");
					System.out.println("==========================");

				}
			}
		}


		if(choice==2) {
			System.out.println("your choice is burger");
			System.out.println("how many pizzas you want?:");
			quality=input.nextInt();
			total=total+quality*70;
			System.out.println("you want to buy again ");
			System.out.println("press y for yes no for n");
			again=input.next();
			if(again.equalsIgnoreCase("y"))
				order();
			else {
				System.out.println("enter your payment");
				pay=input.nextDouble();
				if(pay<total) {
					System.out.println("no need more");
				}
				else {
					System.out.println("total="+total);
					total=pay-total;
					System.out.println("customers return"+total+"tk");
				}
			}
		}


		if(choice==3) {
			System.out.println("your choice is coffee");
			System.out.println("how many pizzas you want?:");
			quality=input.nextInt();
			total=total+quality*80;
			System.out.println("you want to buy again ");
			System.out.println("press y for yes no for n");
			again=input.next();
			if(again.equalsIgnoreCase("y"))
				order();
			else {
				System.out.println("enter your payment");
				pay=input.nextDouble();
				if(pay<total) {
					System.out.println("no need more");
				}
				else {
					System.out.println("total="+total);
					total=pay-total;
					System.out.println("customers return"+total+"tk");
				}
			}
		}

		else if (choice==4){
			System.exit(0);
		}else {
			//System.out.println("choose a food itmes");
			//order();
		}
	}

	public static void main(String[] args) {
		menu();
		order();

	}

}


