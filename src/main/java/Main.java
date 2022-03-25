import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Olympian[] olympians = new Olympian[]{
                new Robot(124, 123),
                new Human(12, 12),
                new Cat(100, 12)
        };
        Barrier[] barriers = {
               new Wall(121),
                new Wall(124),
                new Wall(122)
        };
        for (Barrier barrier : barriers) {
            for (Olympian olympian : olympians) {
                barrier.overCome(olympian);
            }
        }
    }
}