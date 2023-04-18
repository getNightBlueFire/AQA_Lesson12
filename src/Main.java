import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HashSet<User> users = db();

        User o = login();
        boolean contains = users.contains(o);

        if (contains){
            Iterator<User> iterator = users.iterator();
            while (iterator.hasNext()) {

                User next = iterator.next();
                if (next.equals(o)) {
                    System.out.println("I was found");
                    System.out.println(next);
                }

            }
        }


    }

    private static User login() {
        Scanner scanner = new Scanner(System.in);

        String login = scanner.nextLine();
        String password = scanner.nextLine();

        User o = new User(new Basket(new ArrayList<>()), login, password);
        return o;
    }

    private static HashSet<User> db() {
        Product product1 = new Product("product1", 5.1f, 5.0f);
        Product product2 = new Product("product2", 5.4f, 4.1f);
        Product product3 = new Product("product3", 5.7f, 2.3f);
        Product product4 = new Product("product4", 5.4f, 4.0f);
        Product product5 = new Product("product5", 5.1f, 4.2f);

        Category category1 = new Category("sales", List.of(product1, product2, product3));
        Category category2 = new Category("phone", List.of(product4, product5));

        Basket basket1 = new Basket(List.of(product1, product1, product1, product5, product3));
        Basket basket2 = new Basket(List.of(product4, product4, product1, product5, product3));
        Basket basket3 = new Basket(List.of(product1, product1, product5, product5, product3, product2, product2));

        User user1 = new User(basket1, "dima", "1111");
        User user2 = new User(basket2, "inna", "1234");
        User user3 = new User(basket3, "anna", "0000");

        HashSet<User> users = new HashSet<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        return users;
    }


}