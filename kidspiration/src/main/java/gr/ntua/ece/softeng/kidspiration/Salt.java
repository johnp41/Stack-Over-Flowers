package gr.ntua.ece.softeng.kidspiration;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Salt {

    //public String SALT = new StringGenerator().randomgeneratedstring();


    public String hashed(String realpassword, String salt) {

        String saltedPassword = salt + realpassword;
        //System.out.println(saltedPassword);//gia testarisma
        String hashedPassword = generateHash(saltedPassword);//edw tregei ena algori8mo pou eftiksan magoi ths indias

        //System.out.println(hashedPassword);  //gia testarisma
        return hashedPassword;

    }

    //alogri8mos krypto ???biribiri tou mouxarabi
    public static String generateHash(String input) {
        StringBuilder hash = new StringBuilder();

        try {
            MessageDigest sha = MessageDigest.getInstance("SHA-1");
            byte[] hashedBytes = sha.digest(input.getBytes());
            char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                    'a', 'b', 'c', 'd', 'e', 'f' };
            for (int idx = 0; idx < hashedBytes.length; ++idx) {
                byte b = hashedBytes[idx];
                hash.append(digits[(b & 0xf0) >> 4]);
                hash.append(digits[b & 0x0f]);
            }
        } catch (NoSuchAlgorithmException e) {
            // handle error here.
        }

        return hash.toString();
    }




}
