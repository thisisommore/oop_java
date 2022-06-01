package FoodJDBC;

import java.sql.*;
import java.util.*;

public class FoodJDBC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            FoodItem food = new FoodItem();
            while (true) {
                System.out.print(
                        "\nSelect an operation \n" +
                                "[1] Add food item \n" +
                                "[2] Update price \n" +
                                "[3] Delete a food item \n" +
                                "[4] Get food details \n" +
                                "[5] Exit \n" +
                                "Enter your choice - ");

                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        food.getFoodDetails();
                        food.saveToDb();
                        break;
                    case 2:
                        food.updateFoodPrice();
                        break;
                    case 3:
                        food.deleteFoodRecord();
                        break;
                    case 4:
                        food.searchFood();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Invalid Choice");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class FoodItem {
    private String name;
    private String price;
    private String origin;
    Connection db;
    Scanner scanner;

    FoodItem() throws SQLException {
        scanner = new Scanner(System.in);
        String url = "jdbc:mysql://localhost:3306/canteen";
        String username = "root";
        String password = "root001";
        db = DriverManager.getConnection(url, username, password);
    }

    public void getFoodDetails() {
        System.out.print("Enter food item name - ");
        name = scanner.nextLine();
        System.out.print("Enter price - ");
        price = scanner.nextLine();
        System.out.print("Enter Country of origin - ");
        origin = scanner.nextLine();
    }

    public void saveToDb()
            throws SQLException {
        String sql = "insert into food values (?,?,?);";
        PreparedStatement stmt = db.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.setString(2, price);
        stmt.setString(3, origin);
        stmt.executeUpdate();
        System.out.println("Food inserted successfully");
        stmt.close();
    }

    // If old food name has mistakes this is method to be used
    public void updateFoodPrice()
            throws SQLException {
        System.out.print("Enter food name - ");
        String foodName = scanner.nextLine();
        System.out.print("Enter the new food price - ");
        String newFoodPrice = scanner.nextLine();
        String sql = "update student set price = ? where name = ?;";
        PreparedStatement stmt = db.prepareStatement(sql);
        stmt.setString(1, newFoodPrice);
        stmt.setString(2, foodName);
        if (stmt.executeUpdate() > 0) {
            System.out.println("Price updated");
        } else {
            System.out.println("Food item not found");
        }
        stmt.close();
    }

    public void deleteFoodRecord()
            throws SQLException {
        System.out.println("Enter the name of food");
        String inputname = scanner.nextLine();
        String sql = "delete from food where name = ?;";
        PreparedStatement stmt = db.prepareStatement(sql);
        stmt.setString(1, inputname);
        int i = stmt.executeUpdate();
        if (i > 0) {
            System.out.println("Food item deleted");
        } else {
            System.out.println("Food item not found");
        }
        stmt.close();
    }

    public void searchFood()
            throws SQLException {
        System.out.print("Enter Food Name - ");
        String inputname = scanner.nextLine();
        String sql = "select * from food where name=?";
        PreparedStatement stmt = db.prepareStatement(sql);
        stmt.setString(1, inputname);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            System.out.println(
                    "Food Name - " + rs.getString(1)
                            + "\nPrice - " + rs.getString(2)
                            + "\nOrigin - " + rs.getString(3));
        } else {
            System.out.println("Food not found");
        }
        stmt.close();
    }
}
