package data;

import data.Classe.*;
import data.Race.*;

/**
 * Created by G on 07/09/2016.
 */
public class Global {
    public String name;
    public Boolean good = true;
    public int force=0;
    public int dext=0;
    public int consti=0;
    public int intel=0;
    public int sag=0;
    public int cha=0;
    public String capa="";

    public void reset(){
        good = true;
        force=0;
        dext=0;
        consti=0;
        intel=0;
        sag=0;
        cha=0;
    }

    public Global update(){
        if (this instanceof Archer) return new Archer();
        else if (this instanceof Barbare) return new Barbare();
        else if (this instanceof Dessinateur) return new Dessinateur();
        else if (this instanceof Frontalier) return new Frontalier();
        else if (this instanceof Marchombre) return new Marchombre();
        else if (this instanceof Reveur) return new Reveur();
        else if (this instanceof Tireur) return new Tireur();
        else if (this instanceof Elfe) return new Elfe();
        else if (this instanceof Fael) return new Fael();
        else if (this instanceof Humain) return new Humain();
        else if (this instanceof Nox) return new Nox();
        else if (this instanceof Thul) return new Thul();
        else return new Wraith();
    }

    public void synergie(Race r, Classe c){
        if (r instanceof Humain){
            if (c instanceof Frontalier){
                force+=5;
                dext+=5;
            }
            if (c instanceof Dessinateur){intel+=10;}
        }
        if (r instanceof Thul){
            if (c instanceof Barbare){force+=10;}
            else if (c instanceof Frontalier){}
            else{good = false;}

        }
        if (r instanceof Elfe){
            if (c instanceof Marchombre){
                dext+=10;
            }
            if (c instanceof Barbare)good = false;
        }
        if (r instanceof Wraith) {
            if (c instanceof Barbare) good = false;
            if (c instanceof Reveur) {
                cha += 10;
            }
            if (c instanceof Tireur) {
                dext += 10;
            }
        }
        if (r instanceof Nox){
            if (!(c instanceof Dessinateur || c instanceof Reveur))good = false;
            if (c instanceof Reveur){cha+=10;}
        }
        if (r instanceof Fael){
            if (c instanceof Dessinateur || c instanceof Reveur)good = false;
            if (c instanceof Archer){dext+=10;}
        }

    }
}
