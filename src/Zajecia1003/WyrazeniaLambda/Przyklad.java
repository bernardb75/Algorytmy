package Zajecia1003.WyrazeniaLambda;

import java.util.function.BiConsumer;
import java.util.function.BooleanSupplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Przyklad {
    public static void main(String[] args) {
        Checker<Integer>isOddAnonymous=new Checker<Integer>() {
            @Override
            public boolean check(Integer object){
                return object%2!=0;
            }
        };
        System.out.println(isOddAnonymous.check(23));
        Checker<Integer>isOddAnonymousLambda=x->x%2!=0;
        System.out.println(isOddAnonymousLambda.check(23));

        UnaryOperator<Integer> power=x->x*x;
        UnaryOperator<Integer> adding=x->x+20;

        BiConsumer<Integer,Integer> add=(x, y)-> System.out.println(x+y);

        Działania addFromDzialania=(x,y)->x+y;
        Działania minFromDzialania=(x,y)->x-y;

        Działania divFromDzialania=(x,y)->x/y;
        Działania multFromDzialania=(x,y)->x*y;

        System.out.println(divFromDzialania.calculate(22,11));

        Parzysta parzysta=new Parzysta();
        BooleanSupplier isOddMethodReturnTrue=parzysta::trueIfOdd;
        BooleanSupplier isOddMethodReturnFalse=parzysta::fallsIfOdd;
        demo(isOddMethodReturnTrue);
        demo(isOddMethodReturnFalse);

        //demo2(isOddAnonymousLambda.check(1,2));


    }

    public static void demo(BooleanSupplier logic) {
        System.out.println(logic.getAsBoolean());
    }

    public static void demo2(ToIntFunction logic, Parzysta instancja) {
        System.out.println(logic.applyAsInt(instancja));
    }
}
