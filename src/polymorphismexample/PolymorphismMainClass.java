package polymorphismexample;

public class PolymorphismMainClass {
    public static void main(String[] args) {
        SampleClass sampleClass = new SampleClass();
        sampleClass.sum(12,13);
        sampleClass.sum(12, 13, 14);
        sampleClass.sum(8.45, 9.25);
        sampleClass.sum(8.45, 25);
        sampleClass.sum(5.88f, 9.55f);
    }
}
