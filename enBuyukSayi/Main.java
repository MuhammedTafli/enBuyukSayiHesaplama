public class Main {

    public static void main(String[] args) {

        int sayi1 = 3105;
        int sayi2 = 4596;
        int sayi3 = 2341;
        int enBuyuk = sayi1;

        if(enBuyuk<sayi2){
            enBuyuk=sayi2;
        }
        if(enBuyuk<sayi3){
            enBuyuk=sayi3;
        }
        System.out.println("En büyük sayımız = "+enBuyuk);
    }
}