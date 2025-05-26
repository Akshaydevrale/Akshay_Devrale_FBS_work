#include<stdio.h>
void age(int*,int*);
int main()
{
	int male,female;
	printf("Enter the age of Male & Female :");
	scanf("%d%d",&male,&female);
	age(&male,&female);
	
}
void age(int*a,int*b)
{
	int maleage=*a;
	if(maleage>=21)
	printf("Male are Eligible to marry\n");
	else
	printf("Male are Not Eligible to marry\n");
	
	int age=*b;
	if(age>=18)
	printf("Female is Eligible to marry");
	else
	printf("Female is Not Eligible to marry");
}
