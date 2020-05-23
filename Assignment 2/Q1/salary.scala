object Salary extends App{
  def normal(t:Int):Double=t*150.0;
  def ot(t:Int):Double=t*75.0;
  def sal(normT:Int, overT:Int):Double=(normal(normT)+ot(overT));
  def finalSal(normT:Int, overT:Int, tax:Double):Double=(1-tax)*sal(normT, overT);

  printf("Salary after deducting Tax: %.2f\n", finalSal(40, 20, 0.1));
}
