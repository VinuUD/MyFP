object totalCost extends App{
  def basicCost(n:Int, x:Double, y:Double):Double=x*n*y;
  def shipCost(n:Int, t:Int, x:Double, y:Double):Double=t*x+(n-t)*y;

  def totalCost(n:Int, p1:Double, disc:Double, t:Int, p2:Double, p3:Double)=(basicCost(n,p1,disc)+shipCost(n,t,p2,p3));

  println(totalCost(60, 24.95, 0.40, 50, 3, 0.75));
}
