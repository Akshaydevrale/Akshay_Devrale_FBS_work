//Assignment 3,Function type 1.
#include<stdio.h>
void printrange();
void table();
void sum();
void prime();
void armstrong();
void perfect();
void factorial();
void strong();
void main()
{
	printrange();
	table();
	sum();
	prime();
	armstrong();
	perfect();
	factorial();
	strong();
}
void printrange()
{
	int a=1;
	printf("Print no 1 to 10 :\n");
	while(a<=10)
	{
		printf("%d\n",a);
		a++;
	}
}
void table()
{
	int no=12;
	int i=1;
	int sum;
	printf("Print the table:\n");
	while(i<=10)
	{
		sum=no*i;
		printf("%d\n",sum);
		i++;
	}
}
void sum()
{
	int a=1,b=10,sum=0;
    printf("sum of numbers:\n");
    while (a <= b) 
	{
        sum = sum + a;
        printf("%d\n", sum);
          a++;     
    }
}
void prime()
{
	int number=10; 
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
        printf("%d is a prime number.\n", number);
    else 
        printf("%d is not a prime number.\n", number);
}
void armstrong()
{
	int num = 153;
    int result = (1*1*1) + (5*5*5) + (3*3*3);

    if (result == num)
        printf("%d is an Armstrong number.\n", num);
    else
        printf("%d is not an Armstrong number.\n", num);
}
void perfect()
{
	int num, i = 1, sum = 0;
    printf("Enter a number: ");
    scanf("%d", &num);

    while (i < num) 
	{
        if (num % i == 0) 
            sum=sum+i;
        i++;
    }
    if (sum == num)
        printf("%d is a perfect number.\n", num);
	else 
        printf("%d is not a perfect number.\n", num);
}
void factorial()
{
	int num=5;
    int factorial=1;
	int i=num;
    while(i>1) 
	{
        factorial=factorial*i;
        i--;
    }

    printf("Factorial of %d = %d\n", num, factorial);
}
void strong()
{
	int num = 370;
    int sum = 0, temp = num;
    int factorial[10] = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

    sum = sum + factorial[temp % 10];
    temp = temp / 10;

    if (sum == num) {
        printf("%d is a Strong number!\n", num);
    } else {
        printf("%d is not a Strong number.\n", num);
    }
}
