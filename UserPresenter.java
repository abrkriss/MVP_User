public class UserPresenter{
    UserModel model;
    UserView view;

    public UserPresenter(UserModel model, UserView view){
        this.model = model;
        this.view = view;
    }

    public void perfInf(){
        String name = view.getNam();
        String login = view.getLog();
        String password = view.getPas();
         model.toString(name, login, password);
         view.displayInform(name, login, password);

    }
    
}