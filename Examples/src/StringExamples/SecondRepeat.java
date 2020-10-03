package StringExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[]={"aaa", "bbb", "ccc", "bbb","aaa", "aaa"};
		
		Stream<String> str1=Arrays.asList(str).stream();
		
		str1.filter(i->Collections.frequency(str,i)> 1 ).collect(Collectors.toSet());

	}

}
