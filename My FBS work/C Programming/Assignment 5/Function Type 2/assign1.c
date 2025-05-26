#include<stdio.h>
int temprature();
int area();
int perimeter();
int digit3();
int evenodd();
int maleage();
int femaleage();
void main()
{
	int result=temprature();
	printf("Temprature in fahrenite %d\n",result);
	
	int sum=area();
	printf("Area of the rectangle: %d\n", sum);
	
	int cal=perimeter();
	printf("Perimeter of the rectangle: %d\n", cal);
	
	int digit3();
	printf("Addition of three numbers = %d\n",sum);
	
	int res=evenodd();
	if(res == 1)
	printf("number is even...\n");
	else
	printf("number is odd...\n");
	
	int ageresult=maleage();
	if(ageresult==1)
	printf("Male are eligible to marry...\n");
	else
	printf("Male are Not eligible to marry...\n");

	int femaleresult=femaleage();
	if(femaleresult==1)
	printf("Female are eligible to marry...\n");
	else
	printf("Female are Not eligible to marry...\n");

	

}
int temprature()
{
	int f,c;
	c=36;
	f=(c*5/9)+32;
	return f;
}
int area()
{
	int length = 10, width = 5, a;
	a=length*width;
	return a;
}
int perimeter()
{
	int length = 10, width = 5, p;
	p= 2*(length+width);
	return p;

}
int digit3()
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
	return sum;
}
int evenodd()
{
	int num=18;
	if(num%2==0)
	return 1;
	else
	return 0;
}
int maleage()
{
	int maleage=23;
	if(maleage>=21)
	return 1;
	else
	return 0;
}
int femaleage()
{
	int femaleage=18;
	if(femaleage>=18)
	if(femaleage>=21)
	return 1;
	else
	return 0;
}
