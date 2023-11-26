package Lesson31;

class RailwayWheel {
    public void specificType() {
        System.out.println("Unusual type of wheels detected");
    }
}

interface wheelConverter {
    void request();
}

class Adapter implements wheelConverter {
    private RailwayWheel railwayWheel;

    public Adapter(RailwayWheel railwayWheel) {
        this.railwayWheel = railwayWheel;
    }

    @Override
    public void request() {
        railwayWheel.specificType();
    }
}
public class AdapterClient {
    public static void main(String[] args) {
        RailwayWheel railwayWheel = new RailwayWheel();
        wheelConverter target = new Adapter(railwayWheel);
        target.request();
        System.out.println("Wheels are converted/adapted");
    }
}