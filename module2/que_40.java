package module2;

import java.util.ArrayList;

public class que_40 {
	public static void main(String[] args) {
	   
	    ArrayList<String> languages = new ArrayList<>();
	    languages.add("Java");
	    languages.add("JavaScript");
	    languages.add("Python");
	    System.out.println("ArrayList: " + languages);

	    System.out.println("Iterating over ArrayList using for loop: ");

	    for(int i = 0; i < languages.size(); i++) {
	      System.out.print(languages.get(i));
	      System.out.print(", ");
	    }
	  }
}
