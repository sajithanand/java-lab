import java.util.*;

class year  {
	public static void main(String args[]) {
		int days=0;
		String month_name="unkown";
		Scanner obj1= new Scanner(System.in);
		System.out.print("Enter month:");
		int month= obj1.nextInt();
		System.out.print("Enter year:");
		int year=obj1.nextInt();
		switch(month) 
		{
		case 1:
			month_name="Januvary";
			days=31;
			break;
		case 2:
			month_name="Februvary";
			if((year%400==0) || ((year%4==0)&& (year%100!=0)))
				days=29;
			else
				days=28;
			break;
		case 3:
			month_name="March";
			days=31;
			break;
		case 4:
			month_name="April";
			days=30;
			break;
		case 5:
			month_name="May";
			days=31;
			break;
		case 6:
			month_name="June";
			days=30;
			break;
		case 7:
			month_name="July";
			days=31;
			break;
		case 8:
			month_name="Augest";
			days=31;
			break;
		case 9:
			month_name="September";
			days=30;
			break;
		case 10:
			month_name="October";
			days=31;
			break;
		case 11:
			month_name="November";
			days=30;
			break;
		case 12:
			month_name="December";
			days=31;
			break;
		
		}
		System.out.println(month_name+" "+year+"\n"+days+" days in the month");
		if(year%400==0)
		{
			System.out.print("It is a leapyear");
		}
		else if(year%4==0 && year%100!=0){
			System.out.print("It is a leapyear");
		}
		else {
			System.out.print("It is not a leapyear");
		}
		
		
		
		
	}

}
