
package quebracabeca;

public abstract class Peca {
    private int borda;

    public Peca(int borda) {
        this.borda = borda;
    }

    public int getBorda() {
        return borda;
    }

    public void setBorda(int borda) {
        this.borda = borda;
    }


    
    public void encaixar(){
    }
    
}
