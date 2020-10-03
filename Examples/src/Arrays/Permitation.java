package Arrays;

public class Permitation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]= {1,2,3,5,6};
		int n = array.length;
		String s=array+"";
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<n;j++) {
				System.out.println(s.substring(i, j));
			}
		}
	}

}
