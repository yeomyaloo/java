package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClientExample {

    private List list;

    public ListClientExample() {
        this.list = new LinkedList();
    }

    public List getList() {
        return list;
    }

    public static void main(String[] args) {
        ListClientExample lce = new ListClientExample();
        List list = lce.getList();
        System.out.println(list);

    }

}
