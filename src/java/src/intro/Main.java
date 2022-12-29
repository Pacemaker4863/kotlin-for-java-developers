package intro;

import controlstructures.ExceptionsKt;

import java.io.IOException;

import static intro.FunctionsKt.displayMax;
import static intro.Hello.displayHello;

public class Main {
    public static void main(String[] args) {
        displayMax(45, 78);
        displayHello();
        // Hello.displayHello();
        System.out.println(NamedAndDefaultArgsKt.sum());

        try {
            ExceptionsKt.foo();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

//        try {
//            ExceptionsKt.bar();
//        } catch (IOException e) {
//        }
    }
}