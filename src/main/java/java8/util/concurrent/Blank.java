/*
 * Written by Stefan Zobel and released to the
 * public domain, as explained at
 * http://creativecommons.org/publicdomain/zero/1.0/
 */
package java8.util.concurrent;

/**
 * A mock class for the {@code FJPool.MemBar} emulation of the
 * {@code sun.misc.Unsafe fence()} methods
 */
final class Blank {

    @SuppressWarnings("unused")
    private volatile int v;

    Blank() {
    }
}
