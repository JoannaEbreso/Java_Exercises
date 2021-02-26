import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CeaserCipher {
    List<Character> alphabets = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');

    public String decode(String codedWord, int runningNumber) {
        char[] charactersInCodedWord = codedWord.toCharArray();
        String decodedWord = "";

        for (char character: charactersInCodedWord) {
            int runningIndexOfDecodedCharacter;
            int actualIndexOfDecodedCharacter;
            String decodedCharacter;

            runningIndexOfDecodedCharacter = alphabets.indexOf(character) - runningNumber;
            if(runningIndexOfDecodedCharacter < 0){
                actualIndexOfDecodedCharacter = alphabets.size() + runningIndexOfDecodedCharacter;
                decodedCharacter = alphabets.get(actualIndexOfDecodedCharacter).toString();
                decodedWord += decodedCharacter;
            }
            else{
                actualIndexOfDecodedCharacter = runningIndexOfDecodedCharacter;
                decodedCharacter = alphabets.get(actualIndexOfDecodedCharacter).toString();
                decodedWord += decodedCharacter;
            }
        }
        return decodedWord;
    }
}
