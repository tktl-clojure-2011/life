Game of Life
============

This repository contains the stub project for the exercises in the chapter
[The Player of Games](https://wiki.helsinki.fi/display/clojure2011/The+Player+of+Games).

Running tests
-------------

The unit tests can be run in two ways:

*   Run the tests automatically whenever you save a file:

        java -cp "src:test:classes:lib/*" lazytest.watch src test

    or on Windows:

        java -cp "src;test;classes;lib/*" lazytest.watch src test

*   Run the tests once:

        java -cp "src:test:classes:lib/*" lazytest.main src test

    or on Windows:

        main -cp "src;test;classes;lib/*" lazytest.main src test

