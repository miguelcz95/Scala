

object main {

  val operadores = List("+", "-", "*", "/")
  var aux1 = 0
  var aux2 = 0

  def main(args: Array[String]): Unit = {
    //val opcion = 1
    //var cond = new Condicionales
    //println(cond.Condicionales(opcion).capitalize)
    //var funOrSup = new FuncionesOrdenSuperior
    //funOrSup.sortList(List(Point(3, 2), Point(1, 0), Point(-1, 5)), funOrSup.sortInx)
    //Bucles(opcion)
    //Collections(opcion)
    //Mapas(opcion)
    //SetsInmutables(opcion)
    //SetsMutables(opcion)
    //MapasEstructura()
    //ForEachFor(opcion)

    val set1 = List(8, 4, 6)
    val set2 = List(6, 7, 4)

    do {
      aux1 = izquierda(set1)
      aux2 = derecha(set2)
      println("izquierda = " + aux1)
      println("derecha = " + aux2)
    } while (aux1 != aux2)


  }

  def izquierda(set1: List[Int]): Int = {
    var aux = 0
    println("Izquierda")
    operadores.foreach {
      case "+" =>
        println("Operador " + operadores.head)
        aux = aux + (set1.head + set1(1))
      case "-" =>
        println("Operador " + operadores(1))
        aux = aux + (set1.head - set1(1))
      case "*" =>
        println("Operador " + operadores(2))
        aux = aux + (set1.head * set1(1))
      case "/" =>
        println("Operador " + operadores(3))
        aux = aux + (set1.head / set1(1))
    }

    operadores.foreach {
      case "+" =>
        println("Operador " + operadores.head)
        aux = aux + (set1(1) + set1(2))
      case "-" =>
        println("Operador " + operadores(1))
        aux = aux + (set1(1) - set1(2))
      case "*" =>
        println("Operador " + operadores(1))
        aux = aux + (set1(1) * set1(2))
      case "/" =>
        println("Operador " + operadores(1))
        aux = aux + (set1(1) / set1(2))
    }
    aux
  }

  /** for (j <- operadores.length) {
   * println("operador: " + operadores(j));
   * operadores(j) match {
   * case "+" => aux = aux + (set1.head + set1(1))
   * case "-" => aux = aux + (set1.head - set1(1))
   * case "*" => aux = aux + (set1.head * set1(1))
   * case "/" => aux = aux + (set1.head / set1(1))
   * }
   * }

  for (i <- operadores) {
   * println("operador: " + operadores(i.toInt))
   * operadores(i.toInt) match {
   * case "+" => aux = aux + (set1(1) + set1(2))
   * case "-" => aux = aux + (set1(1) - set1(2))
   * case "*" => aux = aux + (set1(1) * set1(2))
   * case "/" => aux = aux + (set1(1) / set1(2))
   * }
   * }
   * aux } */


  def derecha(set2: List[Int]): Int = {
    var aux = 0
    println("derecha")
    operadores.foreach {
      case "+" =>
        println("Operador " + operadores.head)
        aux = aux + (set2.head + set2(1))
      case "-" =>
        println("Operador " + operadores(1))
        aux = aux + (set2.head - set2(1))
      case "*" =>
        println("Operador " + operadores(2))
        aux = aux + (set2.head * set2(1))
      case "/" =>
        println("Operador " + operadores(3))
        aux = aux + (set2.head / set2(1))
    }

    operadores.foreach {
      case "+" =>
        println("Operador " + operadores.head)
        aux = aux + (set2(1) + set2(2))
      case "-" =>
        println("Operador " + operadores(1))
        aux = aux + (set2(1) - set2(2))
      case "*" =>
        println("Operador " + operadores(1))
        aux = aux + (set2(1) * set2(2))
      case "/" =>
        println("Operador " + operadores(1))
        aux = aux + (set2(1) / set2(2))
    }
    aux
  }

}
