package ivge;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Child {
    Supplier<String> supplier = () -> "Pic";
    BiConsumer<ArrayList<String>, Supplier<String>> consumerGet = (arrayList, stringSupplier) -> {
        int cnt = 0;
        while(arrayList.remove(stringSupplier.get())) {
            cnt++;
        }
        System.out.println("Child got " + cnt + " that things: " + stringSupplier.get());
    };
    Consumer<ArrayList<String>> consumerAdd = (arrayList) -> arrayList.add(supplier.get());
}

