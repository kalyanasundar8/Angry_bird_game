public abstract class Pig {
    private String name;
    private String color;
    private int life;
    private int level;

    public Pig(String name, String color, int life, int level) {
        this.name = name;
        this.color = color;
        this.life = life;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getLife() {
        return life;
    }

    public int getLevel() {
        return level;
    }
}

class KingPig extends Pig {
    public KingPig() {
        super("KingPig", "Green", 100, 5);
    }
}

class CourtneyPig extends Pig {
    public CourtneyPig() {
        super("CourtneyPig", "Green", 50, 4);
    }
}

class GarryPig extends Pig {
    public GarryPig() {
        super("GarryPig", "Green", 30, 3);
    }
}

class BadPiggies extends Pig {
    public BadPiggies() {
        super("BadPiggies", "Green", 20, 2);
    }
}

class ZetaPig extends Pig {
    public ZetaPig() {
        super("ZetaPig", "Green", 10, 1);
    }
}