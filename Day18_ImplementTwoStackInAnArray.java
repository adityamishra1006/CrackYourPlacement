class twoStacks {
   int[] arr;
    int top1,top2;
    twoStacks() {
        arr=new int[100];
        top1=0;top2=99;
    }

    
    void push1(int x) {
        arr[top1++]=x;
    }

    
    void push2(int x) {
        arr[top2--]=x;
    }

    
    int pop1() {
        if(top1==0)    return -1;
        return arr[--top1];
    }

    
    int pop2() {
        if(top2==99)   return -1;
        return arr[++top2];
    }
}
