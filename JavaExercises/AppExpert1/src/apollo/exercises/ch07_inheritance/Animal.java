package apollo.exercises.ch07_inheritance;

public abstract class Animal {
    private double weight;
    private String sex;

    public Animal(double weight, String sex) {
        this.weight = weight;
        this.sex = sex;
    }

    abstract  public void speak();


    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", sex='" + sex + '\'' +
                '}';
    }
}
