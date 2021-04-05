//-declaing two structure variables
//wap to accept rollno, studentname, marks of 5 subject(in an array)
//then display total,per,grade.

#include<stdio.h>
#include<conio.h>
#include<string.h>

int main()
{
	struct employee
	{
		char name[10];
		
		char gender;
		int age;
	} emp1,emp2;
	
	//for emp1
	strcpy(emp1.name,"ravi");
	emp1.gender='m';
	emp1.age=22;
	printf("\n name =%s",emp1.name);
	printf("\n gender=%c",emp1.gender);
	printf("\n age=%d",emp1.age);
	
	//for emp2
	strcpy(emp2.name,"durga");
	emp2.gender='f';
	emp2.age=20;
	printf("\n name =%s",emp2.name);
	printf("\n gender=%c",emp2.gender);
	printf("\n age=%d",emp2.age);

}

