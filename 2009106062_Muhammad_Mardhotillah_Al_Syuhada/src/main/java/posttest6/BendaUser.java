package posttest6;

public class BendaUser {
    
    private Benda benda;
    
    public BendaUser (Benda benda){
        this.benda = benda;
    }
    
    void nyalakanbenda(){
        this.benda.nyala();
    }
    
    void matikanbenda(){
        this.benda.mati();
    }
    
}
