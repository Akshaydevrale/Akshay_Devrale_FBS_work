package functions;

public class Assignment1 {
	
	public boolean evenodd(int no){
		if(no%2==0) {
			return true;
		}else {
			return false;
		}
	}

	public boolean isPrime(int no) {
		
		for(int i=2;i<no;i++) {
			if(no%i==0) {
				return false;
			}
		}
		return true;
	}
	
	int count(int no){
		int i=0;
		while(no>0) {
			i++;
			no=no/10;
		}
		return i;
	}
	
	int isPalin(int no) {
		int temp=no,count=0,rem,rev=1;
		while(no>0) {
			count++;
			no=no/10;
		}
		no=temp;
		while(no>0) {
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		return rev;
	}
	
	int FirstLastSum(int no) {
		int last=no%10;
		int first=0;
		while(no>0) {
			first=no%10;
			no=no/10;
		}
		return first+last;
	}
	
	int SumOfDigits(int no) {
		int sum=0,r1;
		while(no>0) {
			r1=no%10;
			sum=sum+r1;
			no=no/10;
		}
		return sum;
	}
}
