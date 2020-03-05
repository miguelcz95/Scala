class Bucles {

  def Bucles(opcion: Int): Unit = {
    var aux = opcion
    println("While")
    while (aux < 12) {
      println("Aux vale : " + aux)
      //Interpolacion
      println(s"Aux vale interpolada: ${aux}")
      aux = aux + 1
    }

    println("Do While")
    do {
      println("Aux vale : " + aux)
      //Interpolacion
      println(s"Aux vale interpolada: ${aux}")
      aux = aux - 1
    }
    while (aux > 1)
  }

}
