//Calculate sum of numbers in the given range.
#include <stdio.h>
int main() 
{
    int a=1,b=10,sum=0;
    while (a<=b) 
	{
        sum=sum+a;
        a++;     
    }
    printf("Sum of numbers from 1 to 10: %d\n", sum);
    
}

