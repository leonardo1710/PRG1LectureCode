package at.ac.fhcampuswien.lecture06;

import at.ac.fhcampuswien.lecture06.characters.Orc;
import at.ac.fhcampuswien.lecture06.characters.Snaga;
import at.ac.fhcampuswien.lecture06.characters.Troll;
import at.ac.fhcampuswien.lecture06.characters.Urukhai;

import java.util.ArrayList;

public class App {
    public static void main(String[] args){

        Troll troll = new Troll();

        troll.walk(10);
        troll.turnIntoStone();

        Urukhai urukhai = new Urukhai();
        urukhai.attack();

        System.out.println(urukhai.toString());

        Snaga snaga = new Snaga();
        snaga.attack();
        System.out.println(snaga.toString());


        urukhai.walk(10);

        ArrayList<Orc> myOrcs = new ArrayList<>();

        myOrcs.add(urukhai);

        //myOrcs.remove(0);

        for(int i = 0; i < myOrcs.size(); i++){
            System.out.println(myOrcs.get(i).toString());
        }

        for(Orc orc : myOrcs){
            System.out.println(orc.toString());
        }
    }
}
