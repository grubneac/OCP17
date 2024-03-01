package arrays;

public class TestsArray {
    public static void main(String[] args) {

        int[] rrr = {1,2,3,4};
        added(rrr, 4);
        for(int dd: rrr)
            System.out.print(dd + " ");

        System.out.println("\n------------------------");

        Ttt tt = new Ttt();
        tt.field = 10;
        added(tt, 5);
        System.out.println(tt.field);

        int ss =  10;
        added(ss, 5);
        System.out.println(ss);

    }

    static void added(int[] arr, int a) {
        for (int i = 0 ; i< arr.length; i++){
            arr[i] += a;
        }
    }
    static void added(Ttt arr, int a){
        arr.field +=a;
    }

    static void added(int arr, int a){
        arr += a;
    }
}

class Ttt{
    int field;
}
