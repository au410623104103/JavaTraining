public class ReverseWords {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverse(s));
    }

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split( "\\s+");
        for(int i = str.length - 1; i >= 0; i--)
            {
            sb.append(str[i]);
            if (i != 0)
                {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
