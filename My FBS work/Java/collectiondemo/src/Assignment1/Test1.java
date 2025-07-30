package Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Mobile implements Comparable<Mobile>{
	int imeiNo;
	String brand;
	double price;	
	
	Mobile(int imeiNo,String brand,	double price){
		this.imeiNo=imeiNo;
		this.brand=brand;
		this.price=price;
	}
	String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public int compareTo(Mobile o) {
		return  this.imeiNo - o.imeiNo;
	}
	@Override
	public String toString() {
		return "ImeiNo: "+imeiNo+" Brand: "+brand+" Price: "+price+"\n";
	}
	
}//class mobile ends here
class Brand implements Comparator<Mobile>{

	@Override
	public int compare( Mobile  b1,  Mobile  b2) {
		return b1.brand.compareTo(b2.brand);
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		List<Mobile> mobileList=new ArrayList<Mobile>();
		
		Brand b1 = new Brand ();
		
		mobileList.add(new Mobile(45,"Samsung",1500));
		mobileList.add(new Mobile(34,"vivo", 1000));
		mobileList.add(new Mobile(101,"LG", 3000));
		mobileList.add(new Mobile(76,"Oppo", 45000));
		mobileList.add(new Mobile(99,"Apple", 25000));	
		
		//System.out.println(mobileList);
		
		Collections.sort(mobileList);
		System.out.println(mobileList);

		Collections.sort(mobileList,b1);
		System.out.println(mobileList);
	}

}
