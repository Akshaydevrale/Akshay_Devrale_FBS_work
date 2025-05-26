#include <stdio.h>
float calculateFinalPrice();
int ifelse();
int main() 
{
    float finalPrice = calculateFinalPrice();
    printf("Final price after discount: %.2f", finalPrice);
    return 0;
    
    ifelse();
    
    return 0;
}
float calculateFinalPrice() 
{
    float price = 700;
    float discount;
    
    if (price >= 2000) 
	{
        discount = 0.10;
    }
	else if (price >= 500) 
	{
        discount = 0.05;
    } 
	else 
	{
        discount = 0.0;
    }
    
    float finalPrice = price - (price * discount);
    printf("Discount Applied: %.2f%%\n", discount * 100);
    return finalPrice;
}
int ifelse()
{
	int a=80, b=60, c=70;
	if(a>=b)
	{
		if(a>=c)
		printf("a is greater : %d",a);
		else
		printf("c is greater : %d",c);
	}
	else
	{
		if(b>=c)
		printf("b is greater : %d",b);
		else
		printf("c is greater : %d",c);
	}
	return 0;
}

