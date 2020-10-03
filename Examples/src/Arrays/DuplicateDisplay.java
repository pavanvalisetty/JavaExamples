package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class DuplicateDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {12,1,52,1,12,633,85};
		
		HashSet items = new HashSet();
		Arrays.stream(array).filter(a->!items.add(a)).boxed().forEach(System.out::println);
	}

}
