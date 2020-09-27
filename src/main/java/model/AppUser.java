package model;

public class AppUser {

    private Long id;
    private String login;
    private String email;
    private String password;

    public AppUser() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static class AppUserBuilder {

        private Long id;
        private String login;
        private String email;
        private String password;

        public static AppUserBuilder getBuilder() {
            return new AppUserBuilder();
        }

        public AppUserBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public AppUserBuilder login(String login) {
            this.login = login;
            return this;
        }

        public AppUserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public AppUserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public AppUser build() {
            AppUser appUser = new AppUser();
            appUser.setId(this.id);
            appUser.setLogin(this.login);
            appUser.setPassword(this.password);
            appUser.setEmail(this.email);
            return appUser;
        }
    }
}
