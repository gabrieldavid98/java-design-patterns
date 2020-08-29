package creational.singleton;

public class User {
   private static User userInstance;

   private String name;
   private String email;

   private User() {}

   public static User getInstance() {
      if (userInstance != null) {
         return userInstance;
      }

      userInstance = new User();
      return userInstance;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }
}
