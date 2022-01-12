# quarkus-npe-test
Repo to reproduce a NPE when using Quarkus native

Used to reproduce https://github.com/quarkusio/quarkus/issues/22822

Root bug tracked and fixed by https://github.com/quarkusio/quarkus/issues/22822

Workaround: add `-H:+ParseOnce` to the native build options.
