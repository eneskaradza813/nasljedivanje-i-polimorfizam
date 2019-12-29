package vjezba8;

public class Pas extends Zivotinja{
    
    private String ime, rasa;
    
    
    public Pas(String ime){
        super("Pas");
        rasa = "nepoznata";
    }
    
    public Pas(String ime, String rasa)
    {
        super("pas");
        this.ime = ime;
        this.rasa = rasa;
        
    }
    @Override
    public String toString(){
        return super.toString() + "\nZove se " + ime + ",a rasa je " + rasa;
    }
    public void oglasiSe(){
        System.out.println("AV AV");
    }
    public int kretanje(){
        return HODA;
    }
}
