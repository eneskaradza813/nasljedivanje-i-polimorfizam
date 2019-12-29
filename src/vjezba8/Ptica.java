package vjezba8;

public class Ptica extends Zivotinja{
    
    private String ime;
    
    public Ptica(String ime){
        super("Ptica");
        this.ime = ime;
    }
    public String toString(){
       return super.toString() + "\nZove se " + ime;
                
    }
    
    public int kretanje(){
        return HODA | LETI;
    }
      public void oglasiSe(){
          System.out.println("Specificno oglasavanje");
      }
}
