class Member extends User {
    public Member(String name) {
        super(name);
    }

    @Override
    public void performRole() {
        System.out.println(getName() + " is borrowing/returning books.");
    }
}