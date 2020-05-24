object bestTicket extends App{
  def maxPrice(n:Int, price:Double, dPrice:Double, dN:Int):Double={
    var change:Int=n/dN;
    return price+change*dPrice;
  }
  
  def income(n:Int, price:Double):Double=n*price;
  def cost(n:Int):Double=500+3*n;
  def profit(n:Int, price:Double):Double=income(n, price)-cost(n);
  
  def perRupee(dN:Int, dPrice:Double):Int=(dN/dPrice).toInt;

  def bestTicket(num:Int, pr:Double, perRupee:Int, bP:Double):Double={
    var n = num;
    var price = pr;
    var bestPrice = bP;
    var maxProfit:Double = -500;
    var p:Double = 0;

    while(price>0){
      n=n+perRupee;
      price=price - 1.0;
      p=profit(n, price);
      if(p>maxProfit){
        bestPrice=price;
        maxProfit=p;
      }
    }
    return bestPrice;
  }
  
  var max:Double=maxPrice(120, 15, 5, 20);
  var per:Int=perRupee(20, 5.0);
  printf("\nBest Ticket Price : %.2f\n", bestTicket(0, max, per, max));

  
}
