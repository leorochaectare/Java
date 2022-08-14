package ApiStream;

import java.util.stream.Stream;

public class MethodOf {
	public static void main(String[] args)
    {
        // Creating an Stream
        Stream stream = Stream.of("Geeks", "for", "Geeks");
  
        // Displaying the sequential ordered stream
        stream.forEach(System.out::println);
        
 
    }
}
