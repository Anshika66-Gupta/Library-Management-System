public abstract class User {
    private final String name; // Made final

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void performRole();
}
