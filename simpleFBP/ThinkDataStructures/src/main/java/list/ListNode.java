package list;


/**
 * 연결 리스트로 요소를 저장하는 List 인터페이스의 일부 구현을 제공
 */

public class ListNode {

    public Object data; //어떤 오브젝트에 대한 참조
    public ListNode next; // 다음 노드에 대한 참조

    public ListNode() {
        this.data = null;
        this.next = null;
    }

    public ListNode(Object data) {
        this.data = data;
        this.next = null;
    }

    public ListNode(Object data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode(" +data.toString() +")";
    }

}
