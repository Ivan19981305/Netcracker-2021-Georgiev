package ivge;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Child {
    Supplier<String> supplier = () -> "Pic";
    Consumer<ArrayList<String>> consumerGet = (arrayList) -> arrayList.remove(supplier.get());
    Consumer<ArrayList<String>> consumerAdd = (arrayList) -> arrayList.add(supplier.get());
}

