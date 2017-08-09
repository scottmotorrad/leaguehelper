package leaguehelper;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

import com.google.common.base.Predicate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import java.util.ServiceLoader;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackageClasses = {LeagueHelperController.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public Docket swaggerSpringMvcPlugin() {
        return new Docket(DocumentationType.SWAGGER_2)
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo())
                .select()
                .paths(leagueHelperPaths())
                .build();
    }

    @Bean
    public TaskScheduler scheduler() {
        return new ThreadPoolTaskScheduler();
    }

    @Bean
    public String rapiKey() {
        String key = System.getenv("RAPI_KEY");
        return key;
    }

    @Bean
    public Long accountId() {
        String accountId = System.getenv("LOL_HELPER_ACCOUNT_ID");
        return Long.parseLong(accountId);
    }

    @Bean
    public Gson gson() {
        // Ensures GSON can decompile into Immutables.
        GsonBuilder gsonBuilder = new GsonBuilder();
        for (TypeAdapterFactory factory : ServiceLoader.load(TypeAdapterFactory.class)) {
            gsonBuilder.registerTypeAdapterFactory(factory);
        }
        return gsonBuilder.create();
    }

    @Bean
    public RiotApiHelper riotApiHelper() {
        return new RiotApiHelper(rapiKey(), accountId(), gson());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("League Helper API")
                .description("Coming Soon")
                .contact(new Contact("Scott", "url", "email"))
                .license("None")
                .licenseUrl("None")
                .version("0.1")
                .build();
    }

    private Predicate<String> leagueHelperPaths() {
        return or(regex("/api/v1/.*"));
    }
}
