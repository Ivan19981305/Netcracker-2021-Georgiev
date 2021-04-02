package ivge;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Parent {
    Supplier<String> supplier = () -> "Phone";
    BiConsumer<ArrayList<String>, Supplier<String>> consumerGet = (arrayList, stringSupplier) -> {
        if(arrayList.remove(stringSupplier.get()))
            System.out.println("Parent got " + stringSupplier.get());
        else
            System.out.println("There are no " + stringSupplier.get() + " so parent can't get it");
    };
    Consumer<ArrayList<String>> consumerAdd = (arrayList) -> arrayList.add(supplier.get());
}
