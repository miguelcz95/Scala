import scala.collection.mutable

class EstructuraMapas {

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

}
