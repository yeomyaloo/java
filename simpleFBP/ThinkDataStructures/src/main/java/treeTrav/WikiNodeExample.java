package treeTrav;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.*;

public class WikiNodeExample {

    public static void main(String[] args) throws IOException {
        String url= "https://en.wikipedia.org/wiki/Java_(programming_language)";


        //문서 다운로드하고 파싱하기
        Connection conn = Jsoup.connect(url);
        Document doc = conn.get();

        //내용 선택하고 단락 추출하기
        Element content = doc.getElementById("mw-content-text");
        Elements paras = content.select("p");
        Element firstPara = paras.get(0);


        recursiveDFS(firstPara);
        System.out.println();

        iterativeDFS(firstPara);
        System.out.println();


        /**4. DOM 트리 반복하기
         * paras 변수에서 첫 번째 단락을 선택
         * Iterable<Node> 인터페이스를 구현하는 WikiNodeIterable 객체를 생성
         * WikiNodeIterable은 깊이 우선 탐색을 실행해 페이지에 나타나는 순서대로 노드를 제공한다.
         * */
        Iterable<Node> iter = new WikiNodeIterable(firstPara);
        for(Node node: iter){
            //TextNode에 대해서만 node 객체를 프린트하고 다른 Node 타입은 무시한다.
            if(node instanceof TextNode){
                System.out.println(node);
            }
        }






    }

    /**6. 깊이 우선 탐색 (재귀적 구현)
     * 6-1. 루트 노드에서 시작해 첫 번째 자식 노드를 선택 또 첫 번째 자식에게 자식이 있다면 그 자식을 또 선택
     * 6-2. 자식이 없는 경우라면 부모 노드로 올라가 부모 노드에 다른 자식이 있다면 그쪽으로 이동한다.
     * 6-3. 탐색이 다 끝나 다시 루트의 마지막 노드까지 탐색하면 종료한다.
     * 재귀적 호출은 호출 스택(call stack)을 사용
     * */
    private static void recursiveDFS(Node node) {

        //TextNode의 경우만 출력 - 전위 순위에 해당
        if(node instanceof TextNode){
            System.out.println(node);
        }

        // 자식노드를 전부 탐색
        for (Node child: node.childNodes()){
            recursiveDFS(child);
        }
    }

    /**6. 깊이 우선 탐색 (스택 구현)
     * - 스택 메서드를 정의하는 자바 인터페이스는 stack과 deque가 있다.
     * - 스택은 리스트와 유사한 구조, 요소의 순서를 유지하는 컬렉션으로 리스트보다 더 적은 수의 메서드를 제공합니다.
     * - 덱의 경우엔 '양쪽 끝에 있는 큐'를 의미하고 이를 스택처럼 사용할 수 있다. (스택을 사용하는 것보다 훨씬 빠르게 사용할 수 있다.)
     *
     * 6-1. 루트를 생성한 스택에 push(넣어준다)해줍니다.
     * 6-2. 재귀적 구현과 마찬가지로 해당 Node가 TextNode일 때만 출력을 해줍니다.
     * 6-3. 자식 노드를 처리하기 위해서는 역순으로 스택에 push해야 하기 때문에 이를 위해서
     *      ArrayList로 복사해 요소의 위치를 역순으로 만들고 역전된 ArrayList에 반복문을 실행 합니다.
     *
     * */
    private static void iterativeDFS(Node root) {
        Deque<Node> stack = new ArrayDeque<Node>();
        stack.push(root);

        while(!(stack.isEmpty())){
            Node node = stack.pop();
            if(node instanceof TextNode){
                System.out.println(node);
            }
            //처음 실행 시엔 push된 node가 root!!!
            List<Node> nodes = new ArrayList<Node>(node.childNodes());
            Collections.reverse(nodes);

            for(Node child: nodes){
                stack.push(child);
            }
        }



    }


}
