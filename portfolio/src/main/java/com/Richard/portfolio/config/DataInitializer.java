package com.Richard.portfolio.config;

import com.Richard.portfolio.model.Project;
import com.Richard.portfolio.repository.ProjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(ProjectRepository projectRepository) {
        return args -> {
            if (projectRepository.count() == 0) {
                projectRepository.save(new Project("Portfolio Website", "A fullstack React + Spring Boot site."));
                projectRepository.save(new Project("Task Tracker", "A simple app to manage tasks daily."));
                projectRepository.save(new Project("Weather App", "Forecasts using OpenWeatherMap API."));
            }
        };
    }
}
