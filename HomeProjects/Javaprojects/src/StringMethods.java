public class StringMethods {
    public static void main(String[] args) {
        String s = "word";
        String s1 = "word";

        System.out.println(s1.toUpperCase());
        System.out.println(s.concat(s1));
        System.out.println(s.charAt(3));
        System.out.println(s.indexOf("d",4));
        System.out.println(s.substring(1, 3));
        System.out.println(s.replace("w","l"));

        if(s.equalsIgnoreCase(s1)){
            System.out.println("print me ouuuuutttt");
        }
    }
}
