
#include<stdio.h>
int main()
{
	int m1,m2,m3,total;
	float per;
	printf("enter 3 subject marks");
	scanf("%d%d%d",&m1,&m2,&m3);
	total=m1+m2+m3;
	printf("/n total=%d",total);
	per=(float)(total/300.0f)*100.0f;
	printf("/n percetage=%f",per);
	
}
