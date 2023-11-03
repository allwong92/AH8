class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> T getNodeValue(Node<T> head, int index) {
    /*
     * This method takes in head node of a linked list and an integer 
     * index. Returns the value of the linked list at the specified index.
     */

     T ret_val = null;   // to hold the value at given index
     Node<T> current_node = head;
     for (int i = 0; i < index && current_node != null; i++){
      current_node = current_node.next;
     }
     if (current_node == null) {
        return null;
     }
     ret_val = current_node.val;
    return ret_val;
  }
  
  public static void main(String[] args) {
    Node<String> node1 = new Node<>("banana");
    Node<String> node2 = new Node<>("mango");
    Node<String> node3 = new Node<>("kiwi");

    node1.next = node2;
    node2.next = node3;

    // banana -> mango -> kiwi

    System.out.println(ECSource.getNodeValue(node1, 1));

    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");

    a.next = b;
    b.next = c;
    c.next = d;

    // a -> b -> c -> d

    System.out.println(ECSource.getNodeValue(a, 7)); // null
  }
}