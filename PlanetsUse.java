import java.util.*;

public class PlanetsUse {
    public static void main(String[] args) {

        ArrayList<Planets> p1 = new ArrayList<>();
        p1.add(new Planets("Mercury",0,false));
        p1.add(new Planets("Venus",0,false));
        p1.get(1).gasses.add("Carbon Dioxide");
        p1.get(1).gasses.add("Nitrogen");
        p1.add(new Planets("Earth",1,false));
        p1.get(2).gasses.add("Nitrogen");
        p1.get(2).gasses.add("Oxygen");
        p1.add(new Planets("Jupiter",79,true));
        p1.get(3).gasses.add("Hydrogen");
        p1.get(3).gasses.add("Helium");
        p1.add(new Planets("Saturn",83,true));
        p1.get(4).gasses.add("Hydrogen");
        p1.add(new Planets("Uranus",27,true));
        p1.get(5).gasses.add("Hydrogen");
        p1.get(5).gasses.add("Helium");
        p1.get(5).gasses.add("Methane");

        int n = Planets.countMoon(p1);
        System.out.println("Moons of planets with rings " + n);

        String g = Planets.domGas(p1);
        System.out.println("dominate gas in solar system " +g);
    }
}
