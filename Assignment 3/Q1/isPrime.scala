object isPrime extends App{
    def prime(n:Int, x:Int):Boolean={
        if(n == 0)
            return false;

        if(n == 1 || x == 1)
            return true;
        
        if(n%x == 0)
            return false;

        prime(n, x-1);
    }

    printf("%b\n", prime(8, 7));
}