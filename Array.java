public class Array {
    public static void main(String[] args) {
        
        int[] ArrayInt = new int[]{1,2,3,4,5};

        for(int i = 0; i < ArrayInt.length; i++){
            System.out.print(ArrayInt[i]);
        }

        System.out.println();

        String[] Hewan = new String[]{"kucing","anjing","tikus","banteng","monyet"};

        for(int i= 0; i < Hewan.length; i++){
            System.out.println(Hewan[i]);
        }
    }
}