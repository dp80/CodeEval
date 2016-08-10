package decryption;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Base64.Decoder;
import javax.crypto.spec.*;
import java.security.*;
import javax.crypto.*;


public class Main {

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
		// TODO Auto-generated method stub
		String KEY = "BHISOECRTMGWYVALUZDNFJKPQX";
		String MESSAGE = "012222 1114142503 0313012513 03141418192102 0113 2419182119021713 06131715070119";
		
		byte[] digits = MESSAGE.getBytes();
		/*	//Encryptions
			-Triple DES : users 3 individual keys with 56 bits each
			-RSA : pair of keys
			-Blowfish : split message into 64 bits and encrypts them individually
			-Twofish : one key needed to decrypt
			-AES : defactor encryption at the moment
			 
			//Encoding
			-Base64
			-Hex Encoding
			-Unicode Encoding
		*/
		
		SecureRandom sr = new SecureRandom(KEY.getBytes());
	      KeyGenerator kg = KeyGenerator.getInstance("Twofish");
	      kg.init(sr);
	      SecretKey sk = kg.generateKey();
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, sk);
		try {
			byte[] decrypted = cipher.doFinal(digits);
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
