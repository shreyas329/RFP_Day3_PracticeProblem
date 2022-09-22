package day3;

public class SmallestElement {

	public static void main(String[] args) {
		int[] arr = {15, 12, 5, 6, 18, 65, 35, 67};
		int min = arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println(min+" is the greatest element in the array.");

	}

}
