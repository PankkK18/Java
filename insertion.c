#include<stdio.h>
int main()
{
int n, i ,j,temp;
printf("Enter elements");
scanf("%d",&i,&j,&temp);

for(i=0;i<n;i++)
{
temp = a[i];
j = i-1;
 
while(j>0 && a[i]>temp)
{
a[j+1] = a[j];
j--;

}
a[j+1] = temp;
}
return 0;
}
