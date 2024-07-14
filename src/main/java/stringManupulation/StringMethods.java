package stringManupulation;

public class StringMethods {
    public static void main(String[] args) {
        String x = "java";
        System.out.println(x.charAt(0));  // j
        x.concat("rules");   // concatenation , "val1val2"
        System.out.println(x);   // java

        x = x.concat("rules");
        System.out.println(x);  // javarules

        String y = "0123456789";
        String subY = y.substring(3);   // 3456789
        System.out.println(subY);
        String subY1 = y.substring(5,8);
        System.out.println(subY1);  //567    // last value-1 index
    }
}
