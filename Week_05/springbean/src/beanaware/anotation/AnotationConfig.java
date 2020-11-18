package beanaware.anotation;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"beanaware.anotation"},basePackageClasses = {UserAnotation.class})
public class AnotationConfig {
}
