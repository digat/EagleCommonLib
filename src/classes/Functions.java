/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import static classes.Constants.FIX_LOCAL_MKT_DATE_FORMAT;
import static classes.Constants.FIX_TIMESTAMP_FORMAT;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Tareq
 */
public class Functions {

    public static String generateId(){
        try {
            SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
            byte[] bytes = new byte[8];
            random.nextBytes(bytes);
            return byteArrayToHex(bytes);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    private static String byteArrayToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            String theHex = Integer.toHexString(bytes[i] & 0xFF).toUpperCase();
            sb.append(theHex.length() == 1 ? "0" + theHex : theHex);
        }
        return sb.toString();
    }
    public static String getTransactTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                FIX_TIMESTAMP_FORMAT);
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

        return dateFormat.format(new Date(System.currentTimeMillis()));

    }
    public static String dateTimeToString(Date input) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                FIX_TIMESTAMP_FORMAT);
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

        return dateFormat.format(input);
    }    
    public static String dateToString(Date input) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                FIX_LOCAL_MKT_DATE_FORMAT);
        return dateFormat.format(input);
    }        
    public static Date StringToDate(String input) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(
                    FIX_LOCAL_MKT_DATE_FORMAT);
            return dateFormat.parse(input);
        } catch (ParseException ex) {
            return null;
        }
    }   
    public static Date StringToDateTime(String input) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(
                    FIX_TIMESTAMP_FORMAT);
            return dateFormat.parse(input);
        } catch (ParseException ex) {
            return null;
        }
    }   

}
