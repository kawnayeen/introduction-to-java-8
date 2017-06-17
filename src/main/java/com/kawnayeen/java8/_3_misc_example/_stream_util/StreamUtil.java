package com.kawnayeen.java8._3_misc_example._stream_util;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.BiFunction;
import java.util.stream.Stream;

import static java.util.Objects.requireNonNull;
import static java.util.Spliterators.iterator;
import static java.util.Spliterators.spliterator;
import static java.util.stream.StreamSupport.stream;

/**
 * Created by kawnayeen on 2/3/17.
 */
public class StreamUtil {
    public static <A, B, C> Stream<C> zip(Stream<? extends A> a,
                                          Stream<? extends B> b,
                                          BiFunction<? super A, ? super B, ? extends C> zipper) {
        requireNonNull(zipper);
        Spliterator<? extends A> aSpliterator = requireNonNull(a).spliterator();
        Spliterator<? extends B> bSpliterator = requireNonNull(b).spliterator();

        // Zipping looses DISTINCT and SORTED characteristics
        int characteristics = aSpliterator.characteristics() & bSpliterator.characteristics() &
                ~(Spliterator.DISTINCT | Spliterator.SORTED);

        long zipSize = ((characteristics & Spliterator.SIZED) != 0)
                ? Math.min(aSpliterator.getExactSizeIfKnown(), bSpliterator.getExactSizeIfKnown())
                : -1;

        Iterator<A> aIterator = iterator(aSpliterator);
        Iterator<B> bIterator = iterator(bSpliterator);
        Iterator<C> cIterator = new Iterator<C>() {
            @Override
            public boolean hasNext() {
                return aIterator.hasNext() && bIterator.hasNext();
            }

            @Override
            public C next() {
                return zipper.apply(aIterator.next(), bIterator.next());
            }
        };

        Spliterator<C> split = spliterator(cIterator, zipSize, characteristics);
        return (a.isParallel() || b.isParallel())
                ? stream(split, true)
                : stream(split, false);
    }
}
