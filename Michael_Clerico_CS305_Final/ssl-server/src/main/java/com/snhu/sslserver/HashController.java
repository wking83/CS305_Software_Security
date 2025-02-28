package com.snhu.sslserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class HashController {
    
    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
    
    private static final Logger logger = Logger.getLogger(HashController.class.getName());

    private String getHash(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }

        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] messageDigestSHA256 = messageDigest.digest(input.getBytes(StandardCharsets.UTF_8));
            return bytesToHex(messageDigestSHA256);
        } catch (NoSuchAlgorithmException e) {
            logger.log(Level.SEVERE, "Hashing algorithm not found", e);
            return "Error: Unable to generate hash.";
        }
    }

    private static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }

    @GetMapping("/hash")
    public String myHash(@RequestParam(value = "data", defaultValue = "Default Check Sum!") String data) {
        String hash = getHash(data);
        return "<p>Data: " + data + "</p><p>Name of Cipher Algorithm Used: SHA-256 Value: " + hash + "</p>";
    }
}
