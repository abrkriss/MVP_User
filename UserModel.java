public class UserModel{
    private String name;
    private String login;
    private String password;

    UserModel(String name, String login, String password){
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    

}