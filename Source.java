// class Node<T> {
//     T val;
//     Node<T> next;
    
//     public Node(T val) {
//       this.val = val;
//       this.next = null;
//     }
//   }
  
  class Source {
    public static <T> boolean linkedListFind(Node<T> head, T target) {
      boolean isFound = false;
      Node<T> currentNode = head;

      while (currentNode != null) {
        if (currentNode.val.equals(target)) {
          isFound = true;
        }
        currentNode = currentNode.next;
      }

      return isFound;
    }
    
    public static void main(String[] args) {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");

        a.next = b;
        b.next = c;
        c.next = d;

        // a -> b -> c -> d

        System.out.println(Source.linkedListFind(a, "c"));  // true

        Node<Integer> node1 = new Node<>(42);

        // 42

         // false
        System.out.println(Source.linkedListFind(node1, 100));  // false
        
    }

  }