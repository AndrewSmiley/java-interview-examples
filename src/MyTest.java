import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


//import java.lang.StringBuilder;
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class MyTest{

// METHOD SIGNATURE ENDS

// DO NOT IMPLEMENT THE main( ) METHOD
  public static void main(String[] args)
  {
	  List<Integer> myObj = new LinkedList<Integer>();
	  myObj.add(1);
	  myObj.add(5);
	  myObj.add(34);
	  myObj.add(2);
	  Iterator<Integer> it = myObj.iterator();
	  while (it.hasNext()) {
		  Integer in = it.next();
		System.out.println(in.toString());
//		it.next();
		
	}
	  
	  
   System.out.println("Blow me");
   
  }
}

