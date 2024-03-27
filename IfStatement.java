public class IfStatement {
    public static void main(String[] args) {
        
        var nilaiAbsen = 60;
        var nilaiUjian = 60;
        
        if(nilaiAbsen >= 80 && nilaiUjian >= 80) {
            System.out.println("anda lulus");
        } else {
            System.out.println("silakan coba lagi tahun depan");
        }

        if (nilaiAbsen >= 80 && nilaiUjian >= 80) {
            System.out.println("nilai anda A");
        } else if (nilaiAbsen >= 70 && nilaiUjian >= 70) {
            System.out.println("nilai anda B");
        } else if (nilaiAbsen >= 60 && nilaiUjian >= 60){
            System.out.println("nilai anda C");
        }else if (nilaiAbsen >= 50 && nilaiUjian >= 50) {
            System.out.println("nilai anda D");
        } else {
            System.out.println("anda tidak lulus");
        }
    }
}
