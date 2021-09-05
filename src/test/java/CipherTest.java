import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CipherTest {


    @Test
    void encodeMethod() {
        Cipher cipher = new Cipher();
        assertEquals("aaa",cipher.decode("eee",5));

    }
}