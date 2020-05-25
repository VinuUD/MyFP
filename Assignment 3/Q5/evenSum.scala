object evenSum extends App{
    // This function add the number to the sum if its off and subtract 1
    // This ensures that only even numbers LESS than given number are added
    // This method can be utilized because the first even number 0 does not make any changes to the sum.
    def sum(n:Int, s:Int):Int={
        if(n == 0)
            return s;

        if(n%2 == 1)
            sum(n-1, n+s-1);
        else
            sum(n-1, s);
    }
    var n:Int=11;
    printf("Sum of Even numbers less than %d : %d\n", n, sum(n, 0));
    
    n=10;
    printf("Sum of Even numbers less than %d : %d\n", n, sum(n, 0));
}