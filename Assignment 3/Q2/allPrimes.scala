object allPrimes extends App{
    def primeSeq(n:Int){
        if(n==0 || n==1)
            return;

        if(prime(n, n-1))
            printf("%d ", n);

        primeSeq(n-1);
    }

    def prime(n:Int, x:Int):Boolean={
        if(n == 0)
            return false;

        if(n == 1 || x == 1)
            return true;
        
        if(n%x == 0)
            return false;

        prime(n, x-1);
    }

    primeSeq(10);
    printf("\n");
}