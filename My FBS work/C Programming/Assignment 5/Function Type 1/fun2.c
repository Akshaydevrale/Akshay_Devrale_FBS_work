//Assignment 2,Function type 1.
#include<stdio.h>
void discount();
void ifelse();
void choice();
void check();
void main()
{
	discount();
	ifelse();
	choice();
	check();
}
void discount()
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
	printf("\nDiscount Applied: %f%%",discount * 100);
	printf("\nFinal price after discount: %f",finalprice);
}
void ifelse()
{
	int a=80, b=60, c=70;
	if(a>=b)
	{
		if(a>=c)
		printf("\na is greater : %d",a);
		else
		printf("\nc is greater : %d",c);
	}
	else
	{
		if(b>=c)
		printf("\nb is greater : %d",b);
		else
		printf("\nc is greater : %d",c);
	}
}
void choice()
{
	int choice;
	printf("\nMenu :");
	printf("\n1. Check Even or Odd\n");
    printf("2. Calculate Basic Salary with GST\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);
    
    if(choice == 1)
    {
    	int num;
    	printf("Enter a number:");
    	scanf("%d", &num);
    	
    	if(num%2==0)
    	printf("%d Number is even",num);
    	else
    	printf("%d Number is odd",num);
	}
	if(choice == 2)
	{
	float basic, gst, totalamount;
	printf("Enter basic salary");
	scanf("%d", basic);
	
	gst=basic*0.18;
	totalamount=basic-gst;
	printf("GST :%.2f",gst);
	printf("Total amount with GST :%f",totalamount);
	}
}
void check()
{
	float price, discount, finalprice;
	int student;
	
	printf("\nEnter the price :");
	scanf("%f",&price);
	
	printf("\nIf you are a student press 1 or press 0");
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
	
	printf("\nDiscount %f",discount);
	printf("\nFinalprice %f",finalprice);
}
