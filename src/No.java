public class No {
    public final static int n = 27;
    private char letter;
    private No[] vLig;

    private boolean end;

    public No() {
        vLig = new No[n];
        end = false;
        letter = 0;
    }

    public No(char letter) {
        this.letter = letter;
        vLig = new No[n];
        end = false;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public No getvLig(int pos) {
        return vLig[pos];
    }

    public void setvLig(int pos, No no) {
        this.vLig[pos] = no;
    }

    public boolean getEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }
}
