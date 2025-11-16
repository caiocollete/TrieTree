public class Main {
    public static void main(String[] args) {
        String[] dic = {
                "Bee",
                "Butterfly",
                "Bear",
                "Bird",
                "Sell",
                "Seller",
                "Sold",
                "Stock"
        };

        Trie trie = new Trie();
        for(int i = 0; i < dic.length; i++) {
            trie.insert(dic[i]);
        }

        //trie.show_letters();
        trie.show();
    }
}