

This repository has a single subproject named docs, it has all the
machinery of the [cats](https://github.com/non/cats) project, but
stripped of all content except for a few demo files that you can
immediately start playing with.

To get started playing right away, clone this repository, then start
reading
[here](https://github.com/stew/indoctrinate/blob/master/docs/src/site/index.md)
or read the [generated documentation site](http://stew.github.io/indoctrinate/)

If you want to incorporate this into your project, you can perhaps
copy the docs directory from this project into your own project and
define docs to be a subproject of your build, then start editing the
files inside docs/src to customize your site.

We are relying on 4 different sbt plugins for documentation:

## [tut](https://github.com/tpolecat/tut)

Tut gives us the ability to "compile" our documentation against code
in the other sub-projects.  Code in "tut sheds" like this:

    ```tut
    println("hello world")
    List(1,2,3).sum
    ```

Tut compiles all the documentation, replacing the tut sheds with
scala sheds that shows running the original context in a repl
session:
 
    ```scala
    scala> println("hello world")
    hello world

    scala> List(1,2,3).sum
    res1: Int = 6
    ```

Tut uses `.md` files in `docs/src/main/tut` as its source, and outputs
compiled .md files to `docs/target/site/tut`

## [sbt-unidoc](https://github.com/sbt/sbt-unidoc)

This is useful when your project has multiple sub-projects and you
want to generate one scaladoc site covering all of them.

## [sbt-site](https://github.com/sbt/sbt-site)

sbt-site takes the contents of a static directory, the output of tut,
and the output of scaladoc, and populates `docs/target/site`

you generate the site by running `sbt docs/makeSite`

## [sbt-ghpages](https://github.com/sbt/sbt-ghpages)

After you have tested your pages and you are ready to push them to
github you run `sbt docs/ghpagesPushSite` to push this generated site
to a remote repo in a `gh-pages` branch. To control which repository
it is pushing to, you must edit the build variable in `docs/build.sbt`: 

    git.remoteRepo := "git@github.com:notyours/pony.git"



