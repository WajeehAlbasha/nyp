import java.util.*;  
public class kontrol {

    static void tek_indis(){
        System.out.println("girdiğiniz string TEK INDIS dir");
    }

    static void cift_indis(){
        System.out.println("girdiğiniz string CIFT INDIS dir");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.println("string ifadeyi giriniz: ");  
        String str= sc.nextLine();   
        int sayi = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
            sayi++;
        }
        if (sayi/2==0) {
            cift_indis();
        } else {
            tek_indis();
        }
   }
}