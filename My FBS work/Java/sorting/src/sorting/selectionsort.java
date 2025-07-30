package sorting;

public class selectionsort {

	public static void main(String[] args) {
		int num[]= {45,18,63,9,93,10};
		int length=num.length;
		
		for(int outer=0;outer<num.length-1;outer++) {
			int minindex=outer;{
				for(int inner=outer+1;inner<num.length;inner++) {
					if(num[inner]<num[minindex]) {
						minindex=inner;
					}
				}
			}
			int temp=num[minindex];
			num[minindex]=num[outer];
			num[outer]=temp;
		}
		for(int value:num) {
			System.out.println(value);
		}
		
	}

}
