package StringExercise.SimpleRegEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Ex3 {

    public static void main(String[] args) {
        String s = "fffffgwy abqe faac 1234 jkjk";

        System.out.println(minSym(s));
    }
    static String minSym(String s){
        String[] words = s.split(" ");
        ArrayList<Word> words1 = new ArrayList<>();
        for (String word: words){
            String[] symbols = word.split("");
            Arrays.sort(symbols);
            int matches = 1;
            for (int i = 0; i < symbols.length - 1; i++) {
                if (!(symbols[i].equals(symbols[i + 1]))){
                        matches++;
                }
            }
            words1.add(new Word(word,matches));
        }
        words1.sort(new WordSort());
        System.out.println(words1.toString());
        return words1.get(0).word;
    }
}


class Word {
    String word;
    int uniqSim;

    public Word(String word, int uniqSim) {
        this.word = word;
        this.uniqSim = uniqSim;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", uniqSim=" + uniqSim +
                '}';
    }
}

class WordSort implements Comparator<Word> {
    @Override
    public int compare(Word word, Word t1) {
        return word.uniqSim - t1.uniqSim;
    }
}