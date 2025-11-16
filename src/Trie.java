import java.util.*;

public class Trie {
    private No raiz;

    public Trie() {
        raiz = new No();
    }

    private int procuraPosicao(char letra) {
        return letra - 97;
    }

    public void insert(String word) {
        int pos;
        No aux = raiz;

        word=word.toLowerCase();
        for(int i=0;i<word.length();i++) {
            pos=procuraPosicao(word.charAt(i));
            if(aux.getvLig(pos)==null) {
                aux.setvLig(pos, new No(word.charAt(i)));
            }
            aux = aux.getvLig(pos);
        }
        aux.setEnd(true);
    }

    public void show(){
        show_recursive_w(raiz, "");
    }

    private void show_recursive_w(No n, String word) {
        if(n!=null) {
            if(!word.equals("") || n.getLetter()!=0)
                word = word + n.getLetter();
            if(n.getEnd()){
                System.out.println(word);
            }
            for(int i=0;i<No.n;i++) {
                show_recursive_w(n.getvLig(i), word);
            }
        }
    }


    public void show_letters() {
        show_letters_l(raiz);
    }
    private void show_letters_l(No no) {
        if(no!=null){
            System.out.println(no.getLetter());
            for(int i = 0; i < No.n; i++) {
                show_letters_l(no.getvLig(i));
            }
        }
    }
}
