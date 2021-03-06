package com.supcon.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/**
 * MD5
 * MD5加密算法
 * @author Liyl
 * @date 2016/4/19
 */
public class MD5 {
    /**
     * @param str
     * @return
     * @Description: 32位小写MD5
     */
    public static String parseStrToMd5L32(String str){
        String reStr = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] bytes = md5.digest(str.getBytes("UTF-8"));
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bytes){
                int bt = b&0xff;
                if (bt < 16){
                    stringBuffer.append(0);
                }
                stringBuffer.append(Integer.toHexString(bt));
            }
            reStr = stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reStr;
    }

    /**
     * @param str
     * @return
     * @Description: 32位大写MD5
     */
    public static String parseStrToMd5U32(String str){
        String reStr = parseStrToMd5L32(str);
        if (reStr != null){
            reStr = reStr.toUpperCase();
        }
        return reStr;
    }
//
//    /**
//     * @param str
//     * @return
//     * @Description: 16位小写MD5
//     */
//    public static String parseStrToMd5U16(String str){
//        String reStr = parseStrToMd5L32(str);
//        if (reStr != null){
//            reStr = reStr.toUpperCase().substring(8, 24);
//        }
//        return reStr;
//    }
//
//    /**
//     * @param str
//     * @return
//     * @Description: 16位大写MD5
//     */
//    public static String parseStrToMd5L16(String str){
//        String reStr = parseStrToMd5L32(str);
//        if (reStr != null){
//            reStr = reStr.substring(8, 24);
//        }
//        return reStr;
//    }
}
