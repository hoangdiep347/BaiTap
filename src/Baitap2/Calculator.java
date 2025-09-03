package Baitap2;

public class Calculator {

    //ham tinh tong 2 so nguyen
    static int toSum(int a , int b){
        return a + b;
    }

    //ham tinh tich 2 so thuc
    static double toTich (double t1, double t2){
        return t1*t2;
    }


    public static void main(String[] args) {
        int Tong = toSum(5,2);
        System.out.println(Tong);

        double Tich = toTich(2.5, -4);
        System.out.println(Tich);
    }
}
