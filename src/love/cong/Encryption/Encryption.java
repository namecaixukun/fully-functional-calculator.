package love.cong.Encryption;

import java.security.*;
import java.util.Base64;

public class Encryption {
    public static void Encryption(){
        try{
            KeyPairGenerator KeyPair =KeyPairGenerator.getInstance("RSA");//获取加密算法
            KeyPair.initialize(2048);//设置生成密钥大小
            KeyPair Key = KeyPair.generateKeyPair(); //生成密钥对

            PublicKey PubilcKey = Key.getPublic();// 获取公钥
            PrivateKey privateKey = Key.getPrivate();//

            System.out.println("Public key:" + Base64.getEncoder().encodeToString(PubilcKey.getEncoded()));
            System.out.println("Private key:" + Base64.getEncoder().encodeToString(privateKey.getEncoded()));

            //获取哈希加密算法并加密代码内容
            MessageDigest hash = MessageDigest.getInstance("SHA-256");
            byte[] dome = hash.digest("Hello world".getBytes());
            System.out.println("SHA-256: " + Base64.getEncoder().encodeToString(dome));


        } catch (NoSuchAlgorithmException e) {
            System.out.println("ERROR");
            throw new RuntimeException(e);
        }

    }
}
