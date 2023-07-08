import java.util.Scanner;

public class UserView{
    Scanner iscan = new Scanner(System.in);

    public String getNam(){
        System.out.println("Введите Ваше имя ");
        return iscan.nextLine();
    }
    public String getLog(){
        System.out.println("Введите Ваш логин ");
        return iscan.nextLine();
    }

    public String getPas(){
        System.out.println("Введите Ваш пароль ");
        return iscan.nextLine();
    }
    public void displayInform(String name, String login, String password){
        System.out.println("Данные " + name +"\n"+ login+"\n"+ password);
    }

}