/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package itsudparis.application;

import com.hp.hpl.jena.rdf.model.Model;
import itsudparis.tools.JenaEngine;

/**
 *
 * @author DO.ITSUDPARIS
 */
public class Main {
    public static final String ns = "http://www.owl-ontologies.com/Ontology1426150645.owl#";
    public static String inputDataOntology = "data/tp-projet.owl";
    public static String inputRule = "data/rules.txt";
    public static String inputQuery = "data/query.txt";

    /**
     * @param args rhe command line arguments
     */

    public static void main(String[] args){
        Model model = JenaEngine.readModel(inputDataOntology);
        Model inferedModel = JenaEngine.readInferencedModelFromRuleFile(model, inputRule);
        
       
        System.out.println(JenaEngine.executeQueryFile(inferedModel, inputQuery));
        
        
        
        
    }

}
