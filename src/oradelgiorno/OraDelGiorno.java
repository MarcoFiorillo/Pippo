package oradelgiorno;


//prova 123
public class OraDelGiorno {

        
    private int ore;
    private int minuti;

    public OraDelGiorno(int ore) {
        setOre(ore < 0 || ore > 24 ? 0 : ore);
        setMinuti(0);
    }

    public OraDelGiorno(int ore, int minuti) {
        this(ore);
        setMinuti(minuti < 0 || minuti > 59 ? 0 : minuti);
    }

    public int getOre() {
        return ore;
    }

    private void setOre(int ore) {
        this.ore = ore;
    }

    public int getMinuti() {
        return minuti;
    }

    private void setMinuti(int minuti) {
        this.minuti = minuti;
    }
    
}
