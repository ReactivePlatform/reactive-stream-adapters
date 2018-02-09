package reactiveplatform.stream.rxjava

/**
  * @author kerr
  **/
object Test extends App {
  RStream.from(1)
    .map(i => i + 1)
    .map(i => i + 2)
    .foreach(println)
}
