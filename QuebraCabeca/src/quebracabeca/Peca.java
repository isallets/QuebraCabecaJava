
package quebracabeca;

public abstract class Peca {
    private String borda;

    public Peca(String borda) {
        this.borda = borda;
    }

    public String getBorda() {
        return borda;
    }

    public void setBorda(String borda) {
        this.borda = borda;
    }


    
    public void encaixar(){
    }
    
}
