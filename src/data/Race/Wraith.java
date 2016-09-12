package data.Race;

/**
 * Created by G on 07/09/2016.
 */
public class Wraith extends Race{
    public Wraith(){
        name = "Wraith";
        intel+=20;
        sag+=20;
        force+=20;
        cha+=20;
        dext+=20;
        capa = "- Peut utiliser l'imagination\n" +
                "- Conaissance des nouvelles technologies\n" +
                "- Inspire le respect, la crainte\n"+
                "- Pour survivre, doit aspirer la force vitale de créatures";

    }
}
