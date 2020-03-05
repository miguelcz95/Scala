class FuncionesOrdenSuperior {
  def sortList(list: List[Point], f: (Point, Point) => Boolean) = {}

  //Se infiere que retorna un boolean, asi lo interpreta scala
  def sortInx(p1: Point, p2: Point) = p1.x > p2.x

}
