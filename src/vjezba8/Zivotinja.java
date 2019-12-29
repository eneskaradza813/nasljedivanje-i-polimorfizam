package vjezba8;

public abstract class Zivotinja {
    
    public static final int HODA = 1<<1;
    public static final int PLIVA = 1 << 2;
    public static final int LETI = 1 << 3;
    
    private String vrsta;
    
    public Zivotinja(String vrsta){
        this.vrsta = vrsta;
    }

    public String toString(){
        return "Ovo je " + vrsta;
        
    }
    
    public abstract void oglasiSe();
    public abstract int kretanje();
    
    public static void ispisiKretanja(int naciniKretanja){
        if((naciniKretanja & HODA) == HODA)
            System.out.println("Hoda");
        if((naciniKretanja & PLIVA) == PLIVA)
            System.out.println("Pliva");
        if((naciniKretanja & LETI) == LETI)
            System.out.println("Leti");
        System.out.println();
    }
    
    

   
    
    
    
    
}
