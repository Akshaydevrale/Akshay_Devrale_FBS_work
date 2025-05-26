//Find the price of item when discount is given (specify different discount based on price)
#include<stdio.h>
int main()
{
	float price = 700;
	float discount, finalprice;
	
	if(price>=2000)
	{
		discount = 0.10;
	}
	else
	{
			if(price>=500)
				discount = 0.05;
			else
				discount = 0.0;
	}
	finalprice = price - (price*discount);
	printf("Discount Applied: %f%%\n",discount * 100);
	printf("Final price after discount: %f",finalprice);
}
