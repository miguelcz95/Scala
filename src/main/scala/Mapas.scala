class Mapas {
  def Mapas(opcion: Int): Unit = {
    val numeros = List(1, 2, 3, 4, 5, 6, 7)
    //Por medio de una funcion lambda se realiza lo requerido
    println("Doble: " + numeros.map(numero => numero * 2))
    //Con _ se accede a cada uno de los valores o posiciones de la lista
    println("Divido: " + numeros.map(_ / 2))

    val carros = List("bmw", "mercedez", "nissan", "toyota", "maseratti")
    println("Mayusculas:" + (carros.map(carro => carro.toUpperCase())))

    val lista = List(List(1, 2, 3), List(6, 5, 4), List(7, 8, 9))
    //Flatten: sirve para juntar los valores cuando se tienen listas o colecciones anidadas
    println("juntar valores en la coleccion anidada: " + lista.flatten)
    //FlatMap: me acepta una expresion lambda
    println("juntar valores con flatmap y multiplicados por 2:" + lista.flatMap(x => x.map(numero => numero * 2)))
  }
}
