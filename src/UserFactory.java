class UserFactory {
    public static User createUser(String type, String name) {
        if ("Admin".equalsIgnoreCase(type)) {
            return new Admin(name);
        } else if ("Member".equalsIgnoreCase(type)) {
            return new Member(name);
        }
        throw new IllegalArgumentException("Invalid user type");
    }
}