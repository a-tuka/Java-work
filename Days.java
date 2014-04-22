 import java.util.Scanner;
class Days{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("WHAT IS THE DAY TODAY?");
		String day = input.nextLine();

		if(day.equals("Monday"))
		{
			System.out.println("First Day of the Week.");
		}
		else if(day.equals("Tuesday"))
		{
			System.out.println("Second Day of the Week.");
		}
		else if(day.equals("Wednesday"))
		{
			System.out.println("Third Day of the Week.");
		}
		else if(day.equals("Thursday"))
		{
			System.out.println("Fourth Day of the Week.");
		}	
		else if(day.equals("Friday"))
		{
			System.out.println("Fifth Day of the Week.");
		}	
		else if(day.equals("Saturday"))
		{
			System.out.println("Sixth Day of the Week.");
		}
		else if(day.equals("Sunday"))
		{
			System.out.println("Seventh Day of the Week.");
		}	
		else{System.out.println("Wrong entry. Try again");}
	}
}

