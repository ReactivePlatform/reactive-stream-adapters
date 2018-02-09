package reactiveplatform.stream.rxjava

import io.reactivex.Flowable

import scala.annotation.unchecked.uncheckedVariance

/**
  * @author kerr
  **/
abstract class RStream[+Output] extends reactiveplatform.stream.RStream[Output]{
  override type Underling[+Out] = Flowable[Out@uncheckedVariance]
  override type Repr[+Out] = RStream[Out]
  override def map[T](f: Output => T): RStream[T] = {
    new RxJavaRStream[T](underling.map((t: Output) => f.apply(t)))
  }

  override def foreach(foreach: Output => Unit): Unit = {
    underling.forEach((t: Output) => foreach(t))
  }
}

object RStream{
  def from[T](t: T):RStream[T] = {
    new RxJavaRStream[T](Flowable.just(t))
  }
}