package com.corejava.methods;
import java.util.Scanner;
public class ArmstrongNumber {

	public void arm(int num) {
		int temp,rem,sum=0,digit=0,pro=0;
		
		temp=num;
		while(temp>0) {
			digit++;
			temp=temp/10;
		}
		
		temp=num;
		while(temp>0) {
			rem=temp%10;
			pro=1;
			for(int i=1;i<=digit;i++) {
				pro=pro*rem;
				System.out.println(pro);
			}
			sum=sum+pro;
			temp=temp/10;
		}
		if(sum==num) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not Armstrong number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scb=new Scanner(System.in);
		ArmstrongNumber t=new ArmstrongNumber();
		AllMethods obj=new AllMethods();
		System.out.println("Enter the Numebr>>");
		int num1=scb.nextInt();

System.out.println(num1+" is armstrong :"+(obj.armstrongCheck(num1)));
	}

}
