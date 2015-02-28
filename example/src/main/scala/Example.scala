package example

trait HelloExample {

  /**
   * an abstract someone to send a greeting to
   */
  val someone: String

  /**
   * The hello function says hello to [[someone]]
   */
  def hello: Unit = println("hello: " + someone)
}
