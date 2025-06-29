package practice;

class User {
    protected String password;
    protected String email;
    protected String name;
    protected String passwordConfirm;

    protected User(String password, String email) {
        this.password = password;
        this.email = email;
    }

    public void login() {
        if (password.equals(email)) {
            System.out.println("Ты вошел");
        }
    }

    public void register(String name, String password, String email, String passwordConfirm) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.passwordConfirm = passwordConfirm;

        if (name.isEmpty() || email.isEmpty() || password.isEmpty() || passwordConfirm.isEmpty()) {
            System.out.println("Все поля должны быть заполнены!");
            return;
        }

        if (!password.equals(passwordConfirm)) {
            System.out.println("Не удача. Парол дожен совпадать!");
            return;
        }

        System.out.println(this.name + " зарегестировался по почте " + getEmail());
    }

    public void banUser(User user) {
        System.out.println("Админ забанил пользователя: " + user.getEmail());
    }

    public String getEmail() {
        System.out.println(this.email);;
        return this.email;
    }
}
