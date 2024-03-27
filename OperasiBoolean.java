public class OperasiBoolean {
    public static void main(String[] args) {
        
        var absen= 80;
        var ujian = 82;

        boolean lulusAbsen = absen >= 75;
        boolean lulusUjian = ujian >= 75;
        
        var lulus = lulusAbsen && lulusUjian;
        System.out.println(lulus);
    }
}
