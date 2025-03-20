package interfaceexample;

public interface SampleInterface {
    //in interface all the variables are public static final
    public int abc = 100;//internally it converts to public final int abc=100;
    public static final int xyz=200;//both are final here - by default all the variables are final in the interface

    // public - accessible to all the classes
    // static - dont need create object call using name of interface or class directly
    // final  - variable name can not be changed

    public void demo();
    public abstract void demo2();//all the methods inside the interface are abstract by default

    public void demo4();
}
