package hooks;


import org.junit.After;
import org.junit.Before;
import util.BaseUtil;

public class hook {
public BaseUtil baseUtil;
    public hook(BaseUtil baseUtil) {
        this.baseUtil=baseUtil;
    }
    @Before
    public void accessToApplication()
    {
        baseUtil.setPrerequisiteDriver();
    }
    @After
    public void closeApplication()
    {
        baseUtil.setPrerequisiteDriver().quit();
    }
}
