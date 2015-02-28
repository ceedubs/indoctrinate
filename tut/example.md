---
layout: source
title:  "Hello"
section: "example"
scaladoc: "http://stew.github.io/indoctrinate/api/#example.HelloExample"
source: "https://github.com/stew/indoctrinate/blob/master/example/src/main/scala/Example.scala"
pageSource: "https://raw.githubusercontent.com/stew/indoctrinate/master/docs/src/main/tut/example.md"
---
# HelloExample

Because our `docs` project is declared to depend on the `exmple`
project in the main
[build.sbt](https://github.com/stew/indoctrinate/blob/master/build.sbt),
we can import classes from our example project and use them in
compiled examples:

```scala
scala> import example._
import example._

scala> // create an instance of HelloExample
     | val hello = new HelloExample {
     |   val someone = "there"
     | }
hello: example.HelloExample = $anon$1@52ef517b

scala> hello.hello
hello: there
```

We can also add :silent to tell tut not to include the `scala>`
prompts and the output of the expressions:

```scala
val hello2 = new HelloExample {
  val someone = "to you as well"
}

hello2.hello
```

In this case we are just verifying that the example compiles. Notice
that I didn't have to `import example._` this time, that is because
the entire page shares the same REPL session.

We can also add :nofail to tell tut that it is okay for a snippet to
fail to compile.

```scala
scala> val hello3 = new HelloExample
<console>:11: error: trait HelloExample is abstract; cannot be instantiated
       val hello3 = new HelloExample
                    ^

scala> hello3.hello
<console>:12: error: not found: value hello3
              hello3.hello
              ^
```

Normally if you create a snippet that fails to compile, docs will not
be generated, `sbt docs/makeSite` will exit with an error, which is
good, this way you will be alerted when your documentation needs to be
updated to stay in sync with your source.

If you are browsing this page in your browser, you will notice the
three additional links at the top of the page. If you view the source
of this page you will see that this page's header has declared a
different layout: `source`, than the other pages. The
[source template](https://github.com/stew/indoctrinate/blob/master/docs/src/site/_layouts/source.html)
refers to three other page variables declared at the top of the source
for this page.
