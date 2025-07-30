package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class insertionSort {

	public static void main(String[] args) {
		int[]num= {45,18,10,63,12,33};
		
		int arr=num.length;
		for(int i=1;i<arr;i++) {
			int compare=num[i];
			int inner=i-1;
		
			while(inner>=0 && num[i]>compare) {
				num[i+1]=num[inner];
				inner++;
			}
			num[inner+1]=compare;
			System.out.println(Arrays.toString(num));
		}
		System.out.println("Sorted "+Arrays.toString(num));
	}

}
