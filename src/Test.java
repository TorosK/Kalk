public class Test {
    public static void main(String[] args) {
        double x = 14.5;
        System.out.println(x);
        String comma = Double.toString(x); // "14.5"
        System.out.println(comma);
        comma = comma.replace(".", ","); //string_name.replace(old_string, new_string)
        String s = "Toros";
        s = s.replace("T", "S");
        System.out.println(s);
        // 14.5 = 14,5
        System.out.println(comma);
        double y = Double.parseDouble(comma); //double str1 = Double.parseDouble(str);
        System.out.println(y);


    }
}
