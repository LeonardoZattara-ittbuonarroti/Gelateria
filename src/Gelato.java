public class Gelato {
    int palline;
    String[] gusti;

    public Gelato(int palline){
        this.palline = palline;
        gusti = new String[palline];
    }
    public float prezzo(){
        return (float) (1+(0.5*palline)); 
    }
}
