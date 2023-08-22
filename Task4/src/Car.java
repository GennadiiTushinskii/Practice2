public class Car {
    private String carModel;

    public Car(String carModel) {
        this.carModel = carModel;
    }

    private class Engine{
        private boolean isWorkking = false;
        private int horsepower;

        public Engine(int horsepower) {
            this.horsepower = horsepower;
        }

        public String startStopEngine() {
            if (isWorkking){
                isWorkking = false;
                return "engine was stopped";
            } else {
                isWorkking = true;
                return "engine was started";
            }
        }
    }
}
