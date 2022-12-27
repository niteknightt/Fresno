public class FresnoMain {

    public final static String name = "niteknightt";

    public static void main(String[] args) {
        System.out.println(createOutputMessageFromName(name));
    }

    public static String createOutputMessageFromName(String name) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hey ");
        sb.append(name);
        sb.append(", with ");
        sb.append(countLetters(name));
        sb.append(" letters in your name -- let's do some Fresno stuff!");
        return sb.toString();
    }

    public static int countLetters(String text) {
        return text.length();
    }
}
