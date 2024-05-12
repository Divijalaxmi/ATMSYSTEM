public class App {
    public static void main(String[] args) throws Exception {
        MachineFeatures machine = new MachineFeatures();
        Location location = new Location("India", "202001", "Andhra Pradesh", "Chirala", "South", "MainRoad Jandrapet");
        CurrencyComposition composition = new CurrencyComposition(500, 500, 1000, 100, 200);
        User user = new User("Ajay", 123456, "534950638109", 673, 20000, 07, 2029);
        Atm atm = new Atm("12349", location, composition);

        machine.checkUserBalance(user);
        //machine.withdraw(atm, user, 2000);
        machine.seeComposition(composition);
        machine.createAtm(location, composition);
        composition = new CurrencyComposition(3, 5, 100, 5, 10);
        machine.updateATMLocation(atm,location);
        machine.updateATMComposition(atm, composition);
        machine.seeComposition(composition);

        machine.withdraw(atm, user, 2000);
    }
}
