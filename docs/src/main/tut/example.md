---
layout: source
title:  "Hello"
section: "example"
scaladoc: "http://localhost:4000/indoctrinate/api/#example.HelloExample"
source: "https://github.com/stew/indoctrinate/blob/master/example/src/main/scala/Example.scala"
pageSource: "https://github.com/stew/indoctrinate/blob/master/docs/src/main/tut/exampe.md"
---
# HelloExample

Because our `docs` project is declared to depend on the `exmple`
project in the main
[build.sbt](https://github.com/stew/indoctrinate/blob/master/build.sbt),
we can import classes from our example project and use them in
compiled examples:

```tut
import example._

// create an instance of HelloExample

val hello = new HelloExample {
  val someone = "there"
}

hello.hello
```

If you are browsing this page in your browser, you will notice the
three additional links at the top of the page. If you view the source
of this page you will see that this page's header has declared a
different layout: `source`, than the other pages. The
[source template](https://github.com/stew/indoctrinate/blob/master/docs/src/site/_layouts/source.html)
refers to three other page variables declared at the top of the source
for this page.
