package Generic;

public class Generic8_1_2 {
    public static <T> void printArgInfo(T arg){
        System.out.println("\n인수 형은?"+ arg.getClass());
        System.out.println("값 은? = "+arg.toString());
    }

    public static void main(String[] args) {
        System.out.println();
        Integer i = new Integer(10);
        char c = 'a';
        float f = 3.14f;

        printArgInfo(i);
        printArgInfo(5);
        printArgInfo(c);
        printArgInfo(f);
        System.out.println();
    }
}
