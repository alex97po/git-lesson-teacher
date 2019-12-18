public class Test {
    public static void main(String[] args) {
        String key = "key";
        String text = "text";
        int alg = 1;
        Encryption encryption = new Encryption((Algorithm) new DESAlgorithm());
        String cryptedText = encryption.crypt(text, key);


   //...
        boolean needToChange = true;
  //...
        if (needToChange)
            encryption.setAlgorithm((Algorithm) new RSAAlgorithm());
  //...

    }

   public interface Algorithm {
       String crypt(String text, String key);
   }

}

//  Strategy - набор взаимозаменяемых алгоритмов с единым интерфейсом;







