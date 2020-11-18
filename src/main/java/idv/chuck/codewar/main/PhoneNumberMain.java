package idv.chuck.codewar.main;

import java.util.Scanner;

public class PhoneNumberMain {

	public static void main(String[] args) {
		// 1234567890
		// (123) 456-7890
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入numbers:");
		String phoneNumber = scanner.next();
		String phoneNumberFormatted = "";
				
		for(int i=0; i<10; i++) {
			switch(i) {
			case 0:
				phoneNumberFormatted = "(" + phoneNumber.charAt(i);
				break;
			case 1:				
				phoneNumberFormatted = phoneNumberFormatted + phoneNumber.charAt(i);
				break;
			case 2:
				phoneNumberFormatted = phoneNumberFormatted + phoneNumber.charAt(i);
				break;
			case 3:
				phoneNumberFormatted = phoneNumberFormatted + ") " + phoneNumber.charAt(i);
				break;
			case 4:
				phoneNumberFormatted = phoneNumberFormatted + phoneNumber.charAt(i);
				break;
			case 5:
				phoneNumberFormatted = phoneNumberFormatted + phoneNumber.charAt(i);
				break;
			case 6:
				phoneNumberFormatted = phoneNumberFormatted + "-" + phoneNumber.charAt(i);
				break;
			case 7:
				phoneNumberFormatted = phoneNumberFormatted + phoneNumber.charAt(i);
				break;
			case 8:
				phoneNumberFormatted = phoneNumberFormatted + phoneNumber.charAt(i);
				break;
			case 9:
				phoneNumberFormatted = phoneNumberFormatted + phoneNumber.charAt(i);
				break;
			default:				
				break;
			}
		}
		 
		System.out.println("格式化後numbers:" + phoneNumberFormatted);
		

	}

}
