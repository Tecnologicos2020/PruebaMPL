
package Modelo;

/**
 *
 * @author ebarrero
 */
public class loginService 
{
    public loginService(){}
    
    /**
     * 
     * @param id
     * @param pw
     * @return 
     */
    public  static String login(String id,String pw)
    {
        try 
        {
            org.sakaiproject.webservices.SakaiLoginService service = new org.sakaiproject.webservices.SakaiLoginService();
            org.sakaiproject.webservices.SakaiLogin port = service.getSakaiLoginPort();
            String result = port.login(id, pw);
            boolean sesion=logout(result);
            if (sesion) 
            return result; 
            
        } catch (Exception e) {
            System.out.println(" Error en el metodo:login()"+e.getMessage());
        }
       return null;
    }
   
    /**
     * 
     * @param sessionid
     * @return 
     */
    public  static boolean logout(String sessionid)
    {
        try 
        {
            org.sakaiproject.webservices.SakaiLoginService service = new org.sakaiproject.webservices.SakaiLoginService();
            org.sakaiproject.webservices.SakaiLogin port = service.getSakaiLoginPort();
            return port.logout(sessionid);
        } catch (Exception e) {
            System.out.println(" Error en el metodo:logout()"+e.getMessage());
        }
       return false; 
    }
    
  
    
}