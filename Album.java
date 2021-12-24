import java.util.*; 

public class Album {

    public String sanatci;
    public int satisAdet;
    public String albumAdi;

    Album(String sanatci,int satisAdet,String albumAdi){
        this.sanatci=sanatci;
        this.satisAdet=satisAdet;
        this.albumAdi=albumAdi;
    }

    public int ToplamSatisBul(){
        return satisAdet;
    } 

    public static class Arabesk extends Album  {

        public int yil;

        Arabesk(String sanatci,int satisAdet,String albumAdi,int yil){
            super(sanatci,satisAdet,albumAdi);
            this.yil=yil;
        }
        
        public int getYil() {
            return yil;
        }

        public void EnyeniOlaniBul(){
           
        }
    }

    public static class HalkMuzigi extends Album{
        boolean yoreselMi;

        HalkMuzigi(String sanatci,int satisAdet,String albumAdi,boolean yoreselMi){
            super(sanatci,satisAdet,albumAdi);
            this.yoreselMi=yoreselMi;
        }
        void goster(){
            System.out.println("         SANATCI:"+sanatci+"  SATISADET:"+satisAdet+"  ALBUM:"+albumAdi);
        }
    }

    public static void main(String[] args) {
        int enYeni=0;
        int toplamSatis;

        HalkMuzigi h1=new HalkMuzigi("Neset Ertas",10000,"Acem Kizi", true);
        HalkMuzigi h2=new HalkMuzigi("Mahsuni serif",5000,"Mevlam Iki Goz Vermis", true);
        HalkMuzigi h3=new HalkMuzigi("Volkan Konak",1000,"Mora", false);
        Arabesk a1=new Arabesk("Ibrahim Tatlises",150000,"Yalnizim",1990);
        Arabesk a2=new Arabesk("Ferdi Tayfur",100000,"Emmoglu",1995);
        Arabesk a3=new Arabesk("muslum gurses",250000,"Meselem",1993);

        System.out.println("YORESEL OLAN HALK MUZIKLERI :");
        if (h1.yoreselMi==true) {
            h1.goster();
        }

        if (h2.yoreselMi==true) {
            h2.goster();
        }

        if (h3.yoreselMi==true) {
            h3.goster();
        }

        if (a1.getYil()>enYeni) {
            enYeni = a1.getYil();
        } 
        if (a2.getYil()>enYeni) {
            enYeni =a2.getYil();
        }
        if (a3.getYil()>enYeni) {
            enYeni =a3.getYil();
        }
        System.out.println("En Yeni Album :"+enYeni);
        System.out.println("            en yeni album yili :"+enYeni +"   Album Adi :"+a2.albumAdi+"       Sanatci :"+a2.sanatci+"    Satis Adet :"+a2.satisAdet);
        
        toplamSatis = h1.ToplamSatisBul()+h2.ToplamSatisBul()+h3.ToplamSatisBul()+a1.ToplamSatisBul()+a2.ToplamSatisBul()+a3.ToplamSatisBul();
        System.out.println("Toplam Satis: "+toplamSatis+"   adet");
    }

    
}
