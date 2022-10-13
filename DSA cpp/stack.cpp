//Implementation of stack using array
#include<bits/stdc++.h>
using namespace std;
struct Stack{
    int top;
    int capacity;
    int *arr;
};
struct Stack* createstack(int n){
    struct Stack *stack=(struct Stack*)malloc(sizeof(struct Stack));
    stack->top=-1;
    stack->capacity=n;
    stack->arr=(int*)malloc(stack->capacity*sizeof(int));
    return stack;
}
void pop(struct Stack*stack){
    if(stack->top==-1)
    cout<<"Stack underflow"<<endl;
    else
    stack->arr[stack->top--];
}
void push(struct Stack*stack,int n){
    if(stack->top==stack->capacity-1)
   cout<<"Stack overflow"<<endl;
    else{
    stack->arr[++stack->top]=n;
    printf("added %d",n);
    printf("\n");}
}
void peek(struct Stack*stack){
    if(stack->top==-1)
    cout<<"Empty stack\n";
    else{
        cout<<stack->arr[stack->top]<<endl;
    }
}
int main(){
    struct Stack *stack=(struct Stack*)malloc(sizeof(struct Stack));
    cout<<"Enter the size of stack"<<endl;
    int n;
    cin>>n;
    stack=createstack(n);
    push(stack,1);
    push(stack,2);
    push(stack,3);
    push(stack,4);
    pop(stack);
    pop(stack);
    pop(stack);
    peek(stack);
}
 