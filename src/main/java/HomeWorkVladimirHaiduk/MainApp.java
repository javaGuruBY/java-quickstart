package HomeWorkVladimirHaiduk;


import HomeWorkVladimirHaiduk.User.User;
import HomeWorkVladimirHaiduk.User.UserLoginService;

public class MainApp {
    public static void main(String[] args) {
        User user = new User("Vasya","1234");
        UserLoginService login = new UserLoginService();
        System.out.println("1я попытка"+login.login(user,"1233"));
        System.out.println(user.getCount());
        System.out.println("2я попытка"+login.login(user,"1233"));
        System.out.println(user.getCount());
        System.out.println("3я попытка"+login.login(user,"1233"));
        System.out.println(user.getCount());
        System.out.println(user.isUnlocked());
        System.out.println("4я попытка"+login.login(user,"1233"));
        System.out.println("блокировка "+user.isUnlocked());
        user.resetCount();
        System.out.println("блокировка "+user.isUnlocked());
        System.out.println("5я попытка "+login.login(user,"1233"));
        System.out.println("блокировка "+user.isUnlocked());


    }
}
