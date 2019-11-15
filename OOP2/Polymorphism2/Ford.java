package OOP2.Polymorphism2;


class Ford extends Car {
    public Ford(boolean engine, int cylinders, String name, int wheels) {
        super(engine, cylinders, name, wheels);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}
