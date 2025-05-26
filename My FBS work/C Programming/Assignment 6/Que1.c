#include<stdio.h>
void temprature(int*);
void main()
{
	int no1;
	printf("Enter the number:");
	scanf("%d",&no1);
	temprature(&no1);
}
void temprature(int* a)
{
	int f,c;
	c=*a;
	f=(c*5/9)+32;
	printf("%d",f);
}

