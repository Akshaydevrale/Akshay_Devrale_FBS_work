#include<stdio.h>
int main()
{
	float price, discount, finalprice;
	int student;
	
	printf("Enter the price :");
	scanf("%f",&price);
	
	printf("If you are a student press 1 or press 0");
	scanf("%d",&student);
	
	if(student==1)
	if(price>1000)
	discount=0.20;
	else
	discount=0.10;
	if(student==0)
	if(price>600)
	discount=0.15;
	else
	discount=0.0;
	
	finalprice=price-(price*discount);
	
	printf("Discount %f",discount);
	printf("Finalprice %f",finalprice);
}
