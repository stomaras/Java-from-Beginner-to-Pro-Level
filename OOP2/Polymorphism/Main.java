package OOP2.Polymorphism

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return " A shark eats a lot of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot(){
        return " Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {

    public MazeRunner(){
        super(" Maze Runner");
    }

    @Override
    public String plot(){
        return "Kids try and escape a maze.";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super(" Star Wars");
    }

    @Override
    public String plot(){
        return " Imperial Forces try to take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

}




public class Main {

    public static void main(String[] args) {
	    for(int i=1;i<11;i++){
	        Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                            " : " + movie.getName() + "\n" +
                    // With polymorphism we are actually assigning different functionality, depending on the type of object that we are created
                    //Bearing in mind that, all these movies are inherited from the base movie class,but we have assigned a unique bit of
                    //functionality in each of those plot methods,for each of those classes.
                            "Plot: " + movie.plot() + "\n"
                    );
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) +1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }

        return null;
    }
}
