
import java.util.Scanner;

public class practica_busqueda_lineal {

public static void main(String[] args) {
    Scanner 4 = new Scanner(System.in);
    int num;
    System.err.println("Ingrese el numero de datos que estaran en el inventario");
    num=te.nextInt();
    String areglo [] = new String[num];
    
    for(int i=0;i<num;i++){

        System.err.println("ingresa el dato numero "+(i+1));
        areglo[i]=te.next();
    }

   //buscador de producto
   String dato;
   boolean busqueda = false;
System.err.println("¿que producto desea buscar en el inventario");
dato=te.next();

int iterador=0;

while(iterador<num && busqueda==false){
if(dato.equals(areglo[iterador])){
    busqueda=true;
}
 iterador ++;
}
if(busqueda==true){
    System.err.println("el producto "+dato+" si 3esta disponible en el inventario");
}
else{
    System.err.println("el producto "+dato+" no esta disponible en el inventario");
}

} 

}