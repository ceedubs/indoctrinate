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
hello: example.HelloExample = $anon$1@729084db

scala> hello.hello
hello: there
```

If you are browsing this page in your browser, you will notice the
three additional links at the top of the page. If you view the source
of this page you will see that this page's header has declared a
different layout: `source`, than the other pages. The
[source template](https://github.com/stew/indoctrinate/blob/master/docs/src/site/_layouts/source.html)
refers to three other page variables declared at the top of the source
for this page.
