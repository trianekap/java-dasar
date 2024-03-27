public class TypeDataBukanPrimitif{
    public static void main(String[] args) {
        
        Integer iniInteger = 10;
        Long iniLong = 10000L;

        Byte iniByte = null;

        iniByte = 100;

        System.out.println(iniByte);

        int iniInt = 100;

        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue();
        Long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        Long amount = 1000000L;

        System.out.println(iniObject);
        System.out.println(iniFloat);
        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniShort);
        System.out.println(iniLong2);
        System.out.println(amount);


    }
}