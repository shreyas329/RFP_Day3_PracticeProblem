package day3;

public class SecondLargestNo {

	public static void main(String[] args) {
		int temp = 0;
		int[] arr = {15, 12, 5, 6, 18, 65, 35, 67};
		System.out.println("Original array:");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
		for (int i = 0; i < arr.length; i++)
		{     
            for (int j = i+1; j < arr.length; j++)
            {     
               if(arr[i] > arr[j])
               {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }
		System.out.println("\nSecond largest number in the array is: "+arr[1]);
	}

}
