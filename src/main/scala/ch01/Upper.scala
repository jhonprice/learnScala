package ch01




object Upper {
  def main(args: Array[String]): Unit = {
    args.map(_.toUpperCase).foreach(println)
  }
}