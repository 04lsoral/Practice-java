public class Heikin5 {
    public static void main(String[] args) {
        int[] ten = { 63,90,75,45,81 };
        int sum = 0;
        for (int i = 0; i < ten.length; i++) {
            sum = sum + ten[i];

        }
        double heikin = (double) sum / ten.length;
        System.out.println("平均点は" + heikin + "点");
    }
    
}