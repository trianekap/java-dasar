public class ForEach {
    public static void main(String[] args) {
        /*  
        ini tanapa for each 
        String []name = {"Trian", "Eka", "Putra", "Rama", "Putri"};

        for(int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        */
        
        // ini pakai for each
        String[] name = {"Trian", "Eka" , "Putra", "Suparman", "Jajang"};

        for (String value : name) {
            System.out.println(value);
        }


    }
}
