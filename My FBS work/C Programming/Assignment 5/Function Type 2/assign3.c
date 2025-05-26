#include<stdio.h>
int numbers();
int table();
int sum();
int prime();
int armstrong();
int perfect();
int factorial();
int strong();
int main()
{
	numbers();
	table();
	int add=sum();
	printf("\nSum of numbers from 1 to 10: %d\n", add);
	
	int pr=prime();
	if (pr==1) 
        printf("Number is a prime...");
    else 
        printf("Number is not a prime...");
        
        
    int a=armstrong();
    if(a==1)
        printf("Number is an Armstrong...");
    else
        printf("Number is not an Armstrong...");
        
        
    int p=perfect();
    if(p==1)
        printf("It is a perfect number...");
	else 
        printf("It is not a perfect number...");
        
    int f=factorial();
    printf("Factorial of given number are:%d",f);
    
    int s=strong();
    if(s==1) 
        printf("It is a Strong number...");
    else 
        printf("It is not a Strong number...");
	
}
int numbers()
{
	int a=1;
	printf("Printing numbers from 1 to 10:");
	while(a<=10)
	{
		printf(" %d",a);
		a++;
	}
	return a;
}
int table()
{
	int no=12;
	int i=1;
	int sum;
	printf("\nPrinting the table of given number:");
	while(i<=10)
	{
		sum=no*i;
		printf(" %d",sum);
		i++;
	}
	return sum;
}
int sum()
{
	int a=1,b=10,c=0;
    while (a<=b) 
	{
        c=c+a;
        a++;     
    }
    return c;
}
int prime()
{
	int number;
	printf("Enter a number to check prime or not: ");
    scanf("%d", &number); 
    int prime=1;
    int i=2;

    while(i*i<=number) 
	{
        if(number%i==0) 
		{
            prime=0;
        }
        i++;
    }
    if (prime) 
    return 1;
    else 
    return 0;
}
int armstrong()
{
	int i, num, rem, sum=0, count=0, temp;
    printf("\nEnter a number to check armstrong or not: ");
    scanf("%d", &i);

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
    return 1;
    else
    return 0;
}
int perfect()
{
	int num, i=1, sum=0;
    printf("\nEnter a number to perfect no: ");
    scanf("%d", &num);

    while(i<num) 
	{
        if(num%i==0) 
            sum=sum+i;
        i++;
    }
    if(sum==num)
	return 1;
	else 
    return 0;
}
int factorial()
{
	int num;
	printf("\nEnter a number to check factorial:");
    scanf("%d", &num); 
    int factorial=1;
	int i=num;
    while(i>1) 
	{
        factorial=factorial*i;
        i--;
    }
    return factorial;
}
int strong()
{
	int num;
	printf("\nEnter a number to check it is strong or not:");
    scanf("%d", &num); 
	int sum=0,temp=num;
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
    if(sum==num) 
	return 1;
    else 
	return 0;
}
