#include<stdio.h>
#include<string.h>
typedef struct Student
{
	int rollno;
	char name[10];
	int salary;
	
}Student;
Student store(Student);
void display(Student);
void main()
{
	Student s1;
	s1=store(s1);
	display(s1);
}
Student store(Student s)
{
	printf("Enter Roll no: ");
	scanf("%d",&s.rollno);
	printf("Enter the name :");
	scanf("%s",&s.name);
	printf("Enter the salary :");
	scanf("%d",&s.salary);
	return s;
}
void display(Student s)
{
	printf(" Id :%d",s.rollno);
	printf(" Name :%s",s.name);
	printf(" Salary :%d",s.salary);
}
