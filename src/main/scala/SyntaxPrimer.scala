// Value object
case class Foo(bar: String)

// place for holding functions related to the class Foo
object Foo {
  // function definition, def <name>(<argument name>: <argument type>): <return type> = <body>
  def baz(foo: Foo): String = foo.bar
  // default argument value
  def defaultArgument(default: Int = 0): String = ???
}

// Generic class take a type parameter T and a method returning that type
class GenericClass[T] {
  def bazzle: T = ???
}
