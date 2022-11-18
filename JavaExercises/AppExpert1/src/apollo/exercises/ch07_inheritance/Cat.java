package apollo.exercises.ch07_inheritance;

public class Cat extends Animal{
    private boolean lovesCatNip;

    public Cat(double weight, String sex, boolean lovesCatNip) {
        super(weight, sex);
        this.lovesCatNip = lovesCatNip;
    }

    public boolean isLovesCatNip() {
        return lovesCatNip;
    }

    public void setLovesCatNip(boolean lovesCatNip) {
        this.lovesCatNip = lovesCatNip;
    }

    public Cat(double weight, String sex) {
        super(weight, sex);
    }

    @Override
    public void speak(){
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "lovesCatNip=" + super.toString() +
                '}';
    }
}
