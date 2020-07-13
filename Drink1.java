import java.io.*;

public class Drink1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("飲み物は何が好きですか？");
            System.out.println("1 オレンジジュース");
            System.out.println("2 コーヒー");
            System.out.println("3 どちらでもない");
            System.out.println("1,2,3のどれかを選んでください");
            String m = reader.readLine();  //Stringの後ろは、入力を整数にとして読み込むためのもの。例題は分かりやすくlineにしてある。
            int n = Integer.parseInt(m);
            switch (n) {
            case 1:
               System.out.println("オレンジジュースです");
               break;

            case 2:
               System.out.println("コーヒーです");
               break;

            default:
            System.out.println("どちらでもありません");
            break;
            }
        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("数字の形式が正しくありません");
        }
    }
    
}