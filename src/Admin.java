class Admin extends User {
    public Admin(String name) {
        super(name);
    }

    @Override
    public void performRole() {
        System.out.println(getName() + " is managing the library.");
    }
}