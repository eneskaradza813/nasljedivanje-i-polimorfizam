package vjezba8;

public class Riba extends Zivotinja{

    private String ime, podvrsta;
    
    public Riba(String ime){
        super("Riba");
        this.ime = ime;
        podvrsta = "nepoznata";
    }
    
    public Riba(String ime, String podvrsta)
    {
        super("Riba");
        this.ime = ime;
        this.podvrsta = podvrsta;
        
    }
    public String toString(){
        return super.toString() +"\nZove se " + ime + "\nPodvrsta " + podvrsta;
    }
    public void oglasiSe(){
        System.out.println("Riba se ne oglasava");
    }
    public int kretanje(){
        return PLIVA;
    }
}
