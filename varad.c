#include<stdio.h>
#include<string.h>
int top=-1;
int i;
int size=10;
int l;
char a[10];
char STK[10];
int full()
{
    if(top==(size-1))
    return 1;
    else
    return 0;
}
int empty()
{
    if(top==-1)
    return 1;
    else 
    return 0;
}
void push()
{
    if(full())
    printf("Stack is full\n");
    else
    {
        for(i=0;i<l;i++)
        {
        top++;
        STK[top]=a[i];
        }
    }
}
int pop()
{
    if(empty())
    printf("Stack is empty\n");
    else
    {
        for(i=0;i<l;i++)
        {
        a[i]=STK[top];
        top--;
        printf("%c\n",a[i]);
        }
    }
}
int main()
{
    printf("Enter your String\n");
    scanf("%s",a);
    l=strlen(a);
        push();
        pop();
    return 0;
}