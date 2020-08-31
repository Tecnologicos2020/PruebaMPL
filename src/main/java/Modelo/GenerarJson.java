package Modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

/**
 *
 * @author ebarrero
 */
public class GenerarJson 
{
    /**
     * Metodo que genera archivo json apartidar de la informacion 
     * de sesion
     * 
     * @param id
     * @param sesion 
     */
    public static void construirJson(String id, String sesion)
    {
        JSONObject obj = new JSONObject();
        try 
        {
            obj.put("Id : ", id);
            obj.put("Sesion : ", sesion);
            
            FileWriter file = new FileWriter("prueba.json");
            file.write(obj.toJSONString());
            file.flush();
            file.close();

        } catch (IOException e) {
            System.out.println("Error en el metodo:construirJson()" + e.getMessage());
        }
        
        System.out.println("----------------------------------------");
        System.out.println("---------SE GENERA ARCHIVO JSON---------");
        System.out.println("----------------------------------------");
        System.out.print(obj);
    }
    
}
