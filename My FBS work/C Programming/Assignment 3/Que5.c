//Check number is armstrong or not
#include <stdio.h>
#include <math.h>
int main() 
{
    int i, num, rem, sum=0, count=0, temp;
    printf("Enter a number: ");
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
        printf("%d is an Armstrong number.\n", num);
    else
        printf("%d is not an Armstrong number.\n", num);

}


