package listaTresQuestaoSete;

public class RegistroVisita {
    
    private int andar;
    private int entraram;
    private int sairam;

    public RegistroVisita(int andar, int entraram, int sairam) {
        this.andar = andar;
        this.entraram = entraram;
        this.sairam = sairam;
    }

    public int getAndar() { return andar; }
    public int getEntraram() { return entraram; }
    public int getSairam() { return sairam; }

    public String toString() {
        return "Andar " + andar + " (Entraram: " + entraram + ", Saíram: " + sairam + ")";
    }
}