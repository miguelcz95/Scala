class SetsInmutables {
  def SetsInmutables(opcion: Int): Unit = {
    //Son inmutables por lo que cada operacion nos devuelve un nuevo set
    val set = Set(1, 2, 3, 4)
    //Se puede concatenar otro set
    set ++ Set(5, 6, 7)
    //Se puede agregar un valor
    set + 9


  }

}
