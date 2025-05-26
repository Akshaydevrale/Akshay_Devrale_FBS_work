#include<stdio.h>
#include<string.h>
typedef struct time
{
	int hour;
	int min;
	int sec;
}time;
time store(time);
void display(time);
void main()
{
	time t1;
	t1=store(t1);
	display(t1);
	
}
time store(time t)
{
	printf("Enter hour : ");
	scanf("%d",&t.hour);
	printf("Enter min :");
	scanf("%d",&t.min);
	printf("Enter sec :");
	scanf("%d",&t.sec);
	return t;
}
void display(time t)
{
	printf("Hour :%d Min :%d Sec :%d",t.hour,t.min,t.sec);

}
