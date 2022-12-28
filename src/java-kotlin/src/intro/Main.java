package intro;

import static intro.FunctionsKt.displayMax;
import static intro.Hello.displayHello;

public class Main {
    public static void main(String[] args) {
        displayMax(45, 78);
        displayHello();
        // Hello.displayHello();
        System.out.println(NamedAndDefaultArgsKt.sum());
    }
}