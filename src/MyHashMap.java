import java.util.Objects;

public class MyHashMap <K,V>{
    private int size = 1<<16;
    private int max_size = 1<<30;


    private Node<K,V>[] hashTable;


    public MyHashMap(){
        hashTable = new Node[size];
    }

    public MyHashMap(int capacity){
        size = expanded_size(capacity);
        hashTable = new Node[size];
    }

    private int expanded_size(int capacity) {
        int n = capacity - 1;
        n|= n >>> 1;
        n|= n >>> 2;
        n|= n >>> 4;
        n|= n >>> 8;
        n|= n >>>16;

        return (n<0)?1:(n>=max_size)?max_size:n+1;
    }

//    new java.util.HashMap

    public void put (K key,V value){
        int h = Math.abs(key.hashCode())%size;
//        System.out.println("hashcode for key: "+key+" is "+h);

        Node<K,V> node = hashTable[h];


        if(node == null){
            hashTable[h] = new Node(key,value);
            return;
        }
        Node<K,V> pre = null;

        while(node!=null){
            if(node.key.equals(key)){
                node.value = value;
                return;
            }
            pre = node;
            node =node.next;
        }

        pre.next = new Node(key,value);
        
    }

    public  V get(K key){
        int h = Math.abs(key.hashCode())%size;
//        System.out.println("hashcode for key: "+key+" is "+h);

        Node<K,V> node =hashTable[h];

        while(node!=null){
            if(node.key.equals(key)){
                return (V) node.value;
            }
            node=node.next;
        }

        return null;
    }


}

class Node<K,V>{
     K key;
     V value;
     Node<K,V> next;

    public Node(K key,V value){
        this.key =key;
        this.value = value;
        next = null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key,value,next);
    }
}
