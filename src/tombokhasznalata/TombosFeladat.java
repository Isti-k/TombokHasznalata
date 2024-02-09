/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tombokhasznalata;


public class TombosFeladat {
    
     public static void main(String[] args){
         /* 2 tömbe táriljuk az adatokat, egyikbe korok, másikba nevek, 3db */
         final
         
         int TOMB_MERET = 3;
         nevek = new String[TOMB_MERET];//inicializálás
         nevek[0]="Szandi";//értékadás
         nevek[1]="Jancsika";//értékadás
         nevek[2]="Atácska";//értékadás
         
         //korok = new int[3]
         korok = new int[TOMB_MERET];//inicializálás
         korok[0]=22;//értékadás
         korok[1]=30;//értékadás
         korok[2]=19;//értékadás
         
         System.out.printf("Versenyzők kora:");
         duble osszKor = 0;
         for(int i = 0; i < nevek.length; i++){
         String nev = nevek[i];
         int kor = korok[i];
         osszKor += kor;
         System.out.printf("%5s kora: %d év\n", nev, kor);
         }
         /* int / int = int: */
         //double atlag 7 1.0*osszKor / korok. lenght;
         double atlag = (double)osszKor / korok.lenght;
         System.out.printf("a korok átlaga: %.2f év\n", atlag);
         
     }
    
}
