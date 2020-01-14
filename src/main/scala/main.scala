import scala.collection.mutable

object main {


  def main(args: Array[String]): Unit = {
    val opcion = 1
    //println(Condicionales(opcion).capitalize)
    //Bucles(opcion)
    //Collections(opcion)
    //Mapas(opcion)
    //SetsInmutables(opcion)
    //SetsMutables(opcion)
    //MapasEstructura()
    ForEachFor(opcion)
  }

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

  def MapasEstructura(): Unit = {
    val mapa = Map(1 -> ("Luis"), 2 -> ("Miguel"), 3 -> ("Mariana"))
    println("valores del mapa: " + mapa.values)
    println("valores con get: " + mapa.get(3))
    //devuelve un none cuando no esta el identifcador
    println("valores con get: " + mapa.map(x =>
      //Revisar
      if (x.eq("Luis")) {
        "Luis2"
      } else {
        "nada"
      }))

    mapa ++ Map(5 -> "prueba", 6 -> "prueba2")

    //Mapa Mutable
    val mapaMutable = mutable.Map(1 -> "123", 2 -> "321", 3 -> "456")
    mapaMutable += (5 -> "789")
    mapaMutable ++= Map(4 -> "654")
    println("Mapa mutable: " + mapaMutable)
  }

  def SetsMutables(i: Int): Unit = {
    // import scala.collection.mutable
    val mset = mutable.Set(1, 2, 3)
    //se agrega o se inserta valor con +=
    mset += (4, 8)
    println("Set Mutable: " + mset.toString())
    //se agrega o se inserta un nuevo set con ++=
    mset ++= Set(0, 6)
    println("Set Mutable: " + mset.toString())
    //se puede quitar un elemento del conjunto con -=
    mset -= 2
    println("Set Mutable: " + mset.toString())
    //retain se utiliza para dejar solo los elementos que cumplen cierta condicion
    mset.retain(x => x % 2 == 0)
    println("Set Mutable: " + mset.toString())

    val sset = mutable.SortedSet(1, 5, 4, 6, 3, 8)
    println("Set Ordenado: " + sset)

  }

  def SetsInmutables(opcion: Int): Unit = {
    //Son inmutables por lo que cada operacion nos devuelve un nuevo set
    val set = Set(1, 2, 3, 4)
    //Se puede concatenar otro set
    set ++ Set(5, 6, 7)
    //Se puede agregar un valor
    set + 9


  }

  def Mapas(opcion: Int): Unit = {
    val numeros = List(1, 2, 3, 4, 5, 6, 7)
    //Por medio de una funcion lambda se realiza lo requerido
    println("Doble: " + numeros.map(numero => numero * 2))
    //Con _ se accede a cada uno de los valores o posiciones de la lista
    println("Cuadrado: " + numeros.map(_ / 2))

    val carros = List("bmw", "mercedez", "nissan", "toyota", "maseratti")
    println("Mayusculas:" + (carros.map(carro => carro.toUpperCase())))

    val lista = List(List(1, 2, 3), List(6, 5, 4), List(7, 8, 9))
    //Flatten: sirve para juntar los valores cuando se tienen listas o colecciones anidadas
    println("juntar valores en la coleccion anidada: " + lista.flatten)
    //FlatMap: me acepta una expresion lambda
    println("juntar valores con flatmap y multiplicados por 2:" + lista.flatMap(x => x.map(numero => numero * 2)))
  }

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

  def Condicionales(opcion: Int): String = {
    opcion match {
      case 1 => "enero"
      case 2 => "febrero"
      case 3 => "marzo"
      case 4 => "abril"
      case 5 => "mayo"
      case 6 => "junio"
      case 7 => "julio"
      case 8 => "agosto"
      case 9 => "septiembre"
      case 10 => "octubre"
      case 11 => "noviembre"
      case 12 => "diciembre"
      case _ => "No existe"
    }
  }


}
