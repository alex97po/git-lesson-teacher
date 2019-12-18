package stategy;

public class Encryption implements Test.Algorithm {
    public Test.Algorithm algorithm;

    public Encryption(Test.Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void setAlgorithm(Test.Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public String crypt(String text, String key) {
        return algorithm.crypt(text, key);
    }

}

