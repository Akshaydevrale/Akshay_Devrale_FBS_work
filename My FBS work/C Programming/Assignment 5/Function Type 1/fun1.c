//Assignment 1,Function type 1.
#include<stdio.h>
void temprature();
void area();
void reverse();
void evenodd();
void salary();
void age();
void main()
{
	temprature();
	area();
	reverse();
	evenodd();
	salary();
	age();
}
void temprature()
{
	int f,c;
	c=36;
	f=(c*5/9)+32;
	printf("%d",f);
}
void area()
{
	int length = 10, width = 5, area, perimeter;
	
    area = length*width;
    perimeter = 2*(length+width);
    
    printf("\nArea of the rectangle: %d", area);
    printf("\nPerimeter of the rectangle: %d\n", perimeter);
}
void reverse()
{
	int num;
	int a,b,c;
	printf("Enter a three-digit number: ");
    scanf("%d", &num);
	a=num/100;
	int q1=num%100;
	b=q1/10;
	c=q1%10;
	int sum=a+b+c;
	printf("\nAddition of three numbers = %d",sum);
	printf("\nReverse of the numbers = %d%d%d",c,b,a);
}
void evenodd()
{
	int num;
	printf("\nEnter a number: ");
    scanf("%d", &num);
	if(num%2==0)
	printf("\nNmber is even");
	else
	printf("\nNumber is odd");
}
void salary()
{
	float basic, da, ta, hra, total_salary;
	basic=4880;    
	if (basic <= 5000) 
	{
        da=basic*0.10;
        ta=basic*0.20;
        hra=basic*0.25;
    }
	else 
	{
        da=basic*0.15;
        ta=basic*0.25;
        hra=basic*0.30;
    }
    total_salary=basic+da+ta+hra;
    printf("\nBasic Salary: %f\n", basic);
    printf("DA: %f\n", da);
    printf("TA: %f\n", ta);
    printf("HRA: %f\n", hra);
    printf("Total Salary: %f\n", total_salary);
}
void age()
{
	int maleage=34;
	if(maleage>=21)
	printf("\nMale are Eligible to marry\n");
	else
	printf("Male are Not Eligible to marry\n");
	
	int age=17;
	if(age>=18)
	printf("\nFemale is Eligible to marry");
	else
	printf("\nFemale is Not Eligible to marry");
}
