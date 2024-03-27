public class SwitchCase {
    public static void main(String[] args) {
        

        var nilai = "B";

        switch (nilai) {
            case "A":
                System.out.println("Wow anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("anda lulus");
                break;
            case "D":
                System.out.println("anda tidak lulus");
                break;
            default:
                System.out.println("mungkin anda salah jurusan");
                break;
        }

        //ini switch lambda
        switch(nilai) {
            case "A" -> System.out.println("wow anda lulus dengan baik");
            case "B", "C" -> System.out.println("anda lulus cukup baik");
            case "D" -> System.out.println("anda tidak lulus");
            default -> System.out.println("mungkin anda benar benar salah jurusan");
        }

        //switch tanpa yield
        String ucapan;

        switch (nilai) {
            case "A" -> ucapan = "wow anda lulus dengan baik";
            case "B", "C" -> ucapan = "anda lulus cukup baik";
            case "D" -> ucapan = "anda tidak lulus";
            default -> ucapan = "mungkin anda salah jurusan";
        }

        System.out.println(ucapan);

        //switch dengan yield
        String ucapanYield = switch (nilai){
            case "A" : 
            yield "wowwww anda lulus dengan baik";
            case "B", "C" :
            yield "anda lulus cukup baik";
            case "D" :
            yield "anda tidak lulus";
            default :
            yield "anda salah jurusan";
        };

        System.out.println(ucapanYield);
    }
}
