package PredicateEx;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import PredicateEx.HostingRespository.Hosting;

public class FilterEx {

	public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = list.stream().filter(x -> x > 5).collect(Collectors.toList());

        System.out.println(collect); // [6, 7, 8, 9, 10]

        // Predicate
        
        Predicate<Integer> noGreaterThan5 =  x -> x > 5;

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect1 = list1.stream()
                .filter(noGreaterThan5)
                .collect(Collectors.toList());

        System.out.println(collect1); // [6, 7, 8, 9, 10]
        
        //  AND condition 
        //Predicate<Integer> noGreaterThan5 = x -> x > 5;
        Predicate<Integer> noLessThan8 = x -> x < 8;

        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect3 = list3.stream()
                .filter(noGreaterThan5.and(noLessThan8))
                .collect(Collectors.toList());

        System.out.println(collect3);
        
        // OR condition
        Predicate<String> lengthIs3 = x -> x.length() == 3;
        Predicate<String> startWithA = x -> x.startsWith("A");
        
        Predicate<String> startWithFirstName = x -> x.startsWith("A");

        List<String> list4 = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        List<String> collect4 = list4.stream()
                .filter(lengthIs3.or(startWithA))
                .collect(Collectors.toList());

        System.out.println(collect4);
        
        // negate 
        Predicate<String> startWithA1 = x -> x.startsWith("A");

        List<String> list5 = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        List<String> collect5 = list5.stream()
                .filter(startWithA.negate())
                .collect(Collectors.toList());

        System.out.println(collect5);
        
        // test 
        List<String> list6 = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

       // System.out.println(StringProcessor.filter(
          //      list, x -> x.startsWith("A")));                    // [A, AA, AAA]

       // System.out.println(StringProcessor.filter(
          //      list, x -> x.startsWith("A") && x.length() == 3)); // [AAA]
        
        
        // Chaining
        // start with "a" or "m"
        boolean result = startWithA.or(x -> x.startsWith("m")).test("mkyong");
        System.out.println(result);     // true

        // !(start with "a" and length is 3)
        boolean result2 = startWithA.and(x -> x.length() == 3).negate().test("abc");
        System.out.println(result2);    // false
        
        
       // Predicate in Object
        
        Hosting h1 = new Hosting(1, "amazon", "aws.amazon.com");
        Hosting h2 = new Hosting(2, "linode", "linode.com");
        Hosting h3 = new Hosting(3, "liquidweb", "liquidweb.com");
        Hosting h4 = new Hosting(4, "google", "google.com");

        List<Hosting> list7 = Arrays.asList(new Hosting[]{h1, h2, h3, h4});

        List<Hosting> result7 = HostingRespository.filterHosting(list, x -> x.getName().startsWith("g"));
        System.out.println("result : " + result);  // google

        List<Hosting> result8 = HostingRespository.filterHosting(list, isDeveloperFriendly());
        System.out.println("result2 : " + result2); // linode
    }
	
}
class HostingRespository {

    public static List<Hosting> filterHosting(List<Hosting> hosting,
                                              Predicate<Hosting> predicate) {
        return hosting.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
class Hosting {

    public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	private int Id;
    private String name;
    private String url;

    public Hosting(int id, String name, String url) {
        Id = id;
        this.name = name;
        this.url = url;
    }

    
}
