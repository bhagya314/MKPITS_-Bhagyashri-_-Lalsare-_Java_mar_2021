//WAP TO ACCEPT A CHARACTER FROM THE USER AND PRINT WHETHER IT IS VOWEL OR NOT.
//USING SWITCH CASE.

#include<stdio.h>
int main()
{
	char ch;
	printf("enter any character");
	scanf("%c",&ch);
	switch(ch)
	{
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
		printf("\n it is vowel");
		break;
		default:
		printf("\n not a vowel");
				
	}
}
