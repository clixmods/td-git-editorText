package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;


/**
 * Class qui insère des choses
 */
public class CommandeInserer extends CommandeDocument{

    public CommandeInserer(Document document, String[] parameters) {
        super(document, parameters);
    }


    public void executer(){
        if(parameters.length < 3){
            System.err.println("Format attendu : inserer;position;chaine");
            return;
        }
        int position = Integer.parseInt(parameters[1]);
        String texte = (parameters.length == 2) ? "" : parameters[2];
        document.inserer(position, texte);
        super.executer();
    }

    /**
     * Description de la méthode
     * Il peut être intéressant de consulter la méthode {@link CommandeDocument#CommandeDocument} !
     * @param str description du premier paramètre
     */
    public void MyMethod(String str)
    {

    }

    @Override
    public String getDescriptionCommande() {
        return "insere du texte";
    }
}
