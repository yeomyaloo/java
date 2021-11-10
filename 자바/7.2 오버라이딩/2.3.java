class Parent{
    void parentMethod() {

    }
}
class Child extends Parent {
    void parentMethod(){ } // 오버라이딩
    void parentMethod(int i) { } // 오버로딩


    void childMethod() {} // 오버로딩
    void childMethod(int i) //에러!! 중복정의 
    void childMethod() {}
}