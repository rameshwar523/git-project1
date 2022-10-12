package com.corejava.methods;

public class AllMethods {
	/* Here we have created user defined method and they are below listed
	 * 1) public boolean armstrongCheck(int num)
	 * 2)public boolean primeNumberCheck(int num)
	 * 3)public boolean palindromeNumberCheck(int num)
	 * 4)public int stringSpaceCalculate(String str)
	 * 5)public boolean reverseStringCompare(String str)
	 **/
	//method to find the given number is armstrong or not
	public boolean armstrongCheck(int num) {
		
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
					
				}
				sum=sum+pro;
				temp=temp/10;
			}
			if(sum==num) {
				//System.out.println("Armstrong number");
				return true;
			}else {
				//System.out.println("Not Armstrong number");
				return false;
			}
	}
//method to check the given number is prime or no
public boolean primeNumberCheck(int num) {
	boolean flag=false;
	if(num==0||num==1) {
		flag=false;
	}else {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}else {
				flag= true;
			}
		}
	}
	return flag;
}

//palindrome number method

public boolean palindromeNumberCheck(int num) {
	int rev=0,temp,rem;
	
	temp=num;
	if(temp>0) {
		while(temp>0) {
			rem=temp%10;
		rev=(rev*10)+rem;
		temp=temp/10;
		}
	}else {
		return false;
	}
	if(num==rev) {
		return true;
	}else {
		return false;
	}
}
// String space calculate method
public int stringSpaceCalculate(String str) {
	int length=str.length();
	int count=0;
	for(int i=0;i<length-1;i++) {
		if(str.charAt(i)==' ') {
			count++;
			
		}
	}
return count;	
}

//Reverse string compare method

public boolean reverseStringCompare(String str) {
	boolean flag=false;
	int length=str.length();
	for(int i=0;i<length-1;i++) {
		if(str.charAt(i)!=str.charAt(length-1-i)) {
			flag=false;
			break;
		}else {
			flag=true;
		}
	}
	return flag;
}
}