public abstract class Bird {
    private String name;
    private String color;
    private int power;
    private double speed;
    private String damage;
    private int level;

    public Bird(String name, String color, int power, double speed, String damage, int level) {
        this.name = name;
        this.color = color;
        this.power = power;
        this.speed = speed;
        this.damage = damage;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }

    public double getSpeed() {
        return speed;
    }

    public String getDamage() {
        return damage;
    }

    public int getLevel() {
        return level;
    }

    public abstract void attack();
}

class Red extends Bird {
    public Red() {
        super("Red", "red", 30, 40.00, "Medium", 1);
    }

    @Override
    public void attack() {
        System.out.println("Red attack with medium damage");
    }
}

class Chuck extends Bird {
    public Chuck() {
        super("Chuck", "Yellow", 25, 80.05, "Medium", 1);
    }

    @Override
    public void attack() {
        System.out.println("Chuck attack with medium damage but very fast");
    }
}

class Bomb extends Bird {
    public Bomb() {
        super("Bomb", "Black", 95, 20.00, "High", 1);
    }

    @Override
    public void attack() {
        System.out.println("Bomb attack with high damage but very slow");
    }
}