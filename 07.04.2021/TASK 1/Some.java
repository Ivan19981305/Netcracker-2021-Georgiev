package ivge;

import java.util.*;

public enum Some {
    QUEUE(new PriorityQueue<Element>()),
    DEQUE(new ArrayDeque<Element>()),
    LIST(new ArrayList<Element>()),
    SET(new HashSet<Element>()),
    STACK(new Stack<Element>());

    private Collection collection;

    Some(Collection collection) {
        this.collection = collection;
    }
}
