public class Playground {
    private static int level = 1;

    public void play() {
        switch (level) {
            case 1:
                System.out.println("Level 1");
                Bird red = new Red();
                Bird chuck = new Chuck();
                System.out.println("Available birds for level 1");
                System.out.println(red.getName());
                System.out.println(chuck.getName());
                break;
            default:
                System.out.println("End game");
        }
    }
}
