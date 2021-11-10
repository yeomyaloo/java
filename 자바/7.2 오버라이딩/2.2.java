import java.io.IOException;
import java.sql.SQLException;

class Parent{
    void parentMethod() throws IOException, SQLException {
        // ... 
    }
}

class Child extends Parent {
    void parentMethod() throws IOException{

    }
}
class Child2 extends Parent {
    void parentMethod() throws Exception {
    }
}
