//8 create a structure employee having members empno,empname,basicsalary, hra,da,ta,bonus, total salary.
// calculate hra 25% of basic
// da 35% of basic
// ta 85% of basic
// bonus =52% of basic
// totalsalary =hra+da+ta+bonus +basic.

#include<stdio.h>
#include<string.h>

struct employee
{
   char name[20];
   int no,bsal;
} emp1;

int main()
{
    printf("enter employee no,\n");
    scanf("%d",&emp1.no);
    printf("Enter name\n");
    scanf("%s",&emp1.name);
    printf("Enter basic salary\n");
    scanf("%d",&emp1.bsal);

    float hra = emp1.bsal*0.25f;
    float da = emp1.bsal*0.35f;
    float ta =emp1.bsal*0.85f;
    float bonus=emp1.bsal*0.52f;
    float total =emp1.bsal+hra+da+ta+bonus;
    
	printf("employee no =%d\n",emp1.no);
	printf("employee name =%s\n",emp1.name);
	printf("basic salary =%d\n",emp1.bsal);
	printf("Total salary =%.2f\n",total);

     return 0;
}
