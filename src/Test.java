
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 56, 7, 8);
        list.forEach(System.out::println);
        list.forEach(i -> {if (i%2==0) System.out.println(i);});
        Fun1 add = Integer::sum;
        Fun1 mul = (int x, int y) -> x * y;
        Fun1 com = Integer::compare;
        Fun1 unj = Integer::compareUnsigned;
        Fun2 fobj = message -> System.out.println("Hello " + message);
        System.out.println(String.format("%s%d", "Boolean is ", operation(8,8,unj)));
        System.out.println(String.format("%s%d","Addition is ", operation(6,9,add)));
        System.out.println(String.format("%s%d", "Mulitation ", operation(8,9,mul)));
        fobj.sayMessage("Kooo");
    }

    interface Fun1 {
        int opera(int x, int y);
    }

    interface Fun2 {
        void sayMessage(String message);
    }

    private static int operation(int a, int b, Fun1 fobj) {
        return fobj.opera(a, b);
    }

}
