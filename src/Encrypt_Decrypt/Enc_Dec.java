package Encrypt_Decrypt;

import java.util.HashMap;

public class Enc_Dec {
	
	private Enc_Dec() {}

    public static HashMap<String,String> HM = new HashMap<String,String>();

    //*******************************************************************
    public static String encryption(String Text){

        String CCE = Caesar_Cipher_encryption(Text);
        String EncryptedText = Hash_Map_encryption(CCE);

        return EncryptedText;
    }
    //*******************************************************************
    public static String decryption(String Text){

        String CCD = Hash_Map_decryption(Text);
        String DecryptedText = Caesar_Cipher_decryption(CCD);

        return DecryptedText;
    }
    //*******************************************************************
    public static String Caesar_Cipher_encryption(String Text){

        String CipherText = "";

        for(int i=0; i<Text.length(); i++){
            if(Text.charAt(i) == ' '){
                CipherText += (char)(125);
            }
            else {
                int c = (int) Text.charAt(i);
                CipherText += (char)(c + 1);
            }
        }
        return CipherText;
    }

    //*******************************************************************
    public static String Caesar_Cipher_decryption(String CipherText){

        String CipherDecryption = "";

        for(int i=0; i<CipherText.length(); i++){
            if(CipherText.charAt(i) == '}'){
                CipherDecryption+=" ";
            }
            else {
                int c = (int) CipherText.charAt(i);
                CipherDecryption += (char) (c - 1);
            }
        }
        return CipherDecryption;
    }
    //*******************************************************************
    public static String Hash_Map_encryption(String Text){

        String EncryptedText = "";

        for(int i=0;i<Text.length();i++){

            String temp = "" + Text.charAt(i);
            EncryptedText += HM.get(temp);
        }
        return EncryptedText;
    }
    //*******************************************************************
    public static String Hash_Map_decryption(String Text){

        String DecryptedText = "";
        boolean cond;

        for(int i=0; i<=(Text.length()-1); i=i+2){
            cond=true;
            String temp = "" + Text.charAt(i) + Text.charAt(i + 1);

            for(int x=97;x<124;x++) {

                String st = "" + (char)x;
                String st1 = "" + (char)(x-32);

                if (temp.equals(HM.get(st))) {
                    DecryptedText += st;
                }
                else if (temp.equals(HM.get(st1))) {
                    DecryptedText += st1;
                }
                else if (temp.equals("8&")&&cond==true) {
                    DecryptedText += '}';
                    cond=false;
                }
            }
        }
        return DecryptedText;
    }
    //*******************************************************************
    public static void SetHashMap(){
        HM.put("a","!@");HM.put("b","@#");HM.put("c","#$");HM.put("d","$%");HM.put("e","%^");HM.put("f","^&");
        HM.put("g","!!");HM.put("h","*(");HM.put("i","()");HM.put("j",")_");HM.put("k","_+");HM.put("l","<>");
        HM.put("m",">?");HM.put("n","{}");HM.put("o","<:");HM.put("p","!#");HM.put("q","@$");HM.put("r","#%");
        HM.put("s","$^");HM.put("t","%&");HM.put("u","^*");HM.put("v","&(");HM.put("w","*)");HM.put("x","(_");
        HM.put("y",")+");HM.put("z","@!");HM.put("{","`_");HM.put("}","8&");HM.put("A","`1");HM.put("B","`3");
        HM.put("C","`6");HM.put("D","`0");HM.put("E","!9");HM.put("F","!5");HM.put("G","!3");HM.put("H","$5");
        HM.put("I","$2");HM.put("J","%6");HM.put("K","!0");HM.put("L","*9");HM.put("M","&5");HM.put("N","(2");
        HM.put("O","_4");HM.put("P","_5");HM.put("Q","_1");HM.put("R","=4");HM.put("S","+5");HM.put("T","-5");
        HM.put("U","^8");HM.put("V","^4");HM.put("W","^2");HM.put("X","'2");HM.put("Y","/1");HM.put("Z","/4");
        HM.put("[","?4");
    }
}