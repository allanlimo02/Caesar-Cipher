import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CipherTest {


    @Test
    void encodeMethod() {
        Cipher cipher = new Cipher();
        assertEquals("fqqfs",cipher.decode("allan",5));
    }

    @Test
    void decodeMethod() {
        Cipher cipher = new Cipher();
        assertEquals("allan",cipher.decode("fqqfs",5));
    }

    @Test
    void encodeFinalTrial() {
        Cipher cipher = new Cipher();
        assertEquals("Allan Limo",cipher.decode("Fqqfs%Qnrt",5));
    }
}