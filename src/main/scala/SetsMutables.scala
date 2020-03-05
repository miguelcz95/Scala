import scala.collection.mutable

class SetsMutables {


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

}
