package com;

import java.util.Scanner;

/**
 * 
 *@author shivateja yadav
 *@since 2023
 */
public class Solution {
	public static void main(String[] args) {
		Bank bank=new BankImp(0);
		Scanner scanner=new Scanner(System.in);
		
		while(true){
			System.out.println(" 1.Deposit Amount\n 2.Withdrawn Amount\n 3.Check Balance\n 4.Exit");
			System.out.println("Enter Choice");
			int choice=scanner.nextInt();
			
			switch(choice) {
			case
			1 :{
				System.out.println("Enter Your Amount For Depositing");
				bank.deposit(scanner.nextInt());
				System.out.println("Your Available Balance Is:"+bank.getBalance()+"Rs");
				break;
			}
			case 2 :{
				System.out.println("Enter Amount For Withdrawal");
				bank.withdraw(scanner.nextInt());
				System.out.println("Your Available Balance Is:"+bank.getBalance()+"Rs");
				break;
			}
			case 3 :{
				System.out.println("Your Available Balance Is:"+bank.getBalance()+"Rs");
				break;
			}
			case 4 :{
				System.out.println("Thank You!!!");
				System.exit(0);
			}
			default :{
				System.out.println(bank.displayErrorMessage());
			}
				
			}
			System.out.println("=============================");
		}
		
	}

}
