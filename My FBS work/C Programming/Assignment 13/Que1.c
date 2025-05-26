#include<stdio.h>
#include<string.h>
typedef struct Student
{
	int rollno;
	char name[10];
	int marks;
}Student;
void main()
{
	Student s1,s2;
	
	s1.rollno=101;
	strcpy(s1.name,"Akshay");
	s1.marks=88;
	
	printf("\nRollno=%d name=%s marks=%d",s1.rollno,s1.name,s1.marks);
	
}
