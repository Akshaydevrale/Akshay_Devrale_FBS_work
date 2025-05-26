#include<stdio.h>
void discount(int);
void ifelse(int,int,int);
void isstudent(float,int);
void main()
{
	int price;
	int a=80, b=60, c=70;
	float rupee; 
	int student;

	printf("Enter the price:");
	scanf("%d",&price);
	discount(price);
	
	ifelse(a,b,c);
	
	printf("\nEnter the price :");
	scanf("%f",&rupee);
	printf("If you are a student press 1 or press 0");
	scanf("%d",&student);
	isstudent(rupee,student);
}
void discount(int price)
{
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
	printf("Final price after discount: %f\n",finalprice);
}
void ifelse(int a,int b,int c)
{
	if(a>=b)
	{
		if(a>=c)
		printf("\nA is greater : %d\n",a);
		else
		printf("\nC is greater : %d\n",c);
	}
	else
	{
		if(b>=c)
		printf("\nB is greater : %d\n",b);
		else
		printf("\nC is greater : %d\n",c);
	}
}
void isstudent(float rupee,int student)
{
	float discount,finalprice;
	
	if(student==1)
	if(rupee>1000)
	discount=0.20;
	else
	discount=0.10;
	if(student==0)
	if(rupee>600)
	discount=0.15;
	else
	discount=0.0;
	
	finalprice=rupee-(rupee*discount);
	
	printf("Discount %f",discount);
	printf("Finalprice %f\n",finalprice);
}
