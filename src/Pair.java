public class Pair <F,S>{

    public F ff;
    public S ss;

    public Pair(F ff, S ss){
        this.ff = ff;
        this.ss = ss;
    }

    public void setF(F ff){
        this.ff = ff;
    }

    public void setS(S ss){
        this.ss = ss;
    }
}