package videoexamples.conditionals;

import java.util.Scanner;

public class SwitchFallThrough {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int monthNumber;
		String monthName;
		String season;
	
		System.out.println("Enter a number 1 - 12 : ");
		monthNumber = scnr.nextInt();
		
		switch(monthNumber) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
		default:
			monthName = "INVALID";
		}
		
		switch(monthName) {
			case "January":
			case "Febuary":
			case "March":
				season = "Winter";
				break;
			case "April":
			case "May":
			case "June":
				season = "Spring";
				break;
			case "July":
			case "August":
			case "September":
				season = "Summer";
				break;
			case "October":
			case "November":
			case "December":
				season = "Fall";
				break;
			default:
				season = "Unknown";
		}
		System.out.println("The month is " + monthName);
		System.out.println("The season is " + season);

		scnr.close();
	}

}
