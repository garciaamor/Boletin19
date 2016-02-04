package boletin19;

import javax.swing.JOptionPane;

public class Boletin19 {

    public static void main(String[] args) {
        Buzon arrMens=new Buzon();
        int res;
        
        arrMens.cargarArray();
        do {
            res=Integer.parseInt(JOptionPane.showInputDialog("Elige una de las siguientes opciones :\n 1. Mostrar numero de correos totales \n 2. Mostrar si queda algun correo sin leer \n 3. Mostrar el primero de los correos sin leer \n 4. Mostrar todos los correos \n 5. Añadir un nuevo correo \n 6. Borrar un correo \n 7. Cerrar el programa"));
        switch(res){
            case 1 :
                System.out.println("Numero de correos totales : "+ arrMens.numeroDeCorreos());
                break;
            case 2 :
                if (arrMens.porLer()==false){
                 System.out.println("Quedan mensajes sin leer");
                 }else
                  System.out.println("Todos los mensajes estan leidos");
                break;
            case 3:
                System.out.println(arrMens.amosaPrimerNoLido());
                break;
            case 4:
                arrMens.amosaTodo();
            case 5:
                arrMens.engade(new Correo("nuevo correo", true));
                break;
            case 6:
                arrMens.elimina(2);
                break;
            case 7:
                System.out.println("Saliendo del programa");
                break;
        }
        }
        while (res!=7);
            System.exit(0);
    
        
      
            
           }
    
    
    
}
