package com.ashifshadab.javaConcepts;

public class Test {

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("JOHN");

		Employee employee2 = new Employee();
		employee2.setId(1);
		employee2.setName("JOHN");

		/**OUTPUT: 
		 * Shallow Compare false
		 * Because == compare here memory location
		 * as we create object with new**/
		
		System.out.println("Shallow Compare " + (employee1 == employee2));
		
		/**OUTPUT
		 * When Employee class does not override equals() method
		 * Shallow Compare false
		 * Deep Compare false
		 *	
		 *When Employee class  override equals() method
		 *Shallow Compare false
		 *Deep Compare true

		**/
		System.out.println("Deep Compare " + (employee1.equals(employee2)));
		
		
	}

}
