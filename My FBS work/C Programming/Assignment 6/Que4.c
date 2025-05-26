#include<stdio.h>
void evenodd(int*);
int main()
{
	int num;
	printf("Enter the number :");
	scanf("%d",&num);
	evenodd(&num);
}
void evenodd(int*a)
{
	int num=*a;
	if(num%2==0)
	printf("number is even");
	else
	printf("number is odd");
}
