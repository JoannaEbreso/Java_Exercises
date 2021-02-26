import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CeaserCipher {
    List<Character> alphabets = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');

    public String decode(String codedWord, int runningNumber) {
        char[] charactersInCodedWord = codedWord.toCharArray();
        String decodedWord = "";

        for (char character: charactersInCodedWord) {
            int positionOfCharacter;
            int temporaryIndexOfDecodedCharacter;
            int actualIndexOfDecodedCharacter;
            String decodedCharacter;

            positionOfCharacter = alphabets.indexOf(character);
            temporaryIndexOfDecodedCharacter = positionOfCharacter - runningNumber;
            if(temporaryIndexOfDecodedCharacter < 0){
                actualIndexOfDecodedCharacter = alphabets.size() + temporaryIndexOfDecodedCharacter;
                decodedCharacter = alphabets.get(actualIndexOfDecodedCharacter).toString();
                decodedWord += decodedCharacter;
            }
            else{
                actualIndexOfDecodedCharacter = temporaryIndexOfDecodedCharacter;
                decodedCharacter = alphabets.get(actualIndexOfDecodedCharacter).toString();
                decodedWord += decodedCharacter;
            }
        }
        return decodedWord;
    }
}
