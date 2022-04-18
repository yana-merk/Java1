class Animal {
    private static final int SWIM_NO = 0;
    public static final int SWIM_YES = 1;
    public static final int SWIM_FAIL = -1;

    private String type;
    private String name;
    private float run;
    private float swim;

    Animal(String type, String name, float run, float swim) {
        this.type = type;
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public float getRun() {
        return run;
    }

    public float getSwim() {
        return swim;
    }

    protected boolean run(float distance) {
        return (distance < run);
    }

    protected int swim(float distance) {
        return (distance < swim) ? SWIM_YES : SWIM_NO;
    }
}