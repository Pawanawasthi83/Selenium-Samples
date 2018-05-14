package com.selenium.myproject;
import java.nio.charset.StandardCharsets;
import java.util.Base64;


public class encodingDecoding {

	public static void main(String[] args) {

				
        final String encoded = Base64.getEncoder().encodeToString("Vivalv@1983".getBytes(StandardCharsets.UTF_8));
        System.out.println("Encoded Value is  ::" + encoded);
        
        
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        System.out.println("Decoded value is ::"+ new String(decodedBytes) + "\n") ;
	}

}
