package api_string;

public class Main {
    public static void main(String[] args) {
        String text = " Hi that's my friend.";
        char ch = 'f';
        int i = 0;
        while (i !=text.length()-1){
            i = text.indexOf(ch,i);
            if(i == -1){
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
