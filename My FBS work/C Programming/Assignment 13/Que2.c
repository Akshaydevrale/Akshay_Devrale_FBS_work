#include<stdio.h>
#include<string.h>
typedef struct Employee
{
	int id;
	char name[10];
	int salary;
}Employee;
void main()
{
	Employee s1;
	
	s1.id=101;
	strcpy(s1.name,"Akshay");
	s1.salary=3248334;
	
	printf("\nid=%d name=%s salary=%d",s1.id,s1.name,s1.salary);
	
}
