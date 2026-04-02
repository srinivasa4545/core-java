class BusSimulatorRunner {
    public static void main(String[] args) {

        BusSimulator b1 = new BusSimulator("KSRTC Express", "mandya to maddur", 25);
        b1.display();

        BusSimulator b2 = new BusSimulator("VRL Travels", "sollepura to mandya", 60);
        b2.display();

        BusSimulator b3 = new BusSimulator("ashvameda", "mandya to maraliga", 40);
        b3.display();

        BusSimulator b4 = new BusSimulator("Private Bus", "mandya to mysore", 55);
        b4.display();

        BusSimulator b5 = new BusSimulator("City Bus", "maddur to sollepura", 20);
        b5.display();

        BusSimulator b6 = new BusSimulator("Sleeper Bus", "maddur to hoskere ", 1200);
        b6.display();

        BusSimulator b7 = new BusSimulator("Volvo Bus", "bangalore to mysore", 900);
        b7.display();

    }
}