public class Cipher {
    Declaration declare = new Declaration();

    public String transformBeforeEncoding(String inputTxt, int codeMain) {
        String finalString = "";

        if (inputTxt.contains(" ")) {
            String[] arrayVal = inputTxt.split(" ");
            for (int i = 0; i <= arrayVal.length - 1; i++) {
                String encodedString = encode(arrayVal[i], codeMain);
                finalString = finalString.concat(encodedString).concat(" ");
            }
        } else {
            finalString = encode(inputTxt, codeMain);
        }
        return finalString;

    }

    //
    public String encodeFinalTrial(String phrase, int key) {
        String finalEncoded = "";
        char[] newArr = phrase.toCharArray();
        for (char newChars : newArr) {
            newChars += 5;
            finalEncoded = finalEncoded + newChars;
        }
        return finalEncoded;

    }
    //

    public String transformBeforeDecoding( String decodingString, int key){
        String finalString="";

        if (decodingString.contains(" ")){
            String[] arrayVal=decodingString.split(" ");
            for(int i=0;i<=arrayVal.length;i++){
                String decodedString=decode(arrayVal[i],key);
                finalString=finalString.concat(decodedString).concat(" ");
            }

        }else{
            finalString=decode(decodingString,key);
        }
        return finalString;
    }
    // Public method to test    transformBeforeDecoding

    //encoding main class

    public String encode(String inputTxt, int codeMain) {
        inputTxt = inputTxt.toLowerCase();
        String encodedTxt = "";
        for (int i = 0; i < inputTxt.length(); i++) {
            int charPosition = declare.getAlpha().indexOf(inputTxt.charAt(i));
            int newPosition = (charPosition + codeMain) % 26;
            char encodeChar = declare.getAlpha().charAt(newPosition);
            encodedTxt = encodedTxt + encodeChar;
        }

        return encodedTxt;
    }
    //Decoding main function
    public String decode(String inputCypher, int codeMain) {
        inputCypher = inputCypher.toLowerCase();
        String decodedTxt = "";
        for (int i = 0; i < inputCypher.length(); i++) {
            int txtPosition = declare.getAlpha().indexOf(inputCypher.charAt(i));
            int newCharPosition = (txtPosition - codeMain) % 26;
            if (newCharPosition < 0) {
                newCharPosition = declare.getAlpha().length() - newCharPosition;
            }
            char decodeChar = declare.getAlpha().charAt(newCharPosition);
            decodedTxt = decodedTxt + decodeChar;
        }
        return decodedTxt;
    }



//    public static void main(String[] args) {
//
//        String name="Allan Limo";
//        int key= 5;
//        String money=new Cipher transformBeforeEncoding (name,key);
//       // new Cipher().encodeFormatBeforeEncoding("michelle ngetich", 1);
//        System.out.println("Your encoded message is>> "+money);
//
//
//    }





}
