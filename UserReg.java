package com.javaprogram.pattern;

import java.util.Scanner;
import java.util.regex.*;


public class UserReg {

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");

		System.out.println("Enter First Name:");

		Scanner scanner=new Scanner(System.in);
		String userInput=scanner.next();

		Pattern firstNameRegExp=Pattern.compile("(^[A-Z]{1})[a-z]{2,}");
		Matcher matchResult=firstNameRegExp.matcher(userInput);
		boolean firstNameResult=matchResult.matches();
		if(firstNameResult == true)
		{
			System.out.println(firstNameResult);
		}
		else
		{
			System.out.println(firstNameResult);
		}

		System.out.println("Enter Last Name:");
		Scanner scanner1=new Scanner(System.in);
		String userInputLastName=scanner1.next();

		Pattern lastNameRegExp=Pattern.compile("([A-Z]{1}[a-z]{2,}\s{0,}[A-Z]{1}[a-z]{2,})");
		Matcher matchResultLastName=lastNameRegExp.matcher(userInputLastName);
		boolean lastNameResult=matchResultLastName.matches();
		if(lastNameResult == true)
		{
			System.out.println(lastNameResult);
		}
		else
		{
			System.out.println(lastNameResult);
		}

		
		System.out.println("Enter EmailId");
		Scanner scanner2=new Scanner(System.in);
		String userInputEmailId=scanner2.next();
		
		Pattern emailIdRegExp=Pattern.compile("(^[a-z]{3,}.)|([a-z]{3,})@([a-z]{2,}.[a-z]{2})|(.[a-z]{2})");
		Matcher matchResultEmailId=emailIdRegExp.matcher(userInputEmailId);
		boolean emailIdResult=matchResultEmailId.matches();
		if(emailIdResult == true)
		{
			System.out.println(emailIdResult);
		}
		else
		{
			System.out.println(emailIdResult);
		}
	
		
	
	}

}

