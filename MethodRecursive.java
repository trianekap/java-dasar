public class MethodRecursive {

    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));
    }

    // factorial menggunakan for
    static int factorialLoop (int value){
        var result =  1;
        for(int i = 1; i <= value; i++){
            result *= i;
        }

        return result;
    }

    //factorial menggunakan recursive method
    static int factorialRecursive(int value){
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }
}