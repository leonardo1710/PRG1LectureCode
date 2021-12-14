package at.ac.fhcampuswien.lecture06.characters;

/**
 * Die Uruk-hai bildeten unter den Orks eine Art Elite
 * und waren nicht selten die Anführer der niederen Orks.
 */
public class Urukhai extends Orc {

    public Urukhai(){
        this.location = "Isengart";
    }

    @Override
    public void eat() { // since this method is abstract in base class Urukhai MUST provide its own implementation
        System.out.println("Urukhai loves to eat hobbits..mhh");
    }

    @Override
    public void attackRoar(){
        System.out.println("ROOOOOOOAAR");
    }


}
