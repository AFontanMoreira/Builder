package com.company;

public class Main {

    public static void main(String[] args) {
	   // Pizzas base = new Pizzas();
	   // Pizzas perso = new Pizzas(Pizzas.FINA,Pizzas.MEDIUM,true,true,true,Pizzas.PARALLEVAR);

        Pizzas base = new BuilderPizzas()
                .setCebolla(false)
                .setRelleno(true)
                .setRecogida(Pizzas.TIENDA)
                .build();

        System.out.println("Las pizzas");
    }
}
