class Upper{
  def func(strings :String*):Seq[String] = {
    strings.map(_.toUpperCase)
  }
}


val upper = new Upper
val result = upper.func("Hello","World")
print(result)
