/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin;
/**
 *
 * @author sarah
 */
public class Translator {
    String[] adjectives = {"stor", "liten", "stark", "svag", "mjuk", "hård", "snabb", "vacker", "ljus", "mörk"};
    String[] nouns = {"en lönehöjning", "en lönesänkning", "en fotboja", "en katt", "en hund", "ett hus", "ett barn", "ett elstängsel", "en dator", "ett golv"};
    String[] verbs = {"springa", "ljuga", "flyga", "se", "vara", "äta", "mäta", "gå", "röra", "resa"};
    
    public String getFortune(int a, int b, int c, int d, int e){
       String fortune = "Din framtid är " + adjectives[a]+". Du borde sluta " + verbs[b] + ". "
               + "Vi ser att du snart kommer att skaffa " + nouns[c] + "."
               + " Snart kommer du vilja " + verbs[d] + ", men då är det viktigt att du är " +adjectives[e] +".";
       return fortune;
    }
    
}
