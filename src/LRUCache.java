import java.util.HashMap;
import java.util.Map;

class LRUCache {

    Node head= new Node();
    Node tail=new Node();
    Map<Integer,Node> nodeMap;
    int capacity;
    public LRUCache(int capacity) {
        nodeMap=new HashMap(capacity);
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }

    public int get(int key) {
        if(!nodeMap.containsKey(key))
            return -1;
        Node node=nodeMap.get(key);
        removeNode(node);
        addToHead(node);
        return node.val;

    }

    public void put(int key, int value) {
        Node node=nodeMap.get(key);
        if(node!=null){
                removeNode(node);
                node.val=value;
                addToHead(node);
        }else{
            if(nodeMap.size()==capacity){
                nodeMap.remove(tail.prev.key);
                removeNode(tail.prev);
            }
            node=new Node();
            node.key=key;
            node.val=value;
            addToHead(node);
            nodeMap.put(key,node);
        }
    }

    public void removeNode(Node node){
        Node prevNode=node.prev;
        Node next_node=node.next;
        prevNode.next=next_node;
        next_node.prev=prevNode;
        node.prev=null;
        node.next=null;
    }
    public void addToHead(Node node){
        Node head_next=head.next;
        head.next=node;
        node.prev=head;
        node.next=head_next;
        head_next.prev=node;
    }

    class Node{
        int key;
        int val;
        Node prev;
        Node next;
    }

    public static void main(String[] args) {
        LRUCache cache= new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));       // returns 1
        cache.put(3, 3);    // evicts key 2
        System.out.println(cache.get(2));       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        System.out.println(cache.get(1));       // returns -1 (not found)
        System.out.println(cache.get(3));       // returns 3
        System.out.println(cache.get(4));       // returns 4
    }
}
//    String response;
//    int startPage = 1;
//    int totalPages = Integer.MAX_VALUE;
//    int count=0;
//    while (startPage <= totalPages) {
//            try {
//            URL obj = new URL(
//            " https://jsonmock.hackerrank.com/api/countries/search?name=" + s + "&page=" + startPage);
//            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//            con.setRequestMethod("GET");
//            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//            while ((response = in.readLine()) != null) {
//            JSONParser parser = new JSONParser();
//            JSONObject json = (JSONObject) parser.parse(response);
//            totalPages = (int)json.get("total_pages");
//            JSONArray data =(JSONArray)json.get("data");
//            for (int i = 0; i < data.size(); i++) {
//        JSONObject obj1= data.get(i);
//        if(Integer.parseInt(population)>p){
//        count++;
//
//        }
//
//        }
//        }
//        in.close();
//        startPage++;
//        } catch (Exception ex) {
//        ex.printStackTrace();
//
//        }
//        return 0;
//
//        }
//        return count;
//

/*
Doubly linkeddlist
HashMap

5
2,3,4,5,6

head->2->3->4->5->6->tail
2,node
3,node
4,node

2,4
2,8

 */