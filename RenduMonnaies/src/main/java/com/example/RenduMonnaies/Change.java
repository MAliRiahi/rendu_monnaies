package com.example.RenduMonnaies;

public class Change {
    protected long piece2 ;
    protected long billet5 ;
    protected long billet10 ;

    public long getPiece2() {
        return piece2;
    }

    public void setPiece2(long piece2) {
        this.piece2 = piece2;
    }

    public long getBillet5() {
        return billet5;
    }

    public void setBillet5(long billet5) {
        this.billet5 = billet5;
    }

    public long getBillet10() {
        return billet10;
    }

    public void setBillet10(long billet10) {
        this.billet10 = billet10;
    }

    @Override
    public String toString() {
        return "Change{" +
                "piece2=" + piece2 +
                ", billet5=" + billet5 +
                ", billet10=" + billet10 +
                '}';
    }
}
