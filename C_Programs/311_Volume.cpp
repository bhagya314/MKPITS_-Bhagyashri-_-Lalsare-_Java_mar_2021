#include<stdio.h>
int main()
{
	int length,breath,height;
	int volume;
	printf("enter length");
	scanf("%d",&length);
	printf("enter breath");
	scanf("%d",&breath);
	printf("enter height");
	scanf("%d",&height);
	volume=length*breath*height;
	printf("volume=%d",volume);
}
