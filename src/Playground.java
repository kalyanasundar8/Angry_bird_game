public class Playground {
    private static int level = 1;

    Bird red = new Red();
    Bird chuck = new Chuck();
    Bird bomb = new Bomb();

    public void play(String response) {
        if (response.equals("start")) {
            System.out.println("Level: " + level);
        }

        System.out.println(red.getName());
        System.out.println(chuck.getName());
        System.out.println(bomb.getName());
    }
}
