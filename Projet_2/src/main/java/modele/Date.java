package modele;
public class Date{
    protected int chJour;
    protected int chMois;
    protected int chAnnee; 

    public Date(int parJour, int parMois, int parAnnee){
        chJour = parJour;
        chMois = parMois;
        chAnnee = parAnnee;
    }

    public Date() {
        chJour = 0;
        chMois = 0;
        chAnnee = 0;
    }

    public String toString() {

        return chJour + "/" + chMois + "/" + chAnnee;
    }
    public static boolean estBissextile(int parAnnee){
        return (parAnnee % 4 == 0 && parAnnee % 100 != 0) || parAnnee % 400 == 0;
    }

    public static int dernierJourDuMois(int parMois, int parAnnee){
        switch(parMois){
            case 2:
            if (Date.estBissextile(parAnnee))
                return 29;
            else
                return 28;

            case 4 : case 6 : case 9 : case 11 : return 30;

            default : return 31;
        }
    }


    public boolean estValide(){
        if (chMois > 12 || chMois < 0)
            return false;
        if (chAnnee < 1583)
            return false;
        if (chJour < 0 || chJour > dernierJourDuMois(chMois,chAnnee))
            return false;
        return true;
    }

    public static Date lireDate(){

        System.out.println("Entrez un Jour");
        int jour = Clavier.lireInt();
        System.out.println("Entrez un Mois");
        int mois = Clavier.lireInt();
        System.out.println("Entrez une Annee");
        int annee = Clavier.lireInt();
        return new Date (jour, mois, annee);
    }

    public int compareTo(Date parDate){
        if (chAnnee < parDate.chAnnee)
            return -1;
        if (chAnnee > parDate.chAnnee)
            return 1;
        if (chMois < parDate.chMois)
            return -1;
        if (chMois > parDate.chMois)
            return 1;
        if (chJour < parDate.chJour)
            return -1;
        if (chJour > parDate.chJour)
            return 1;
        return 0;
    }

    public Date dateLendemain(){
        int jour = chJour + 1 ;
        int mois = chMois;
        int annee = chAnnee;

        if (jour > dernierJourDuMois(mois, annee)){
            jour = 1;
            mois ++;
            if (mois > 12){
                mois = 1;
                annee ++;
            }
        }
        return new Date(jour,mois, annee);
    }

    public Date dateVeille(){
        int jour = chJour -1 ;
        int mois = chMois;
        int annee = chAnnee;

        if (jour < 1){
            mois --;
            if (mois < 1 ){
                mois = 12;
                annee --;
            }
            jour = dernierJourDuMois(mois, annee);

        }
        return new Date(jour,mois, annee);
    }
}