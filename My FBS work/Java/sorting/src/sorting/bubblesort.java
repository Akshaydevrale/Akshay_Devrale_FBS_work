package sorting;

public class bubblesort {

	public static void main(String[] args) {
		
		int []arr= {23,44,20,13,56,9};
		
		for(int outer=0; outer<arr.length;outer++) {
			for(int inner=0;inner<arr.length-1-outer;inner++) {
				if(arr[inner]>arr[inner+1]) {
					int temp=arr[inner];
					arr[inner]=arr[inner+1];
					arr[inner+1]=temp;
//					System.out.println(+arr[inner]);
				}
			}
		}
		for(int value:arr) {
			System.out.println(value);
		}
		
	}

}
