package day.one;

import java.util.ArrayList;

public class MethodPractice {
	
	public static void main(String[] args){
		System.out.println("Ans#5." + getUpperCase("this is a String"));
		System.out.println("Ans#4." + getAsKilometer(10));
		System.out.println("Ans#3." + getAllOddNumber(10));
		System.out.println("Ans#2." + getAllEvenNumber(20));
		System.out.println("Ans#1. " + getName("This is a String"));
		
	}
	/**Q.5
	 * write a method that take one String input and return same String in upper case.
	 * 
	 * parameter/input:String text.
	 * returnType/output:String.
	 * servingBucket/container:variable.
	 */
	public static String getUpperCase(String text) {
		String uppercase = "";
		uppercase = text.toUpperCase();
		return uppercase;
	}
	/**Q.4
	 * write a method that take input as mile & return as kilometer.
	 * 
	 * parameter/input:double mile
	 * returnType/output:double
	 * servingBucket/container:variable
	 */
	public static double getAsKilometer(double mile){
		double kilometer = 0;
		kilometer = mile * 1.6;
		return kilometer;
	}
	
	/**Q.3
	 * write a method that take a number input and return the list of
	 * all odd number from 0 to that given number.
	 * 
	 * parameter/input:int number
	 * returnType/output:ArrayList<Integer>
	 * servingBucket/container:List
	 */
	public static ArrayList<Integer> getAllOddNumber(int number){
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for(int i =0; i<=number; i++){
			if(i % 2 == 1){
				numberList.add(i);
			}
		}
		return numberList;
	}
	
	/**Q.2
	 * write a method that take a number input and return the list of all even
	 * number from 0 to that given number.
	 * 
	 * parameter/input:int number
	 * returnType/output:ArrayList<Integer>
	 * servingBucket/container:List
	 */
	public static ArrayList<Integer> getAllEvenNumber(int number){
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for(int i=0; i<=number; i++){
		if(i % 2 ==0){
		numberList.add(i);
		
		 }
		}
		return numberList;
	}
	
		/**Q.1
		 * write a method that take  your name input and return your name.
		 * 
		 * parameter/input:String name.
		 * returnType/output:String.
		 * servingBucket/container:variable.
		 */
		 public static String getName(String name){
		 String yourName = "";
		 yourName = name;
		 return yourName;
	 }	
	}
