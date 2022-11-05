class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.regulateTemp();
        h.startSleeping();
        h.goToWork();
        // h.stopSleeping();

        boolean sleeping = h.isSleeping();
        System.out.println(sleeping);

        if(sleeping) {
            System.out.println("The human is sleeping!");
        }
    }
}