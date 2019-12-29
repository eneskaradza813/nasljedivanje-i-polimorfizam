package vjezba8;

public class Vjezba8 {

    public static void main(String[] args) {

        Zivotinja niz[]=
        {
            new Pas("Max", "Labrador"),
            new Riba("Nemo", "riba klovn"),
            new Ptica("Tweety"),
            new ZlatniRetriever("Zak"),
            new Riba("Pongo"),
            new Pas("Lee")
        };
        
        int i = 1;
        for(Zivotinja z : niz ){
            System.out.println((i++)+"."+z);
            Zivotinja.ispisiKretanja(z.kretanje());
            z.oglasiSe();
            System.out.println();
        }
        
        
        
    }

}
