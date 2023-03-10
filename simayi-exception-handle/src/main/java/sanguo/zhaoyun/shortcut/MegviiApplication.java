package sanguo.zhaoyun.shortcut;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@MapperScan(basePackages = {"sanguo.zhaoyun.shortcut.**.db.mapper"})
@SpringBootApplication
@EnableScheduling
public class MegviiApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

        return application.sources(MegviiApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(MegviiApplication.class, args);
    }

}

