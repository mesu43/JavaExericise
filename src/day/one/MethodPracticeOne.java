package day.one;

import java.util.ArrayList;

public class MethodPracticeOne {

	public static void main(String[] args) {

		System.out.println(getName("i am from bangladesh"));
		
		System.out.println(getEvenNumberlist(16));
		
		System.out.println(getAllOddNumberList(20));

	}
	/**Q number.3
	 * write a method that take a number input and return the list of
	 * all odd number from 0 to that given number.
	 * 
	 * parameter/input:int number
	 * returnType/output:Arraylist<integer>
	 * servingBucket/container:List 
	 */
	public static ArrayList<Integer> getAllOddNumberList(int number){
		ArrayList<Integer>  NumberList = new ArrayList<Integer>(); 
		
		for(int i = 0; i<=number; i++){
			if(i % 2 ==1){
				
				NumberList.add(i);	
			}
		}
		return NumberList;
	}
	
	
	
	/**Q.number.2
	 * 
	 * write a method that take a number input and return the list of all even
	 * number from 0 to that given number.
	 *
	 * parameter/input:int number
	 * returnType/output:ArrayList<Integer>
	 * servingBucket/container:List
	 */ 
	
	public static ArrayList<Integer> getEvenNumberlist(int number){
		ArrayList<Integer>  givenNumberlist = new ArrayList<Integer>();
		
		for(int i = 0; i<=number; i++){
			if(i % 2 ==0){
				 givenNumberlist.add(i);
			}
		}
		return givenNumberlist;
	}
	 

	/**
	 * Q 1. write a method that take your name input and return your name
	 * 
	 * input/parameter:String name returnType:string out put/returnType:string
	 * servingBucket/container:variable
	 */
	public static String getName(String name) {

		String sumonname = "";
		sumonname = name;

		return sumonname;

	}
}
