object getSum extends App{
    def sum(x:Int, y:Int):Int={
        if(x == 0)
            return y;

        sum(x-1, x+y);
    }

    var n:Int=5;
    printf("The Sum of first %d integers is : %d\n", n, sum(n, 0));
}