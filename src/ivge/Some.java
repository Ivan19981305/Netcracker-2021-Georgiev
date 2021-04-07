package ivge;

import java.util.*;

public enum Some {
    QUEUE(new PriorityQueue<>()),
    DEQUE(new ArrayDeque<>()),
    LIST(new ArrayList<>()),
    SET(new HashSet<>());

    private Collection<Element> collection;

    Some(Collection<Element> collection) {
        this.collection = collection;
    }
}
