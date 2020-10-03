package StreamExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Sum_Sort_Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Sort 
		List<Apple> inventory = new ArrayList<>();
        inventory.addAll(Arrays.asList(
        		new Apple(80,"green"), 
        		new Apple(155, "green"), 
        		new Apple(120, "red")));

        inventory.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));
        System.out.println(inventory);
        
        // Sum
        
        // Average
        
        inventory.stream().collect(Collectors.toCollection(() -> new TreeSet()<Apple>((p1, p2) -> p1.getColour().compareTo(p2.getName()))));
	}

}
class Apple {
	  private Integer weight = 0;
	  private String color = "";

	  public Apple(Integer weight, String color){
	      this.weight = weight;
	      this.color = color;
	  }

	  public Integer getWeight() {
	      return weight;
	  }

	  public void setWeight(Integer weight) {
	      this.weight = weight;
	  }

	  public String getColor() {
	      return color;
	  }

	  public void setColor(String color) {
	      this.color = color;
	  }

	  public String toString() {
	      return "Apple{" +
	             "color='" + color + '\'' +
	             ", weight=" + weight +
	             '}';
	  }
}