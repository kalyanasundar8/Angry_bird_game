public abstract class Bird {
    private String name;
    private String color;
    private int power;
    private double speed;
    private String damage;
    private int level;

    abstract String getName();
}

class Red extends Bird {
    String name = "Red";
    String color = "red";
    int power = 50;
    double speed = 22.5;
    String damage = "Medium";
    int level = 1;

    @Override
    public String getName() {
        return name;
    }
}

class Chuck extends Bird {
    String name = "Chuck";
    String color = "yellow";
    int power = 20;
    double speed = 50.3;
    String damage = "Low";
    int level = 1;

    @Override
    public String getName() {
        return name;
    }
}

class Bomb extends Bird {
    String name = "Bomb";
    String color = "black";
    int power = 60;
    double speed = 10.3;
    String damage = "High";
    int level = 1;

    @Override
    public String getName() {
        return name;
    }
}