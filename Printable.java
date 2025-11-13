interface Printable {
    void print();
}

interface Showable {
    void show();
}

interface Document extends Printable, Showable {
    void read();
}

class Report implements Document {
    public void print() {
        System.out.println("Printing report...");
    }

    public void show() {
        System.out.println("Showing report details...");
    }

    public void read() {
        System.out.println("Reading report...");
        System.out.print("Himanshu Saini 24csu350");
    }
}

public class MultipleInterfaceExtension {
    public static void main(String[] args) {
        Report r = new Report();
        r.print();
        r.show();
        r.read();
    }
}
