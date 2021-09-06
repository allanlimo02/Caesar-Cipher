public class Cipher {
    Declaration declare = new Declaration();
    public  String encodeFormatBeforeEncoding(String encodingString, int key) {
        String finalString = "";

        if (encodingString.contains(" ")) {
            String[] arrayVal = encodingString.split(" ");
            for (int i = 0; i <= arrayVal.length - 1; i++) {
                String encodedString = encode(arrayVal[i], key);
                finalString = finalString.concat(encodedString).concat(" ");
            }
        } else {
            finalString = encode(encodingString, key);
        }
        return finalString;

    }
    //
    public String encodeFormatBeforeDecoding( String decodingString, int key){
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



    public static void main(String[] args) {

        String name="Allan Limo";
        int key= 5;
        String money=new Cipher().encodeFormatBeforeEncoding(name,key);
       // new Cipher().encodeFormatBeforeEncoding("michelle ngetich", 1);
        System.out.println("Your encoded message is>> "+money);


    }





}
