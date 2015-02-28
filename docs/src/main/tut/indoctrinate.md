---
layout: default
title:  "Indoctrinate"
section: "Indoctrinate"
---
This site was generated from (indoctrinate)[https://github.com/indoctrinate/stew/]

## Tut

```
docs/src/main/tut/
```

Docs in this directory in the source code are compiled with (tut)[https://github.com/tpolecat/tut].

Tut type-checked example code makes sure that our examples stay in
sync with the rest of our source.


### Compiling the tut examples

From an sbt prompt:

    sbt> docs/makeSite

Then the directory: (/docs/target/site/tut/indoctrinate.md)[/docs/target/site/tut/indoctrinate.md]` will contain `.md` files
which were compiled by tut. In those `.md` files sections which were
written as:

        ```tut
        1 + 1
        ```

Will be rewritten as:

    ```scala
    scala> 1 + 1
    2
    ```

Like this:

```tut
1 + 1
```

Wait, did that work for you? Perhaps you need to go back to
the previous step, run `docs/makeSite` and start reading the documents
in the `docs/target/site/tut/indoctrinate.md` file.

