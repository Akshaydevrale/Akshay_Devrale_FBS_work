package sorting;

import java.util.Arrays;

public class Quick {
	public static void main(String[] args) {
		int []arr= {23,45,69,44,9,1,20};
		Quick(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	public static void Quick(int[]arr) {
		sort(arr,0,arr.length-1);
	}
	public static void sort(int [] arr,int low,int high) {
		if(low<high) 
		{
			int divisionPos=divide(arr,low,high);
			sort(arr,low,divisionPos-1);
			sort(arr,divisionPos+1,high);
		}
	}
	public static int divide(int[] ref,int low,int high) {
		int pivot=ref[high];
		int first=low-1;
		
		for(int second=low;second<high;second++) {
			if(ref[second]<=pivot) {
				first++;
				int temp=ref[first];
				ref[first]=ref[second];
				ref[second]=temp;
			}
			
		}
		int temp=ref[first+1];
		ref[first+1]=ref[high];
		ref[high]=temp;
		
		return first+1;
	}

}
