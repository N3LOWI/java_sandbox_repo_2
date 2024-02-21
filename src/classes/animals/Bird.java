package classes.animals;

public class Bird extends Animal {
    public String getBirdSound() {
        return birdSound;
    }
    public void setBirdSound(String birdSound) {
        this.birdSound = birdSound;
    }

    private String birdSound;
    @Override
    protected void name() {
        System.out.println("Bird");
    }

    @Override
    protected void sound() {
        System.out.println(birdSound);
    }
}
