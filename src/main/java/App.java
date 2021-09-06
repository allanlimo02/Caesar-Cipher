import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Declaration declare=new Declaration();

        try {
            Cipher Cipher = new Cipher();
            Scanner scan = new Scanner(System.in);

            System.out.println("Hey! Select what we can do for you today? \n Select 1 for Encryption or 2 for Decryption");
            int optionMain = scan.nextInt();

            if (optionMain == 1) {
                System.out.println("Awesome! now input your encryption key");
                int encryptingKey = scan.nextInt();
                    if (encryptingKey>26){
                        System.out.println(">> OPPS!!! Select an Encryption key less than 26 << ");
                    }else{
                        System.out.println("Great! Now Input text to be encrypted");
                        String tobeEncoded = scan.next();
                        String encodedFinal= new Cipher().Encode(tobeEncoded, encryptingKey);
                        System.out.println("Your encoded Message is >> \n"+encodedFinal);
                    }


            } else if (optionMain == 2) {
                System.out.println("Awesome! now input your encryption key");
                int decryptingKey = scan.nextInt();
                if (decryptingKey>26){
                    System.out.println(">> OPPS!!! Select an Encryption key less than 26 <<");
                }else{
                    System.out.println("Great! now input the message");
                    String tobeDecoded = scan.next();


                    String decodedFinal=Cipher.decode(tobeDecoded,decryptingKey);
                    System.out.println("Your decoded Message is \n >> "+decodedFinal);

                }

            } else if (optionMain == 3) {
                System.out.println("Opps! You exited our application ");
            } else
                System.out.println(">>OPPS! INVALID INPUT<<");
        }
         catch (Exception exception) {
            exception.printStackTrace();
        }
    }


 }
