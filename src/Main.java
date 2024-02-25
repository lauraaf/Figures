public class Main {

    public static void main(String[] args) {
        Figura[] v = new Figura[4];

        v[0] = new Rectangle(5, 3);
        v[1] = new Cercle(5);
        v[2] = new Quadrat(5);
        v[3] = new TriangleEQ(8, 10);

        double res = suma(v);

        System.out.println("suma: " + res);

        print(v);

        sort(v);

        print(v);
    }

    private static double suma(Figura[] v) {
        //hem de recorre el vector v per fer la suma de totes les arees


    }

}

