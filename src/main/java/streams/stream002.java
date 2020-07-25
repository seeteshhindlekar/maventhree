package streams;

import java.util.stream.Stream;

public class stream002 {
	
	   public static void main(String[] args) {

	        Stream.iterate(1, element->element+1)  
	        .filter(element->element%2==0)  
	        .limit(2)  
	        .forEach(System.out::println);  

	        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

	        Stream.iterate(1, element->element+1)  
	        .filter(element->element%5==0)  
	        .limit(4)  
	        .forEach(System.out::println);  

	        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	        
	        
	        Stream.iterate(1, element->element+1)  
	        .filter(element->element%6==0)  
	        .limit(6)  
	        .forEach(System.out::println);  
	    }  

}
