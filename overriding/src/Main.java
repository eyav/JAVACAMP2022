public class Main{

    public static void main(String[] args) {
        BaseCreditManager[] krediManagers = new BaseCreditManager[] {new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};

        for (BaseCreditManager krediManager :krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }

    }
}
