#include<stdio.h>
void reverse(int*);
int main()
{
	int num;
	printf("Enter a three-digit number: ");
    scanf("%d", &num);
    reverse(&num);
}
void reverse(int*n)
{
	int num=*n;
	int a,b,c;
	a=num/100;
	int q1=num%100;
	b=q1/10;
	c=q1%10;
	int sum=a+b+c;
	printf("Addition of three numbers = %d\n",sum);
	printf("Reverse of the numbers = %d%d%d",c,b,a);
}
