package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SubSetEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 4, 2, 1, 9, 2, 6, 5, 3 };
		
		List<Integer> mylist = Arrays.asList( 4, 2, 1, 9, 2, 6, 5, 3 );
		
		Set<Integer> mySet = mylist.stream().filter(ele->ele % 2 == 0).collect(Collectors.toSet());
		
		List<Integer> convertInteger = Arrays.stream(a).boxed().filter(x-> (x%2 == 0)).collect(Collectors.toList());
		Arrays.stream(a).boxed().filter(ele->ele%2==0).forEach(System.out::println);
		HashSet testHash = new HashSet();
		
		testHash.stream().filter(abc->(abc%2 == 0)).forEach(System.out::println);
		
		System.out.println("mySet-----"+mySet);
		System.out.println("convertInteger-----"+convertInteger);
		
		for (int i = 0; i < a.length; i++) { 
			int first = a[i]; 
			for (int j = i + 1; j < a.length; j++) { 
				int second = a[j]; 
				if (a[i]!=a[j] && (a[j]) % 2 == 0 && a[i] % 2 == 0 ) { 
					System.out.printf("(%d, %d) %n", first, second); 
					
					} 
				} 
			}
		int S[] = { 4, 2, 1, 9, 2, 6, 5, 3 };
		int len=S.length;
		int temp=0;
		int arr[] = new int[len*(len+1)/2];  
		 //This loop maintains the starting character  
        for(int i = 0; i < S.length; i++) {  
            //This loop adds the next character every iteration for the subset to form and add it to the array  
            for(int j = i; j < S.length; j++) {  
               // arr[temp] = str.substring(i, j+1);  
                temp++;  
            }  
        } 
        /* int nums[] = { 4, 2, 1, 9, 2, 6, 5, 3 };
        public List<List<Integer>> subsets(int[] nums) {
    		List<List<Integer>> list = new ArrayList<>();
    		subsetsHelper(list, new ArrayList<>(), nums, 0);
    		return list;
    	}
     
    	private void subsetsHelper(List<List<Integer>> list , List<Integer> resultList, int [] nums, int start){
    		list.add(new ArrayList<>(resultList));
    		for(int i = start; i < nums.length; i++){
               // add element
    			resultList.add(nums[i]);
               // Explore
    			subsetsHelper(list, resultList, nums, i + 1);
               // remove
    			resultList.remove(resultList.size() - 1);
    		}
    	}
		//Read more: https://javarevisited.blogspot.com/2014/08/how-to-find-all-pairs-in-array-of-integers-whose-sum-equal-given-number-java.html#ixzz6QYdGYmqR

		// find even subsets
		// Output
		
		 * [4], [2], [6], [4, 2], [2, 6], [4, 6], [4, 2, 6]
		 */
/*
		HashSet<Integer> hashSet = new HashSet<Integer>();
		HashSet<Integer> hashSet1 = new HashSet<Integer>(Arrays.stream(a).collect((Supplier<R>) Collectors.toSet()));

		for (int i = 0; i < a.length; i++) {
			hashSet.add(a[i]);
		}

		System.out.println("non duplicate array:" + hashSet);
		Iterator iter = hashSet.iterator();
		int b[] = new int[a.length];
		System.out.println("Output from Here------------- ");
		int count = 0;
		int countTwo = 0;
		int countThree = 0;
		int twoArray[] = new int[2];
		boolean flagCount = false;
		int temp1 = 0;
		int temp2 = 0;

		Object [] myArray= hashSet.toArray();
		System.out.println("----------------->>>>>>>-"+myArray);
		//Predicate logic= k -> ( k % 2) ==0;
		//ArrayList arrayList= (ArrayList) hashSet.stream().filter(logic).collect(Collectors.toList());
		
		while (iter.hasNext()) {

			// System.out.println(""+iter.next());

			int element = (int) iter.next();

			int twoIteator = 0;
			if (element % 2 == 0) {
				// create sub set of array
				// int subset[]=new int [10];
				System.out.println("[" + element + "]");
				count++;

				if (countTwo < 2) {

					System.out.println("[" + temp1 + "," + element + "]");
					countTwo = 0;
				}

				if (countThree < 3) {

					System.out.println("[" + temp1 + "," + element + "]");
					countTwo = 0;
				}

				if (twoIteator > 2) {
					flagCount = true;
				}

				twoArray[twoIteator] = element;

				if (!flagCount) {
					twoIteator++;
				}

				temp1 = element;
				
				countTwo++;
				countThree++;
			}
		}
		System.out.println("Count of array " + twoArray);
		System.out.println("Count of subset " + count);*/
	}

}
