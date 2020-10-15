class Count{
    String str;
    int words;
    int sentence;
    int letters;
    int vowels;
    int consonants;
    int symbols;
    Count (String str){
        this.str = str;
    }
    void counting () {
        for (int i = 0; i<str.length(); i++){
        char c = str.charAt(i);
        if (c=='.') sentence++;
        if (c >=32 && c<=64  ) symbols++;

        switch (c){
            case ' ':
            case '.':
            words ++;
        }
        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'Y':
            vowels++;

        }
        }
        letters = str.length() - symbols;
        consonants = str.length()- vowels - symbols;
        System.out.println("Number of words "+ words);
        System.out.println("Number of sentences "+ sentence);
        System.out.println("Number of vowels "+ vowels);
        System.out.println("Number of consonants "+ consonants);
        System.out.println("Number of letters "+ letters);

    }

}

public class Main {

    public static void main(String[] args) {
    String text = ("This should be a very long text. But it isn't.");
    Count text1 = new Count(text);
    text1.counting();
    }
}
