package day3;

public class OddPositionElements {

	public static void main(String[] args) {
		int[] arr = {15, 12, 5, 6, 18, 65, 35, 67};
		for(int i=0; i<arr.length; i++)
		{
			if(i%2 != 0)
			{
				System.out.print(arr[i]+" ,");
			}
		}
	}

}
