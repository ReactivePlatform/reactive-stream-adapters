package reactiveplatform.stream.rxjava
import io.reactivex.Flowable

import scala.annotation.unchecked.uncheckedVariance

/**
  * @author kerr
  **/
class RxJavaRStream[+Output](_flowable: Flowable[Output]) extends RStream [Output]{
  override protected val underling: Flowable[Output @uncheckedVariance] = _flowable
}
