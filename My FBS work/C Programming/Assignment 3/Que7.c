//find factorial of number
#include <stdio.h>
int main() 
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
    return 0;
}

