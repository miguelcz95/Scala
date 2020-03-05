trait Traits {
  def sonido: String
}

trait Buho extends Traits {
  override def sonido: String = "Uh Uh Uh Uh"
}

trait Loro extends Traits {
  override def sonido: String = "Soy el Loro"
}

class Mutante extends Loro with Buho {
  val mutante = new Mutante()
  println(mutante.sonido)
}
