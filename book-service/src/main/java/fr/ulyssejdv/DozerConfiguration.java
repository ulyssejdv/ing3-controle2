package fr.ulyssejdv;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ulysse on 09/11/2017.
 */
@Configuration
public class DozerConfiguration {

    /**
     * Jackson LocalDate converter with dozer-jdk8-support dependency
     */
    @Bean
    public Mapper dozer() {
        final List<String> mappingFiles = new ArrayList();
        mappingFiles.add("config/dozerJdk8Converters.xml");

        final DozerBeanMapper dozer = new DozerBeanMapper();
        dozer.setMappingFiles(mappingFiles);
        return dozer;
    }
}
