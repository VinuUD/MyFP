object oddEven extends App{
    def checkOddEven (n:Int):String={
        if (n == 0) "Even";
        if (n == 1) "Odd";
        checkOddEven(n-2);
    }

    printf("%d : %s\n", 15, checkOddEven(15));
    printf("%d : %s\n", 14, checkOddEven(14));
}