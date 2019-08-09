public class ReverseString {

    public static void main(String[] args) {
        String reverse = "HelloWorld";
        StringBuilder builder = new StringBuilder(reverse);
        System.out.println(builder.reverse());
    }

}
