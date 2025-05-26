#include<stdio.h>
#include<string.h>
typedef struct complex
{
	int real;
	int imaginary;
}complex;
complex store(complex);
void display(complex);
void main()
{
	complex c;
	c=store(c);
	display(c);
}
complex store(complex c)
{
	printf("Enter real :");
	scanf("%d",&c.real);
	printf("Enter imaginary :");
	scanf("%d",&c.imaginary);
	
	return c;
}
void display(complex c)
{
	printf("Real :%d Imaginary :%d",c.real,c.imaginary);
}
