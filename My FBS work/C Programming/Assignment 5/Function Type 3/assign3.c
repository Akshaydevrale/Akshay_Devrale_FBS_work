#include<stdio.h>
void numbers(int);
void table(int);
void sum(int,int);
void prime(int);
void armstrong(int);
void perfect(int);
void factorial(int);
void strong(int);
void main()
{
		int n=1;
		int no=12;
		int a=1,b=10;
		int num=11; 
		int i;
		int number;
		int num1=5;
		int num2=28;

		numbers(a);
		table(no);
		sum(a,b);
		prime(num);
		
		printf("Enter a number to check armstrong or not: ");
    	scanf("%d", &i);
    	armstrong(i);
    	
    	printf("Enter a number check perfect: ");
    	scanf("%d", &number);
    	perfect(number);
    	
    	factorial(num1);
    	strong(num2);
}
void numbers(int n)
{
	printf("Printing numbers from 1 to 10:");
	while(n<=10)
	{
		printf(" %d",n);
		n++;
	}
}
void table(int no)
{
	int i=1;
	int sum;
	while(i<=10)
	{
		sum=no*i;
		printf("\n%d",sum);
		i++;
	}
}
void sum(int a,int b)
{
	int sum=0;
    while (a<=b) 
	{
        sum=sum+a;
        a++;     
    }
    printf("\nSum of numbers from 1 to 10: %d\n", sum);
}
void prime(int num)
{
    int prime=1;
    int i=2;

    while(i*i<=num) 
	{
        if(num%i==0) 
		{
            prime=0;
        }
        i++;
    }
    if (prime) 
        printf("%d is a prime number.\n", num);
    else 
        printf("%d is not a prime number.\n", num);
}
void armstrong(int i)
{
	int num, rem, sum=0, count=0, temp;
	
    num=i;
    temp=i;
    while(temp!=0) 
	{
        temp=temp/10;
        count++;
    }
    temp=i;
    while(temp!=0) 
	{
        rem=temp%10;
        sum=sum+pow(rem, count);
        temp=temp/10;
    }
    if(sum==num)
        printf("%d is an Armstrong number.\n", num);
    else
        printf("%d is not an Armstrong number.\n", num);
}
void perfect(int number)
{
	int i=1, sum=0;

    while(i<number) 
	{
        if(number%i==0) 
            sum=sum+i;
        i++;
    }
    if(sum==number)
        printf("%d is a perfect number.\n", number);
	else 
        printf("%d is not a perfect number.\n", number);
}
void factorial(int num1)
{
    int factorial=1;
	int i=num1;
    while(i>1) 
	{
        factorial=factorial*i;
        i--;
    }

    printf("Factorial of %d = %d\n", num1, factorial);
}
void strong(int num2)
{
	int sum=0,temp=num2;

    while(temp>0) 
	{
        int r=temp%10;
        int fact=1;
        int i=1;

        while(i<=r) 
		{
            fact=fact*i;
            i=i+1;
        }
        sum=sum+fact;
        temp=temp/10;
    }
    if(sum==num2) 
        printf("%d is a Strong number!\n", num2);
    else 
        printf("%d is not a Strong number.\n", num2);
}
