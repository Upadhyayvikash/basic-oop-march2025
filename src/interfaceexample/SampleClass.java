package interfaceexample;

public class SampleClass implements SampleInterface, SampleInterface2{

    @Override
    public void demo() {
        System.out.println("demo abstract interface method is implemented in SampleClass");
        System.out.println("abc interface value is : "+SampleInterface.abc);
    }

    @Override
    public void demo2() {
        //SampleInterface.abc=400;-final cannot be changed
        System.out.println("demo2 abstract interface method is implemented in SampleClass");
        System.out.println("xyz interface value is : "+SampleInterface.xyz);
    }

    @Override
    public void demo4() {
        // it is taken/@Override from SampleInterface not from SampleInterface2 because SampleInterface is first in sequence means first parent
    }

    @Override
    public void demo7() {

    }

    @Override
    public void demo3() {
        System.out.println("demo3 abstract interface method is implemented in SampleClass");
        System.out.println("pqr interface value is : "+SampleInterface2.pqr);
    }
}
