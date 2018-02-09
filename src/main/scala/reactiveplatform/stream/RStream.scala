package reactiveplatform.stream

import scala.language.higherKinds

/**
  * @author kerr
  **/
trait RStream[+Output] {
  type Underling[+Out]
  type Repr[+Out] <:RStream[Out]{
    type Underling[+OO] = RStream.this.Underling[OO]
    type Repr[+OO] = RStream.this.Repr[OO]
  }

  protected def underling:Underling[Output]

  def map[T](f:Output => T):Repr[T]
  def foreach(foreach:Output => Unit):Unit
}


