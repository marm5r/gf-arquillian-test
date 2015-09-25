package marm5r;

import java.util.logging.Logger;
import javax.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 *
 * @author mam02072
 */
@RunWith(Arquillian.class)
public class SessionBeanTest {

    private static final Logger LOG = Logger.getLogger(SessionBeanTest.class.getName());
    
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(SessionBean.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Inject
    SessionBean sessionBean;

    @Test
    public void testBusinessMethod() throws Exception {
        assertNotNull(sessionBean.businessMethod());
    }
    
    @BeforeClass
    public static void beforeClass() {
        LOG.warning("FROM UNIT TEST: beforeClass");
    }
    
    @AfterClass
    public static void afterClass() {
        LOG.warning("FROM UNIT TEST: afterClass");
    }

}
