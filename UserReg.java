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
	}

}
