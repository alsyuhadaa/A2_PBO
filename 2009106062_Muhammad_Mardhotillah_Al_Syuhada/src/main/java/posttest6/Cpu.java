package posttest6;

public class Cpu implements Benda {
    
    private boolean isNyala;
    
    public void nyala(){
        isNyala = true;
        System.out.println("System menyala...");
        System.out.println("Selamat datang di Homelaptop Service");
    }
    
    public void mati(){
        isNyala = false;
        System.out.println("System di matikan");
    }
}
