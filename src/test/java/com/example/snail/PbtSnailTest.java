package com.example.snail;

import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.constraints.CharRange;
import net.jqwik.api.constraints.IntRange;

import java.util.Iterator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class PbtSnailTest {

    @Property
    public void snailTraversalShouldBeIncreasingSequence(@ForAll @CharRange(from = '1', to = '9') char n) {
        int[][] array = new Snail(n).compute();
        Iterator<Integer> iterator = new SnailIterator(array);
        Integer next = iterator.next();
        while (iterator.hasNext()) {
            Integer previous = next;
            next = iterator.next();
            assertThat("Array traversal should be an increasing sequence.", next, greaterThan(previous));
        }
        assertThat("Last element should be n²", next, equalTo(n * n));
    }

}
