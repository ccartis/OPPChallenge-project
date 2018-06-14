public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("White","Deluxe", "Sausage & Bacon", 13.43);
        super.addHamburgerAddition1("Chips",2.43);
        super.addHamburgerAddition2("Drink",1.32);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot not add additional items to a delux burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        super.addHamburgerAddition2(name, price);
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        super.addHamburgerAddition3(name, price);
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        super.addHamburgerAddition4(name, price);
    }
}
