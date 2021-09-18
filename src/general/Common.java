
package general;

import javax.swing.JFrame;

/**
 *
 * @author mohamed
 */
public class Common {
    public static int privilegeId = -1;
    public static String user = "";
    
    public void loadForm(JFrame src , JFrame dest){
        
        dest.setVisible(true);
        dest.setEnabled(true);
        src.setVisible(false);
        src.setEnabled(false);
        
    }
    
    /*
    private void loggingName() {
        //show login username: //
        String logged = "";
        if(Common.user.trim().length() > 0)
        {
            logged = Common.user.trim();
            logName.setText(logged);
        }
    }
    */
    
    
    
    
//    //show login username: //
//        String logged = "";
//        if(Common.user.trim().length() > 0)
//        {
//            logged = Common.user.trim();
//            loggedErr.setText(logged);
    
    
    
}
