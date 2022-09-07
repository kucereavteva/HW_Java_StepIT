package L8_9HW.HW2;

public class Truck extends Vehicle {

    int cargocap;

    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargocap = c;
    }

    public int getCargo() {
        return cargocap;
    }

    public int putCargo(int c) {
        cargocap = c;
        return 0;
    }
}

