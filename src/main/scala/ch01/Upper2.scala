package ch01

object Upper2 {
  def main(args: Array[String]): Unit = {
    val result = args.map(_.toUpperCase).mkString("[",",","]")
    println(result)
  }
}
