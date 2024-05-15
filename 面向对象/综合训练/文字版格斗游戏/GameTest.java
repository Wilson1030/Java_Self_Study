package 综合训练.文字版格斗游戏;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("Green", 100);
        Role r2 = new Role("Poole", 100);

        while (true) {
            r1.attack(r2);
            if (r2.getBlood() == 0) {
                System.out.println("K.O! " + r1.getName() + " Win!");
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println("K.O! " + r2.getName() + " Win!");
                break;
            }
        }
    }
}
