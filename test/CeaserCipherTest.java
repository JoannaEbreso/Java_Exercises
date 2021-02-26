import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeaserCipherTest {

    CeaserCipher ceaserCipherObject;

    @BeforeEach
    void setUp() {
        ceaserCipherObject = new CeaserCipher();
    }

    @Test
    void testThatWeCanDecodeACodedString(){
        String codedWord = "yrkkv";
        String decodedWord = ceaserCipherObject.decode(codedWord,6);

        assertEquals("sleep",decodedWord);
    }
}