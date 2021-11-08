[![Total alerts](https://img.shields.io/lgtm/alerts/g/stefan-zobel/minifuture.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/stefan-zobel/minifuture/alerts/)
[![Language grade: Java](https://img.shields.io/lgtm/grade/java/g/stefan-zobel/minifuture.svg?logo=lgtm&logoWidth=18)](https://lgtm.com/projects/g/stefan-zobel/minifuture/context:java)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/net.sourceforge.streamsupport/streamsupport-minifuture/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.sourceforge.streamsupport/streamsupport-minifuture)
[![javadoc.io](https://javadoc.io/badge2/net.sourceforge.streamsupport/streamsupport-minifuture/javadoc.svg)](https://javadoc.io/doc/net.sourceforge.streamsupport/streamsupport-minifuture)

# minifuture

A stripped to the bones `CompletableFuture` backport for Java 6+ and Android (API level 14+).

This is a minimized (105 KiB) version of the [streamsupport-cfuture](https://javadoc.io/doc/net.sourceforge.streamsupport/streamsupport-cfuture/latest/index.html) component without any dependencies that provides only CompletableFuture and the API necessary to use it and nothing else (no Streams, no ForkJoinPool and such). It is intended for projects that only have a need for a CompletableFuture backport and want minimal dependency footprint. The public API surface comprises the following interfaces / classes:       

* java8.util.concurrent.CompletableFuture
* java8.util.concurrent.CompletionException
* java8.util.concurrent.CompletionStage
* java8.util.function.BiConsumer
* java8.util.function.BiFunction
* java8.util.function.Consumer
* java8.util.function.Function
* java8.util.function.Supplier

The CompletableFuture API is the one from Java 12, i.e. it contains the Java 9 ([JEP 266](https://openjdk.java.net/jeps/266)) enhancements and the exception handling methods introduced in Java 12 ([JDK-8211010](https://bugs.openjdk.java.net/browse/JDK-8211010)). The project can be compiled with Java 6 and should be compatible with any OpenJDK based JVM and Android versions starting from API level 14. 


### build.gradle:

```gradle
dependencies {
    implementation 'net.sourceforge.streamsupport:streamsupport-minifuture:1.7.4'
}
```


### Maven:

```xml
<dependency>
    <groupId>net.sourceforge.streamsupport</groupId>
    <artifactId>streamsupport-minifuture</artifactId>
    <version>1.7.4</version>
</dependency>
```


## LICENSE

GNU General Public License, version 2, [with the Classpath Exception](https://github.com/stefan-zobel/minifuture/blob/master/GPL_ClasspathException)  (and [CC0 1.0](https://creativecommons.org/publicdomain/zero/1.0/) for JSR-166 derived code)
