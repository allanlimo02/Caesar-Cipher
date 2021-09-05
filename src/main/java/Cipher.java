public class Cipher {
    Declaration declare=new Declaration();

    public String Encode(String inputTxt, int codeMain){
        inputTxt=inputTxt.toLowerCase();
        String encodedTxt="";
        for (int i = 0;i<inputTxt.length();i++){
            int charPosition=declare.getAlpha().indexOf(inputTxt.charAt(i));
            int newPosition= (charPosition+codeMain)%26;
            char encodeChar=declare.getAlpha().charAt(newPosition);
            encodedTxt=encodedTxt+encodeChar;
        }
        if(inputTxt==" "){
            encodedTxt=encodedTxt+" >><<";

        }
    return encodedTxt;
    }
    public  String decode(String inputCypher,int codeMain ){
        inputCypher=inputCypher.toLowerCase();
        String decodedTxt="";
        for (int i = 0;i<inputCypher.length();i++){
            int txtPosition=declare.getAlpha().indexOf(inputCypher.charAt(i));
            int newCharPosition= (txtPosition-codeMain)%26;
            if(newCharPosition<0){
                newCharPosition=declare.getAlpha().length()-newCharPosition;
            }

            char decodeChar=declare.getAlpha().charAt(newCharPosition);
            decodedTxt=decodedTxt+decodeChar;
        }
        return decodedTxt;
    }


}
