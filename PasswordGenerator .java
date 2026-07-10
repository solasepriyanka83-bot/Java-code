public class PasswordGenerator {
    public static void main(String[] args) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        String password = "";

        for (int i = 0; i < 8; i++) {
            int index = (int)(Math.random() * chars.length());
            password += chars.charAt(index);
        }

        System.out.println("Password: " + password);
    }
}
