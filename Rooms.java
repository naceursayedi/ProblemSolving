import java.util.Scanner;
import java.util.Arrays;

/**
 * Beschreiben Sie hier die Klasse Rooms.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Rooms
{
    static Scanner input=new Scanner(System.in);
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    public static void main(String[] args){
    
 
    System.out.println("please write how many lectures do you want to add ");
    int l = input.nextInt();
    int[][] a = new int[l][2];
    
    for(int i=0;i<l;i++){
       
        for(int j=0;j<2;j++){
        if(j==0){
        System.out.print("Start:");
        a[i][j] = input.nextInt();
        }else{
        System.out.print("End:");
        a[i][j] = input.nextInt();
        }
        
    }
    }
    System.out.print("[");
    for(int i=0;i<l;i++){
    System.out.print(Arrays.toString(a[i]));
    }
    System.out.print("]");
    System.out.println();
    System.out.println("The Number of Rooms required is "+roomCalculate(a,l));
    
    
    }
    static int roomCalculate(int[][] a,int l){
    
    int r=1;
    for(int i=0;i<(l-1);i++){
        for(int j=0;j<2;j++){
        if(j==1){
          if(a[i][1] > a[i+1][0]){r++;}
        }
        
        }
    }
        
        
        return r;}
    /**
     * Konstruktor für Objekte der Klasse Rooms
     */
    public Rooms()
    {
        // Instanzvariable initialisieren
       
    }

    
}
