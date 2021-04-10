//WAP TO ACCEPT GRADE (E OR M ) AND EXP AND  CALCULATE SALARY.

#include<stdio.h>
int main()
{
	char g;
	intrade exp;
	int salary;
	
	printf("enter grade e or m");
	scanf("%c",&grade);
	printf("enter experience 1 or 2 or 3");
	scanf("%d",&exp);
	
	switch(grade)
	{
		case'e' :
			if (exp>=2)
			salary=2000;
			else
			salary=1000;
			break;
			
		case'm'	:
			if(exp>=2)
			salary=4000;
			else
			salary=3000;
			break;
		
		default:
		printf("\ninvaild input");	
	}
	printf("\n salary=%d", salary);
}
