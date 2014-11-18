import java.util.ArrayList;


public class MyClass {
	private int myInt;
	private String myString;
	
	/*
	 * Copy constructor
	 */
	public MyClass(MyClass mc){
		this(mc.myInt, mc.myString);
	}
	
	
	/*
	 * constructor with arguments
	 */
	public MyClass(int i, String s){
		this.myInt = i;
		this.myString = s;
		
		
			
	}
	
}
