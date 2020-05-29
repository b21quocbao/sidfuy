public class PTB2 {
    double a, b, c;

    void setA(double a) {
        this.a = a;
    }

    void setB(double b) {
        this.b = b;
    }

    void setC(double c) {
        this.c = c;
    }

    void getSolution() {
        if (a == 0) {
            if (b == 0) {
                displaySolution("Vo nghiem");
            } else {
                displaySolution("Co 1 nghiem " + (- c / b));
            }
        }
        double d = b * b - 4 * a * c;
        if (d > 0) {
            displaySolution("Phuong trinh co 2 nghiem " + (- b - d) / 2 / a + ", " + (- b + d) / 2 / a);
        } else if (d == 0) {
            displaySolution("Phuong trinh co 1 nghiem " + - b / 2 / a);
        } else {
            displaySolution("Phuong trinh vo nghiem");
        }
    }

    void displaySolution(String S) {
        System.out.println(S);
    }
}
