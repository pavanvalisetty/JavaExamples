package codingtest;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4 5 Boateng 6.1 22 24 45 Kaka 6 22 1 1 Ronaldo 5.8 21 120 0 Suarez 5.9 20 100
		 * 1
		 * 
		 * 
		 * 
		 * 5 Boateng 6.1 22 24 45 Kaka 6 22 1 1 Ronaldo 5.8 21 120 0 Suarez 5.9 20 100 1
		 * 
		 */

		String row = "4";
		String colum ="5";
		String one = "Boateng 6.1 22 24 45";
		String two = "Kaka 6 22 1 1";

		@SuppressWarnings("unchecked")
		List<List<String>> myList = new ArrayList<>();
		List<String> childList = new ArrayList<String>();
		childList.add(row);
		childList.add(colum);
		childList.add(one);
		childList.add(two);
		myList.add(childList);

		List<List<String>> applications = myList;
		System.out.println(getSelectionStatus(myList));

	}

	public static List<List<String>> getSelectionStatus(List<List<String>> applications) {

		List<Player> playlist = new ArrayList<Player>();
		List<List<String>> result = new ArrayList();

		for (List<String> ll : applications) {

			// System.out.println("-------"+ll);
			String input = ll.toString().trim();
			input = input.replaceAll("\\[", "");
			input = input.replaceAll("\\]", "");
			input.trim();
			String[] myString = input.split(",");
			// System.out.println(""+myString);
			int count=0;
			for (String str : myString) {
				// System.out.println(""+str);
				
				String[] childStr = str.trim().split(" ");

				if(count>1) {
				String name = childStr[0];
				Double height = Double.valueOf(childStr[1]);
				Double bmi = Double.valueOf(childStr[2]);

				Integer score = Integer.parseInt(childStr[3]);
				Integer defends = Integer.parseInt(childStr[4]);

				Player p = new Player(name, height, bmi, score, defends);
				playlist.add(p);
				
				}
				count++;
			}
		}

		List<String> temp = new ArrayList<String>();
		for (Player onePlayer : playlist) {

			// System.out.println("->"+onePlayer.getName());
			// Fitness Factor one
			if (onePlayer.getHeight() >= 5.8 && onePlayer.getBmi() > 20 && onePlayer.getScore() > 20
					&& onePlayer.getDefends() > 20) {

				// Striker scored
				if (onePlayer.getScore() >= 50) {

					 System.out.println(onePlayer.getName() +" SELECT" + " STRIKER");
					temp.add(onePlayer.getName() + " SELECT" + " STRIKER");

				}
				if (onePlayer.getDefends() >= 30) {

					 System.out.println(onePlayer.getName() +" SELECT" + " DEFENDER");
					temp.add(onePlayer.getName() + " SELECT" + " DEFENDER");
				}

			} else {
				 System.out.println(onePlayer.getName()+" REJECT NA ");
				temp.add(onePlayer.getName() + " REJECT  NA ");
			}
		}

		result.add(temp);

		return result;

	}
}

class Player {

	private String name;
	private Double height;
	private Double bmi;
	private Integer score;
	private Integer defends;

	Player() {

	}

	public Player(String name, Double height, Double bmi, Integer score, Integer defends) {
		this.name = name;
		this.height = height;
		this.bmi = bmi;
		this.score = score;
		this.defends = defends;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getBmi() {
		return bmi;
	}

	public void setBmi(Double bmi) {
		this.bmi = bmi;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getDefends() {
		return defends;
	}

	public void setDefends(Integer defends) {
		this.defends = defends;
	}

}
