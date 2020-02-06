package ts;
import java.io.*;
import java.util.*;
import sa.*;

public class Ts
{
    public Map< String, TsItemFct> fonctions;
    public Map< String, TsItemVar> variables;
    private int adrVarCourante;
    private int adrArgCourant;

    public int getAdrVarCourante(){return adrVarCourante;}

    public int nbVar(){return adrVarCourante;}
    public int nbArg(){return adrArgCourant;}
    
    
    public Ts(){
	this.fonctions = new HashMap< String, TsItemFct>();
	this.variables = new HashMap< String, TsItemVar>();
	this.adrVarCourante = 0;
	this.adrArgCourant = 0;
    }
    
    public TsItemVar addVar(String identif, int taille)
    {
	TsItemVar item = new TsItemVar(identif, taille);
	item.portee = this;
	item.adresse = this.adrVarCourante;
	this.adrVarCourante += item.getTaille();
	this.variables.put(identif, item);
	return item;
    }

    public TsItemVar addParam(String identif)
    {
	TsItemVar item = new TsItemVar(identif, 1);
	item.portee = this;
	item.adresse = this.adrArgCourant;
	item.isParam = true;
	this.adrArgCourant += item.getTaille();
	this.variables.put(identif, item);
	return item;
    }

    public TsItemFct addFct(String identif, int nbArgs, Ts table, SaDecFonc saDecFonc)
    {
	TsItemFct item = new TsItemFct(identif, nbArgs, table, saDecFonc);
	this.fonctions.put(identif, item);
	return item;
    }

    public TsItemVar getVar(String identif)
    {
	return variables.get(identif);
    }
    
    public TsItemFct getFct(String identif)
    {
	return fonctions.get(identif);
    }
    
    public Ts getTableLocale(String identif){
	TsItemFct item = this.fonctions.get(identif);
	if(item == null)
	    return null;
	else
	    return item.getTable();
    }
    
	 
    public void affiche(PrintStream out){
	Set< Map.Entry< String, TsItemVar> > stVar = this.variables.entrySet();    
	for (Map.Entry< String, TsItemVar> me:stVar){ 
	    out.println(me.getValue());
	    //	    out.println(me.getKey() + ":\t" + me.getValue());
	}
	Set< Map.Entry< String, TsItemFct> > stFct = this.fonctions.entrySet();    
	for (Map.Entry< String, TsItemFct> me:stFct){ 
	    out.println(me.getValue());
	    //	    out.println(me.getKey() + ":\t" + me.getValue());
	}
    }
	
    public void afficheTablesLocales(PrintStream out){
	Set< Map.Entry< String, TsItemFct> > st = this.fonctions.entrySet();    
	for (Map.Entry< String, TsItemFct> me:st){
	    if(me.getValue().getTable() != null){
		out.println("TABLE LOCALE : " + me.getKey());
		me.getValue().getTable().affiche(out);
	    }
	}
    }

    public void afficheTout(String baseFileName){
	String fileName;
	PrintStream out = System.out;
	
	if (baseFileName != null){
	    try {
		baseFileName = baseFileName;
		fileName = baseFileName + ".ts";
		out = new PrintStream(fileName);
	    }
	    
	    catch (IOException e) {
		System.err.println("Error: " + e.getMessage());
	    }
	}
       	out.println("TABLE GLOBALE");
	this.affiche(out);
	this.afficheTablesLocales(out);
    }

}
