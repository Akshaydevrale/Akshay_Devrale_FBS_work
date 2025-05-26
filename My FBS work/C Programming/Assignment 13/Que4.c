#include<stdio.h>
#include<string.h>
typedef struct HR
{
	int id;
	char name[10];
	int salary;
	int commission;
	
}HR;
void main()
{
	HR s1;
	
	s1.id=23;
	strcpy(s1.name,"Akshay");
	s1.salary=236337;
	s1.commission=500;
	
	printf("\nid=%d name=%s salary=%d commission=%d",s1.id,s1.name,s1.salary,s1.commission);
	
}
