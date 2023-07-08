public class User{
    public static void main(String[] args) {
        UserView view = new UserView();
        UserModel model = new UserModel("Masha", "kfjdh", "123456789");
        UserPresenter presenter = new UserPresenter(model, view);
        presenter.perfInf();
    }
}