abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    private double sub1, sub2, sub3;

    public A(double sub1, double sub2, double sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    @Override
    double getPercentage() {
        return (sub1 + sub2 + sub3) / 3;
    }
}

class B extends Marks {
    private double sub1, sub2, sub3, sub4;

    public B(double sub1, double sub2, double sub3, double sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    @Override
    double getPercentage() {
        return (sub1 + sub2 + sub3 + sub4) / 4;
    }
}

public class Main {
    public static void main(String[] args) {
        A studentA = new A(85, 90, 95);
        B studentB = new B(80, 75, 90, 85);

        System.out.println("Student A Percentage: " + studentA.getPercentage() + "%");
        System.out.println("Student B Percentage: " + studentB.getPercentage() + "%");
    }
}