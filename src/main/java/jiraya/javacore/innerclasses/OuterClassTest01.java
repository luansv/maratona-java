package jiraya.javacore.innerclasses;

public class OuterClassTest01 {
    private String name = "Julia";

    class InnerClass{
        public void printOuterClassAttribute(){
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        OuterClassTest01 outerClass = new OuterClassTest01();
        InnerClass innerClass = outerClass.new InnerClass();
        innerClass.printOuterClassAttribute();

        InnerClass innerClass1 = new OuterClassTest01().new InnerClass();
        innerClass1.printOuterClassAttribute();

    }
}
