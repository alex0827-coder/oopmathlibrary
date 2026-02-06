package oopactivity;
public class subclasss {
    private double v1, v2;

    public void setValues(double a, double b) {
        this.v1 = a;
        this.v2 = b;
    }

    public double getV1() { return v1; }
    public double getV2() { return v2; }

    public double calculate() { return 0; }
}

class Addition extends subclasss {
    public double calculate() { return getV1() + getV2(); }
}
class Subtraction extends subclasss {
    public double calculate() { return getV1() - getV2(); }
}
class Multiplication extends subclasss {
    public double calculate() { return getV1() * getV2(); }
}
class Division extends subclasss {
    public double calculate() {
        if (getV2() == 0) {
            System.out.println("Math Error: Cannot divide by zero");
            return 0;
        }
        return getV1() / getV2();
    }
}

class RectangleArea extends subclasss {
    public double calculate() { return getV1() * getV2(); }
}
class CircleArea extends subclasss {
    public double calculate() { 
        return 3.14159 * (getV1() * getV1()); 
    }
}


class EvenOddCheck extends subclasss {
    public double calculate() { 
        // Returns 1 for Even, 0 for Odd
        return (getV1() % 2 == 0) ? 1 : 0; 
    }
}