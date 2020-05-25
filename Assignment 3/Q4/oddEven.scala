object oddEven extends App{
    def printOdd(i:Int, n:Int){
        if(i > n)
            return;

        if(i%2 == 1)
            printf("%d  ", i);

        printOdd(i+1, n);
    }

    def printEven(i:Int, n:Int){
        if(i > n)
            return;

        if(i%2 == 0)
            printf("%d  ", i);

        printEven(i+1, n);
    }
    printf("Odd numbers : ");
    printOdd(0,10);

    printf("\nEven numbers : ");
    printEven(0,10);

    printf("\n");
}