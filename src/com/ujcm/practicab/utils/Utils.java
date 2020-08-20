
package com.ujcm.practicab.utils;

import javax.swing.JOptionPane;

public class Utils {
    public static void addMessage(String msj){
        JOptionPane.showMessageDialog(null, msj);
    }
    public static boolean isNumeric(String doc){
        try {
            Integer.parseInt(doc);
            return true;
        } catch (Exception e) {
            System.err.println("Error:"+e);
            return false;
        }
    }
    public static boolean permitLength(String doc){
        if(doc.length()!=8||doc.length()>9){
            return false;
        }        
        return doc.length()==8;
    }
}
