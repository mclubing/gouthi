import com.gouthi.prop.DataSourceConfigProps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Lu.Bing on 2017/2/28.
 * in PACKAGE_NAME
 * by Lu.Bing
 * on 2017/2/28
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DataSourceConfigProps.class)
@EnableAutoConfiguration
public class TestPropertiesInject {

    @Autowired
    private DataSourceConfigProps dataSourceConfigProps;

    @Test
    public void ParamInject() {
        System.out.println(dataSourceConfigProps.toString());
    }
}
