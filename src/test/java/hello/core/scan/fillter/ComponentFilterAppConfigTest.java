package hello.core.scan.fillter;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

public class ComponentFilterAppConfigTest {

    @Test
    void filterScan() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
    }

    @Configuration
    @ComponentScan(includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = MyIncludeComponent.class))   
    static class ComponentFilterAppConfig {

    }
}
