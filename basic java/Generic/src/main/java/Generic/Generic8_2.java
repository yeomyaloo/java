package javaStandard.Generic;

class Generic8_2<T> {
    T ob;//T형의 Generic 선언

    public Generic8_2(T o){
        ob = o;
    }

    public T getOb() {
        return ob;
    }
    void showType(){
        System.out.println("T 타입 = " + ob.getClass().getName());
    }
}

class SimpleGeneric{
    public static void main(String[] args) {
        System.out.println("--> 2개의 타입선언 후 제네릭을 이용한 결과 출력 <--");

        //Integer 형의 Generic_2참조
        Generic8_2<Integer> iOb;
        iOb = new Generic8_2<Integer>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("iOb 값 : "+v);
        System.out.println();

        Generic8_2<String> strOb = new Generic8_2<String>("Generic Test");
        strOb.showType();
        String s = strOb.getOb();
        System.out.println(s);
        System.out.println();
    }
}
