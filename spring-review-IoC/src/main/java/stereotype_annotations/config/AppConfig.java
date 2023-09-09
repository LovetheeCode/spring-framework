package stereotype_annotations.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "stereotype_annotations")
public class AppConfig {
}
