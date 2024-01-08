public class RecordPatternsSwitch {
    public static void main(String[] args) {
        var obj = new User("carlos", "12345", "carlosfrtr@gmail.com");

        // Before - Java 17
        switch (obj) {
            case User user -> System.out.printf("%s, %s, %s%n", user.username(), user.password(), user.email());
        }

        // After - Java 21
        switch (obj) {
            case User(String username, String password, String email) -> System.out.printf("%s, %s, %s%n", username, password, email);
        }

    }
}