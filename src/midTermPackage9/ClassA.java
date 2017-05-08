package midTermPackage9;

// 9. Create me a class called ClassA that contains 2 private double fields and
//    a default constructor. The constructor should default the values to zero.
//    Use encapsulation for both private fields. (10 points)

public class ClassA {
    private double field1;
    private double field2;

    ClassA(){
        field1 = 0;
        field2 = 0;
    }

    public double getField1() {
        return field1;
    }

    public void setField1(double field1) {
        this.field1 = field1;
    }

    public double getField2() {
        return field2;
    }

    public void setField2(double field2) {
        this.field2 = field2;
    }
}
