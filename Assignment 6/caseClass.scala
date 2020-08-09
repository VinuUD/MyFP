object caseClass extends App {

  case class Point(a: Int, b: Int) {
    def x: Int = a
    def y: Int = b

    def +(p: Point) = new Point(this.x + p.x, this.y + p.y)

    def move(dx: Int, dy: Int) = Point(this.x + dx, this.y + dy)

    def distance(p: Point): Double = {
      (Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2)))
    }

    def invert() = new Point(this.y, this.x)
  }

  val p1 = Point(1, 1)
  val p2 = Point(4, 5)

  println(p1)
  println(p2)
  println()
  
// Add function demo
  println("Add (+)")
  var p3 = p1 + p2
  println(p3)
  println()
  
// Move function demo
  println("p3 before moving : " + p3)
  p3 = p3.move(10, 10)
  println("p3 after moving : " + p3)
  println()
  
// Distance function demo
  println("Distance between " + p1 + " and " + p2 + " is " + p1.distance(p2))
  println()
  
// Invert function demo
  print(p3)
  print(" after inverting ")
  p3 = p3.invert()
  println(p3)
}
