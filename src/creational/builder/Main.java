package creational.builder;

public class Main {
   public static void main(String[] args) {
      MealBuilder mealBuilder = new MealBuilder();

      Meal vegMeal = mealBuilder.prepareVegMeal();
      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();

      System.out.println("Veg Meal");
      vegMeal.showItems();
      System.out.printf("Total: $%.2f \n", vegMeal.getTotalCost());
      System.out.println("===============================\n");

      System.out.println("Normal Meal");
      nonVegMeal.showItems();
      System.out.printf("Total: $%.2f \n", nonVegMeal.getTotalCost());
      System.out.println("===============================\n");
   }
}
