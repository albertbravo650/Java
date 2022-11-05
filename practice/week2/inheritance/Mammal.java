class Mammal {
    private boolean sleeping = false;
    
    public void regulateTemp() {
        System.out.println("My temperature is now just right.");
    }

    public void startSleeping() {
        sleeping = true;
        System.out.println("ZzZz");
    }

    public void stopSleeping() {
        sleeping = false;
        System.out.println("... weird dream");
    }

    public boolean isSleeping() {
        return sleeping;
    }
}