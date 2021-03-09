import java.util.Arrays;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}

			}
		}
	}
	
	public static void main(String args[]) {
		int[] arr = new int[] {4,5,9,1,7,3,2,8,6};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
