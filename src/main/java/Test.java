import model.AppUser;

public class Test {
    public static void main(String[] args) {
        AppUser Mark = AppUser.AppUserBuilder
                .getBuilder()
                .login("Mark")
                .email("m@m.pl")
                .password("Pass")
                .build();
    }
}
