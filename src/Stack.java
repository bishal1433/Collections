public class Stack <T>{
    private static final int defaultCapacity=10;
   private int indx;
   private Object []arr;
   private int capacity;

   public Stack (){
       capacity=defaultCapacity;
       arr = new Object[capacity];
       indx = 0;
   }

   public Stack (int cap){
       capacity = cap;
       arr = new Object[capacity];
       indx = 0;
   }


   public T push(T item){
       ensureCapacity();
       arr[indx++] = item;
       return (T) arr[indx-1];
   }

   public T poll(){
       T item =(T) arr[--indx];
       arr[indx]=null;
       return item;
   }

   public T peek(){
       return (T) arr[indx-1];
   }

   public int size(){
       return indx;
   }

   public int cap(){
       return capacity;
   }

   public void ensureCapacity(){
       if(indx == capacity){
           capacity = 2*capacity;
           Object[] newArr = new Object[capacity];

           for(int i=0;i<indx;i++){
               newArr[i] = arr[i];
           }

           arr=newArr;
       }
       return;
   }

    public String display() {

        StringBuilder s = new StringBuilder();
        for(int i=indx-1;i>=0;i--){
            if(i==0){
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
