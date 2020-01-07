package builders.lombok;

/**
 * Demonstracja buildera wygenerowanego przez Lombok
 */
public class Demo {
    public static void main(String[] args) {
        Entity.EntityBuilder builder = Entity.builder().name("ADAM");
        Entity obj1 = builder.name("ALA").points(100).build();
        Entity obj2 = builder.points(200).build();
    }
}
