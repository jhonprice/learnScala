package ch01.shape


case class Point(x :Double = 0.0, y: Double =0.0)

abstract class Shapes {
  def draw(f:String=>Unit) = f(s"draw:${this.toString}")
}

case class Circle(center :Point,r : Double) extends Shapes

case class Rectangle(lowerleft :Point,heigth:Double,width:Double)

case class Triangle(a:Point,b:Point,c:Point) extends Shapes


