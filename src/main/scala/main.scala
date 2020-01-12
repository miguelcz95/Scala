object main {


  def main(args: Array[String]): Unit = {
    val opcion = 58783
    print(Condicionales(opcion).capitalize)
    Bucles(opcion)
  }

  def Bucles(opcion: Int): Unit = {

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
