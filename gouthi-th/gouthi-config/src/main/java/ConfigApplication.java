import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Lu.Bing on 2017/2/27.
 * in PACKAGE_NAME
 * by Lu.Bing
 * on 2017/2/27
 */
@EnableDiscoveryClient
@EnableConfigServer
@EnableAutoConfiguration
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
