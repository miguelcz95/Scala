class Collections {

  def Collections(option: Int): Unit = {
    /* Inmutables - Mutables */
    /*  Traversable
    *         |
    *       Iterable
    * -------------------------
    * Set     Map     Seq
    *                  |
    *             -------------------
    *               IndexedSeq      LinearSeq  */

    val frutas = Array("Manzana", "Pera", "Durazno", "Bananno")
    println("valor: ".concat(frutas(option)))
    println("Length: " + frutas.length)
    println("Esta vacio: " + frutas.isEmpty)
    println("No esta vacio: " + frutas.nonEmpty)
    println("IndexOf: " + frutas.indexOf("Pera"))
  }

  def collections2(): Unit = {
    List(1, 2, 3).filter { case num: Int => num > 2 }
    List(1, 2, 3).filter((num: Int) => num > 2)
    List(1, 2, 3).filter(_ > 2)

    List(1, 2, 3).map(_ + 1) // A todos los elementos le suma 1

    List(List(1, 2, 3), List(9, 8, 6), List(4, 5, 7)).flatten
  }
}
