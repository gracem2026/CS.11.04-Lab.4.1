public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String str){
        int leftC = 0;
        int rightC = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') leftC ++;
            if (str.charAt(i) == ')') rightC ++;
        }

        return leftC == rightC;
    }

    // 2. reverseInteger
    public static String reverseInteger(int num){
        String result = "";
        String str = Integer.toString(num);

        for (int i = str.length()-1; i >= 0; i--) {
            String temp = str.substring(i, i+1);
            result += temp;
        }

        return result;
    }

    // 3. encryptThis
    // I'm not sure on how to do this one :(
    public static String encryptThis(String str){
        String result = "";
        int start = 0;
        String end = "";
        int len = str.length();
        int prev = 0;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                String temp = str.substring(prev, i);
                start = (int) temp.charAt(prev) ;
                end = temp.charAt(i - 1) + temp.substring(prev + 1, i - 1) + temp.charAt(prev + 1);
                result = result + start + end;
                prev = i+1;
            }
        }

        return result;
    }

    // 4. decipherThis
    /*public static String decipherThis(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                int prev = 0;
                String temp = str.substring()
            }
        }
    }
    // I'm really not sure on how to do this one
     */
}