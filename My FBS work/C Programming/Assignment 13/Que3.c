#include<stdio.h>
#include<string.h>
typedef struct Admin
{
	int id;
	char name[10];
	int salary;
	int allowance;
	
}Admin;
void main()
{
	Admin s1;
	
	s1.id=101;
	strcpy(s1.name,"Akshay");
	s1.salary=3248334;
	s1.allowance=5500;
	
	printf("\nid=%d name=%s salary=%d allowance=%d",s1.id,s1.name,s1.salary,s1.allowance);
	
}
