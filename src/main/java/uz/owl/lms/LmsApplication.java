package uz.owl.lms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;
import uz.owl.lms.service.InitTestService;

@SpringBootApplication
@EnableSwagger2WebMvc
@Import(SpringDataRestConfiguration.class)
public class LmsApplication implements CommandLineRunner {

    @Autowired
    private InitTestService initTestService;

    public static void main(String[] args) {
        SpringApplication.run(LmsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        initTestService.init();
    }
}
