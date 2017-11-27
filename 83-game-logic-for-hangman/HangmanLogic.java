public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess

        // if the letter has already been guessed, nothing happens
        if (this.guessedLetters.contains(letter)) {
            return;
        }

        // it the word does not contains the guessed letter, the number of faults increases
        if (!this.word.contains(letter)) {
            this.numberOfFaults++;
        }

        // the letter is added among the already guessed letters
        this.guessedLetters += letter;
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        // create the hidden word by iterating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in the hidden word
        // if the letter is not among the guessed ones, replace it with _ in the hidden word

        StringBuilder hiddenWord = new StringBuilder();

        for (int i = 0; i < this.word.length(); i++) {
            String letter = "" + this.word.charAt(i);
            if (this.guessedLetters.contains(letter)) {
                hiddenWord.append(letter);
            } else {
                hiddenWord.append('_');
            }
        }

        return hiddenWord.toString();
    }
}