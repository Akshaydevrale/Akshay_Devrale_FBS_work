//Check number is prime or not
#include <stdio.h>
int main() 
{
    int number=11; 
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
    return 0;
}

