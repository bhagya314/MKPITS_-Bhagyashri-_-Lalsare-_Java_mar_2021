//wap to accept 5 subject marks from the user and calculate total using while loop.
#include<stdio.h>
int main()
{
	int subject;
	int total=0;
	int cnt;
	while(cnt<=5)
	{
		printf("enter %d subject marks",cnt);
		scanf("%d",&subject);
		total=total+subject;
		cnt++;
		
	}
	printf("\n total marks of 5 subjects=%d",total);
}
