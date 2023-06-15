public class StringBufferStringBuffer {
    public static void main(String[] args) {
        // Using StringBuilder
        System.out.println("Using StringBuilder");
        System.out.println("__");

        StringBuilder stringBuilder = new StringBuilder("Welcome to IS247!");
        System.out.println(stringBuilder);

        stringBuilder.replace(0, 7, "Programming");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        stringBuilder.append(" Welcome!");
        System.out.println(stringBuilder);

        stringBuilder.insert(0, "Greetings: ");
        System.out.println(stringBuilder);

        String substring = stringBuilder.substring(0, 15);
        System.out.println(substring);

        stringBuilder.trimToSize();
        System.out.println(stringBuilder);

        stringBuilder.delete(0, 12);
        System.out.println(stringBuilder);

        System.out.println("\nUsing StringBuffer");
        System.out.println("__");

        // Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Welcome to IS247!");
        System.out.println(stringBuffer);

        stringBuffer.replace(0, 7, "Programming");
        System.out.println(stringBuffer);

        stringBuffer.reverse();
        stringBuffer.append(" Welcome!");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer);

        stringBuffer.insert(0, "Greetings: ");
        System.out.println(stringBuffer);

        String substring2 = stringBuffer.substring(0,15);
        System.out.println(substring2);

        stringBuffer.delete(15,41);
        stringBuffer.trimToSize();
        System.out.println(stringBuffer);



        stringBuffer.insert(0,"Programming to IS247! ");
        stringBuffer.delete(21,37);
        stringBuffer.trimToSize();
        stringBuffer.reverse();
        stringBuffer.replace(0, 0, "Hello:");
        stringBuffer.insert(27, " Welcome!");

        System.out.println(stringBuffer);
    }
}
