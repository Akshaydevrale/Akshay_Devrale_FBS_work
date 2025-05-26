#include<stdio.h>
#include<string.h>
typedef struct time
{
	int hour;
	int min;
	int sec;
}time;
void main()
{
	time t1;
	
	printf("Hour :");
	scanf("%d",&t1.hour);
	printf("Min :");
	scanf("%d",&t1.min);
	printf("Sec :");
	scanf("%d",&t1.sec);
	
	printf("Hour :%d Min :%d Sec :%d",t1.hour,t1.min,t1.sec);
}
