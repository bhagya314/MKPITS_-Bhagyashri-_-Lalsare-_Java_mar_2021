//wap to accept empno empname and basic_salary then calculate hra (15% of basic salary) , da (25%
//of basic) , ta (55% of basic) , total salary(basic_Salary + hra + da+ ta)

#include<stdio.h>
int main()
{
	int empno;
	char empname[20]; //creating a character array of 20 elements
	float basic_salary,hra,da,ta,total_salary=0;
	//code to accept input from the user
	printf("enter employee number");
	scanf("%d",&empno);
	printf("enter employee name");
	scanf("%s",&empname);
	printf("enter basic salary");
	scanf("%f",&basic_salary);
	
	//processing the input to calculate hra,da ,ta and total salary
	hra = basic_salary * 0.15f;
	da =basic_salary * 0.25f;
	ta = basic_salary * 0.55f;
	total_salary = hra + da + ta +basic_salary;
	
	// printing the output
	printf("------------------------------------------------------------------------------------");
	printf("\n Empno \t Empname \t basic salary \t hra \t\t da \t\t ta \t total salary");
	printf("\n------------------------------------------------------------------------------------");
	printf("\n %d \t %s \t\t %.2f \t %.2f \t %.2f \t %.2f \t%.2f",empno,empname,basic_salary,hra,da,ta,total_salary);
	printf("\n------------------------------------------------------------------------------------");
	return 0;
}
