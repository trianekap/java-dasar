public class MethodVariableArgument {
    public static void main(String[] args) {
        
        int[] values = {80,80,80,30,80}; 
        sayCongrats("trian", values);
    }

    static void sayCongrats(String name, int[] values){

        int total = 0;

        for (var value : values) {
            total += value;
        }

        int finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name  + " anda lulus");
        } else {
            System.out.println("maaf " + name + " anda tidak lulus");
        }


    }
}
