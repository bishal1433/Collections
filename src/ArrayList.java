import java.util.Arrays;

public class ArrayList <T>{
    private static final int defaultCapacity=10;
    private int count;
    private Object[] arr;
    private int capacity;


    public ArrayList(){
        this.capacity=defaultCapacity;
        arr = new Object[capacity];
        count=0;
    }

    public ArrayList (int capacity){
        this.capacity = capacity;
        arr =new Object[capacity];
        count=0;
    }

    public void add (T item){
        ensureCapacity();
        arr[count++] = item;
    }

    public int size(){
        return count;
    }

    public int cap(){
        return capacity;
    }

    public T get(int indx){
        ensureCapacity();
        return (T)arr[indx];
    }

    public T remove(int indx){
        if(indx>=count){
            throw new RuntimeException("Index out of bound.");
        }

        T removedElement=(T) arr[indx];
        arr[indx]=null;
        for(int i=indx+1;i<count;i++){
            arr[i-1]=arr[i];
        }

        count--;

        return removedElement;
    }

    private void ensureCapacity(){
            if(count == capacity){
                capacity =2*capacity;
                Object[] newArr = new Object[capacity];

                for(int i=0;i<count;i++){
                    newArr[i] = arr[i];
                }
                arr =newArr;
            }

            return;
    }

    public String display() {

        StringBuilder s = new StringBuilder();
        for(int i=0;i<count;i++){
            if(i==count-1){
                s.append(arr[i].toString());
                continue;
            }
            s.append(arr[i].toString()).append(", ");
        }

        return "ArrayList{" +
                "arr=" + s  +
                '}';
    }
}
