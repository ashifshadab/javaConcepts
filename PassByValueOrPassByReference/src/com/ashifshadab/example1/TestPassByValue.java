package com.ashifshadab.example1;

/**Java is pass by value. "Just passing a reference as value**/
public class TestPassByValue {

	int globalVariable;
	
	public static void main(String [] args) {
		
		
		
		int localVariable=200;
		
		System.out.println("Before Changing Values of localVariable::"+ localVariable);
		
		changePrimitive(localVariable);
		
		System.out.println("After Changing Values of localVariable::"+ localVariable);
		
		TestPassByValue testPassByValue = new TestPassByValue();
		
		testPassByValue.globalVariable=1000;
		
		System.out.println("Before Changing Values of globalVariable::"+testPassByValue.globalVariable);
		
		changeObject(testPassByValue);
		
		System.out.println("After Changing Values of globalVariable::"+testPassByValue.globalVariable);
	}
	
	public static void changePrimitive(int localVariable) {
		localVariable=500;
	}
	
	public static void changeObject(TestPassByValue testPassByValue) {
		testPassByValue.globalVariable=5000;
	}
	
	
	
	
}
