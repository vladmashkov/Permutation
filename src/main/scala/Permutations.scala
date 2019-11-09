object Main extends App{
  val permutation = (n: Int) => (1 to n).permutations.toList
  println(permutation(scala.io.StdIn.readInt()))
}