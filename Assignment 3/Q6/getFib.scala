object getFib extends App{
    def fib(n:Int):Int={
        if(n==0)
            return 0;

        if(n==1)
            return 1;

        return fib(n-1)+fib(n-2);
    }

    def printFib(n:Int){
        var i:Int=0;
        printf("Fibonacci Series...\n");
        while(i < n+1){
            printf("%d  ", fib(i));
            i=i+1;
        }
        printf("\n");
    }

    printFib(0);
    printFib(1);
    printFib(10);
    printFib(15);
}