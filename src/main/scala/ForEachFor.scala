class ForEachFor {

  def ForEachFor(opcion: Int): Unit = {
    val lenguajes = Seq("Java", "Scala", "Python", "Javascript", "Swift")
    val opiniones = Seq("Bueno", "Aburrido", "Excelente")

    lenguajes.foreach(lenguaje => println(s"${lenguaje} es un buen lenguaje de programacion"))
    //se pueden anidar varios for en uno for(l <- lenguajes; o <- opiniones)
    for (l <- lenguajes) {
      println(s"$l es un buen lenguaje, se imprime de la segunda forma")
    }

    println("Lenguajes con opiniones Forma 1")
    lenguajes.foreach(l => opiniones.foreach(o => println(s"$l opinion: $o")))

    println("Lenguajes con opiniones Forma 2")
    for (l <- lenguajes; o <- opiniones) {
      println(s"$l opinion: $o")
    }

    //for con condiciones en el ciclo
    for (l <- lenguajes if l.endsWith("a"); o <- opiniones if o.startsWith("a".toUpperCase)) {
      println(s"$l me parece $o")
    }
  }

}
