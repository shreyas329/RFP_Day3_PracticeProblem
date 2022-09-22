package day3;

public class LargestElement {

	public static void main(String[] args) {
		int[] arr = {15, 12, 5, 6, 18, 65, 35, 67};
		int max = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println(max+" is the greatest element in the array.");
	}

}
