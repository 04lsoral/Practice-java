public class Heikin4 {
    public static void main(String[] args) {
        int [] ten;
        int sum;
        double heikin;

        ten = new int[5];
        ten[0] = 63;
        ten[1] = 90;
        ten[2] = 75;
        ten[3] = 45;
        ten[4] = 81;
        sum = 0;
        for (int i = 0; i < ten.length; i++) {
            sum = sum + ten[i];
        }
        heikin =(double) sum / ten.length;

        System.out.println("平均点は" + heikin + "点");
    }
    
}