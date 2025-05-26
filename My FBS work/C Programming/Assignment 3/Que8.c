//check number is strong or not
#include <stdio.h>
int main() 
{
    int num=145,sum=0,temp=num;

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
        printf("%d is a Strong number!\n", num);
    else 
        printf("%d is not a Strong number.\n", num);
}

