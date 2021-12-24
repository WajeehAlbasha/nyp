public class insan {

    private int kilo;
    private int boy;

    public void setBoy(int boy){
        this.boy = boy;
    }

    public void setKilo(int kilo){
        this.kilo = kilo;
    }

    public int getBoy(){
        return boy;
    }

    public int getKilo(){
        return kilo;
    }

    public static class muhendis extends insan {

        private int maas;

        public void setMaas(int maas){
            this.maas = maas;
        }

        public int getMaas(){
            return maas;
        }

    }

    public static class bilgisayarMuhendisi extends muhendis {
        int dilSayisi;
        String Uzmanlik;
        String Alan;
        public bilgisayarMuhendisi(){
            this.dilSayisi=5;
            this.Uzmanlik="Yapay Zeka";
            this.Alan="yazilim";
            System.out.println(" bildigi yazilim dilleri = "+dilSayisi+"  Alan = "+Alan+"  Uzmanlik = "+Uzmanlik);
            System.out.println(" bildigi yazilim dilleri = "+dilSayisi);
            System.out.println(" parametresiz kurucu metot ");
        }
        public bilgisayarMuhendisi(int dilSayisi){
            this.dilSayisi=5;
            this.Uzmanlik="Yapay Zeka";
            this.Alan="yazilim";
            System.out.println(" bildigi yazilim dilleri = "+dilSayisi);
        }
        public bilgisayarMuhendisi(int dilSayisi,String Uzmanlik,String Alan){
            this.dilSayisi=5;
            this.Uzmanlik="Yapay Zeka";
            this.Alan="yazilim";
            System.out.println(" bildigi yazilim dilleri = "+dilSayisi+"  Alan = "+Alan+"  Uzmanlik = "+Uzmanlik);
        }
    }

    public static void main(String[] args) {
        
        bilgisayarMuhendisi bm =new bilgisayarMuhendisi();
        bm.setBoy(180);
        bm.setKilo(70);
        bm.setMaas(8000);
        System.out.println(" BOY="+bm.getBoy()+"  KİLO="+bm.getKilo()+"  MAAŞ="+bm.getMaas());
        
       
    }
}