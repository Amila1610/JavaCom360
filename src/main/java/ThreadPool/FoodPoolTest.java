package ThreadPool;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FoodPoolTest {
    public static void main(String[] args) throws InterruptedException,Exception {

        ExecutorService service= Executors.newFixedThreadPool(3);

       List<String> food= Arrays.asList("Pizza", "Pasta", "Fish", "Chicken Salad");

        for (int i = 1; i <=3; i++) {
            Food food1=new Food(food.get(i));
            service.submit(food1);

        }
        service.shutdown();

    }
    }

