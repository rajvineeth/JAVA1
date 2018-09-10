import java.util.Scanner;
public class Reverse {

    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner s = new Scanner(System.in);
        String st = s.next();
        String stt="";
        for(int i=st.length()-1;i>=0;i--)
        {
            stt+=st.charAt(i);
        }
        System.out.println(stt);
    }
}