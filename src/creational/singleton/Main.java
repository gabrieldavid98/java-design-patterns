package creational.singleton;

public class Main {
   public static void main(String[] args) {

      User currentUser = User.getInstance();

      currentUser.setName("Gabriel");
      currentUser.setEmail("gabriel@abc.com");

      User anotherUser = User.getInstance();

      System.out.println(currentUser);
      System.out.println(anotherUser);
      System.out.println(User.getInstance());
      System.out.println(User.getInstance());
      System.out.println(User.getInstance());
      System.out.println(User.getInstance());

      System.out.println();
      System.out.println(User.getInstance().getName());
      System.out.println(User.getInstance().getEmail());
   }
}
