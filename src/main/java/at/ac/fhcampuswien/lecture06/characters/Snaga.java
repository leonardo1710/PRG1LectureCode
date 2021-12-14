package at.ac.fhcampuswien.lecture06.characters;

/**
 * Die kleinste Art der Orks wurde Snagas genannt und ist die am meisten
 * verbreitete Ork-Art. Die Orks der Nebelgebirge gehörten dieser Rasse an.
 */
public class Snaga extends Orc implements Comparable<Snaga> {


    public Snaga() {
        this.location = "Nebelgebirge";
    }

    @Override
    public void eat() {

    }

    @Override
    public int compareTo(Snaga o) {
        if(age == o.age){
            return 0;
        } else if (age < o.age){
            return -1;
        } else {
            return 1;
        }
    }
}
