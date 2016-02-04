package boletin19;

import java.util.ArrayList;

public class Buzon {
    ArrayList<Correo> lista=new ArrayList();
    public void cargarArray(){
        Correo correo1=new Correo("primer correo", true);
        Correo correo2=new Correo("segundo correo", false);
        Correo correo3=new Correo("tercer correo",false);
        Correo correo4=new Correo("cuarto correo",true);
        lista.add(correo1);
        lista.add(correo2);
        lista.add(correo3);
        lista.add(correo4);
        
    }
    public void engade(Correo c){
        lista.add(c);
    }
    public int numeroDeCorreos(){
        
        return lista.size();
        
    }
    public void elimina(int k){
        lista.remove(k);
    }
    public boolean porLer(){
        for (int i=0;i<lista.size();i++){
             if (lista.get(i).isLeido()==false)
                 return false;
         }
        
        return true;
}
    public String amosa(int k){
               
            return lista.get(k).getContido();
        }
    public String amosaPrimerNoLido(){
        String mensaje="Todos los mensajes estan leidos";
        for (int i=0;i<lista.size();i++){
            if (lista.get(i).isLeido()==false)
                return lista.get(i).getContido();
        }
        return mensaje;
    }
    public void amosaTodo(){
        for (int i=0;i<lista.size();i++){
        System.out.println(lista.get(i));
            System.out.println("\n");
        }
    }
}
