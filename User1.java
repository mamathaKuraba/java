public class User1 {
    private String name;
    private String role;
    private User1(String name, String role) {
        this.name = name;
        this.role = role;
    }
    public static User1 createAdmin(String name) {
        return new User1(name, "ADMIN");
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
    }
    public static void main(String[] args) {
        User1 admin = User1.createAdmin("MAMMU");
        admin.display();
    }
}