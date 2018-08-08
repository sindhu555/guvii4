#include <stdio.h>

int main(void) {
	// your code goes here
	int n,q,i=0;
	scanf("%d",&n);
	scanf("%d",&q);
	for(i=++n;i<q;i++)
	{
		if(i%2!=0)
		{
			printf("%d",i);
		}
	}
	return 0;
}
