package marm5r;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author mam02072
 */
@Stateless
@LocalBean
public class SessionBean {
    
    public String businessMethod() {
        return "output";
    }
    
}
