import org.scalacheck._

case class SampleObject(foo: Int, baz: String)

object SampleObject {
  def genSampleObject(genFoo: Gen[Int] = Gen.posNum, genBaz: Gen[String] = Gen.alphaUpperStr): Gen[SampleObject] =
    for {
      foo <- genFoo
      baz <- genBaz
    } yield SampleObject(foo, baz)
}
