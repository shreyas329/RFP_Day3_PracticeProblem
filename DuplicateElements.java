package day3;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 5, 6, 5, 3, 2, 8, 9, 5};
		System.out.println("Duplicate elements are: ");
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.print(arr[j]+", ");
				}
			}
		}

	}

}
