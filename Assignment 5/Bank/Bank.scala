object Bank extends App{
    
    var bank=List[Account]()
    var i:Int = 1
    while(i < 11){
        var acc = new Account(("nic"+i).toString,i,100*i)
        bank=bank:+acc
        i=i+1
    }
// Original Balance
    println("Original Balance : ")
    println("    "+bank)

// After Withdrawal
    bank.map(x=>x.withdraw(300.0))
    println("After Withdrawal of 300.00 : ")
    println("    "+bank)

// Over Draft accounts
    val ODbalance = bank.filter(x=>x.balance<0)
    println("Over Draft Accounts : ")
    println("    "+ODbalance)

// Sum of all balances
    var TotalBalance  = bank.map(x=>x.balance).reduce((x,y) => x+y)
    println("Total Balance = " + TotalBalance)

// Before interest
    println("Before Interest = ")
    println("    "+bank)
// After interest
    bank.map(x=> if(x.balance>0) x.balance=x.balance*1.05 else x.balance=x.balance*1.1)
    println("After Interest = ")
    println("    "+bank)
}


class Account(id:String, n:Int, b:Double){
    val nic:String = id
    val accNum:Int = n
    var balance:Double = b

    override def toString= "["+nic+":"+accNum+":"+balance+"]"
    
    def withdraw(a:Double){
        this.balance=this.balance-a
    }

    def deposit(a:Double){
        this.balance=this.balance+a
    }

    def transfer(a:Account, b:Double){
        this.withdraw(b)
        a.deposit(b)
    }
}
