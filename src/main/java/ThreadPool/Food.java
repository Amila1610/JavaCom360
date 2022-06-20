package ThreadPool;

public class Food implements Runnable {

    String saltyDish;

    Food(String saltyDish) {
        this.saltyDish = saltyDish;
    }

    public String getSaltyDish() {
        return saltyDish;
    }

    @Override
    public void  run() {
        /*long currentTimeInMiliseconds = System.currentTimeMillis();
        long time = System.currentTimeMillis() - currentTimeInMiliseconds;
        long seconds = time / 1000;
        System.out.println("He needed: " + seconds + " seconds to get the job done(compute).");*/

        for (int i = 1; i <= 10; i++) {
            System.out.println( Thread.currentThread().getName() + " preparing + " + saltyDish);
        }
        System.out.println(saltyDish + " is ready for eat!");
    }
}