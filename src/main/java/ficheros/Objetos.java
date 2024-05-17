/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheros;
import com.mycompany.juego2eso.*;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *para guardar objetos se implementa la interfaz Serializable en la clase
 *LecturaFileInputStream con ObjectInputStream y readObject
 *Escritura FileOoutputStream con ObjectOutputStream y writeObject

 * 
 */
public class Objetos {
     /**
     * Crea el fichero de objetos Proyecto 
     * param nombreArchivo nombre del archivo donde se escribe
     * @param pro proyecto a escribir
     */
     public static void escribirArchivoObjetos(String nombrefichero,Usuario usu) {
        ObjectOutputStream fo = null;
         File archivo=new File(nombrefichero);
        try {
            if (archivo.exists()) {
                //el arechivo existe, escribimos sin cabecera
                fo = new MiObjectOutputStream(new FileOutputStream(archivo, true));

            } else {
                //el archivo no existe, escribimos cabecera
                fo = new ObjectOutputStream(new FileOutputStream(archivo));
            }
            
               fo.writeObject(usu); 
            
        } catch (IOException ex) {
            System.err.println(ex.toString());
        } finally {
            if (fo != null) {
                try {
                    fo.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar fichero" + ex.toString());
                }
            }
        }
    }
     
     
     /**
     * lee el fichero de proyectos y crea una colección con los datos
     *
     * param nombreArchivo nombre del archivo donde se escribe
     * @return List<Proyecto> -lista de los proyectos
     *
     */
    public static List<Usuario> leerArchivoObjetos(String nombrefichero) {
        List<Usuario> proyectos = new ArrayList<>();
        ObjectInputStream os = null;
         File archivo=new File(nombrefichero);
       
        try {
            os = new ObjectInputStream(new FileInputStream(archivo));
            Usuario proyecto;

            while (true) {
               try{ 
                   proyecto = (Usuario) os.readObject();
                   //Casting necesario 
                    if (!proyectos.add(proyecto)) {
                        throw new Exception("Error en la creación de la colección de proyectos");
                    }
                } catch (EOFException e) {
                    System.out.println("Se alcanzó el final");
                   break;
                }
            }
            
        } catch (ClassNotFoundException e) {
            System.out.println("Error el tipo de objeto no es compatible");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar" + ex.toString());
                }
            }
        }
        return proyectos;
    }
}
