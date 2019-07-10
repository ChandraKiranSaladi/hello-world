package com.Testing.App;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(args[0]);
    }

    public static void print(String txt){
        System.out.println("Yea thats right");
    }
}
