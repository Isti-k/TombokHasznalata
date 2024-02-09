/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombokhasznalata;

public class TombokHasznalata {
    
    public static void main(String[] args) {
       //index:        0       1        2
       //pyLista = ["egy", "kettő", "három"]
       
       /* deklarálásnál az értékekkel rögtön feltöltve */
       String[] tomb = {"egy", "kettő", "három"};
       
       /* memória címet írja ki, nem a tartalmat: */
        System.out.println("tomb = " + tomb);
        
        /* a tömb mérete nem változtatható: */
        //tomb = {"nulla", "egy", "kettő", "három"};
        
        for(int i = 0; i < tomb.length; i++){
            /*IllegalFormatConversionException: d != java.lang.String*/
            //System.out.printf("[%d. index]=%d\n",i, tomb[i]);
            System.out.printf("[%d. index]=%s\n",i, tomb[i]);
        }
        /* dekralálásnál a mérettel és később feltöltve */
        /* méret nem változhat, de új tömb lehet: */
        tomb = new String[4];//megadom az új méretet
        System.out.println("az üres tömb: ");//minden elem értéke
        for(int i = 0; i < tomb.length; i++) {
            System.out.printf("[%d. index]=%s\n",i, tomb[i]);
        }
         tomb[2] = "zwei";
         System.out.println("részben - németül- feltöltött tömb: ");
         for(int i = 0; i < tomb.length; i++) {
            System.out.printf("[%d. index]=%s\n",i, tomb[i]);
         }
         tomb[0] = "null";
         tomb[1] = "dog";
         tomb[3] = "fish";
         System.out.println("vegyesen feltöltött tömb: ");
         for(int i = 0; i < tomb.length; i++) {
             System.out.printf("[%d. index]=%s\n",i, tomb[i]);
         }
         
         tomb[0] = "null";
         tomb[1] = "cat";
         tomb[2] = "dog";
         tomb[3] = "fish";
         //tomb[4] = "";
         System.out.println("teljesen - angolul- feltöltött tömb: ");
         for(int i = 0; i < tomb.length; i++) {
             System.out.printf("[%d. index]=%s\n",i, tomb[i]);
         }
         System.out.println("\"null\"vagy null ?");
         /* String == REFERENCIA*/
         if("null" == null){
             System.out.println("egyezik");
         }else{
              System.out.println("nem egyezik");
         }
         /* le sem fordítható: */
         /* Éerték == REFERENCIA */
         //if(0 == null)
         
         
    }
    
}
