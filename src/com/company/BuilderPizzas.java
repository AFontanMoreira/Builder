package com.company;

public class BuilderPizzas {
    Pizzas _pizza;

    public Pizzas build(){
        return this._pizza;
    }

    public BuilderPizzas() {
        _pizza = new Pizzas();
    }

    public BuilderPizzas setTipomasa(int tipomasa){
        _pizza.setTipoMasa(tipomasa);
        return this;
    }
    public BuilderPizzas setTamaño(int tamaño){
        _pizza.setSize(tamaño);
        return this;
    }
    public BuilderPizzas setRelleno(boolean relleno){
        _pizza.setRellena(relleno);
        return this;
    }
    public BuilderPizzas setCebolla(boolean cebolla){
        _pizza.setCebolla(cebolla);
        return this;
    }
    public BuilderPizzas setSinGluten(boolean gluten){
        _pizza.setSinGluten(gluten);
        return this;
    }
    public BuilderPizzas setRecogida(int recogida){
        _pizza.setRecojida(recogida);
        return this;
    }


}
