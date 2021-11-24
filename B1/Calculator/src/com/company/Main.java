package com.company;

public class Main {

    public static void main(String[] args) {
        int cong = phepcong( 10, 20);
        int tru = pheptru ( 30, 20);
        int nhan = phepnhan ( 1, 2);
        int chia = phepchia ( 9, 3);
        System.out.println("kết quả phép công: " + cong);
        System.out.println("kết quả phép trừ: " + tru);
        System.out.println("kết quả phép nhân: " + nhan);
        System.out.println("kết quả phép chia: " + chia);
    }
    public static int phepcong(int a, int b){
        int tong = a + b;
        return tong;
    }
    public static int pheptru(int a, int b){
        int hieu = a - b;
        return hieu;
    }
    public static int phepnhan(int a, int b){
        int tich = a * b;
        return tich;
    }
    public static int phepchia(int a, int b){
        int thuong = a / b;
        return thuong;
    }
//    public static void main(String[] args) {
//        // Câu 1
//        double a = 9;
//        double b = 3;
//        System.out.println("calculator.add(a,b): " + Calculator.add(a, b));
//        System.out.println("calculator.subtract(a, b): " + Calculator.subtract(a ,b));
//        System.out.println("calcularot.multi(a, b): " + Calculator.muilti(a, b));
//        System.out.println("calculator.div"(a, b): " + Calculator.div(a, b));
//    }
}
