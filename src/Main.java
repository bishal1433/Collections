import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>(5);

        for(int i=0;i<11;i++){
            ls.add(i+1);
        }


        System.out.println(ls.display());
        System.out.println(ls.get(8));
        System.out.println(ls.cap());
        System.out.println(ls.size());
        System.out.println(ls.remove(5));
        System.out.println(ls.display());
        System.out.println(ls.cap());
        System.out.println(ls.size());
//        System.out.println(ls.remove(10));


//        ls.add("Bishal");


        /*************************************************************************************************/
        System.out.println();
        System.out.println("************************************************************************************");
        System.out.println("Stack is there");
        Stack<String> st = new Stack<>(4);

        st.push("Bishal");
        st.push("Shubham");
        st.push("Mohit");
        st.push("Sourav");
        st.push("Raja");


        System.out.println(st.peek());
        System.out.println(st.display());
        System.out.println(st.poll());
        System.out.println(st.display());
        System.out.println();


        /*************************************************************************************************/
        System.out.println();
        System.out.println("************************************************************************************");
        System.out.println("HashCode and equals is there");

        Normal n1 = new Normal("Bishal",1);
        Normal n2 =  new Normal("Bishal",1);

        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());

        /*************************************************************************************************/
        System.out.println();
        System.out.println("************************************************************************************");
        System.out.println("HashMap is there");

        MyHashMap<String,Integer> mp = new MyHashMap<>(10);
        ArrayList<String> map_list = new ArrayList<>(31);
        String s="";

        for(Integer i=0;i<15;i++){
            s+=i.toString()+", ";
            if(i<5){
                map_list.add(s);

            }else if(i<10){
                map_list.add(s);
                map_list.add(s);
            }else{
                map_list.add(s);
                map_list.add(s);
                map_list.add(s);
            }
            mp.put(s,0);
        }


        for(int i=0;i<30;i++){
            String p = map_list.get(i);
            mp.put(p,mp.get(p)+1);
        }


        for(Integer i =0;i<30;i++){
            System.out.println("value for ["+map_list.get(i)+"] is : "+mp.get(map_list.get(i)));
        }

        /*************************************************************************************************/
        System.out.println();
        System.out.println("************************************************************************************");
        System.out.println("HashMap is there");














    }
}