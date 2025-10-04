package EX_Listedprénomsuniques;

import java.util.concurrent.CompletableFuture;

public class hhhh {
    public static void main(String[] args) throws InterruptedException {


        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(300); } catch (InterruptedException e) {}
            return 42;
        });
        future.thenAccept(result -> System.out.println("this is message -------------------"+result));
        Thread.sleep(2000);
        System.out.println("amine");

    }
}
