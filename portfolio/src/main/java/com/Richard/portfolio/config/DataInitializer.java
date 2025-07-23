package com.Richard.portfolio.config;

import com.Richard.portfolio.model.Project;
import com.Richard.portfolio.repository.ProjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(ProjectRepository projectRepository) {
        return args -> {
            // ✅ Clear existing records
            projectRepository.deleteAll();

            // ✅ Insert new projects with realistic imageUrl and tags
            projectRepository.save(new Project(
                    "Portfolio Website",
                    "A fullstack React + Spring Boot site showcasing my skills.",
                    "https://images.unsplash.com/photo-1581090700227-1b5f9c0690e2?auto=format&fit=crop&w=600&q=80",
                    Arrays.asList("React", "Spring Boot", "Fullstack")
            ));

            projectRepository.save(new Project(
                    "Task Tracker",
                    "A minimalist app to manage daily tasks efficiently.",
                    "https://images.unsplash.com/photo-1556157382-97eda2d62296?auto=format&fit=crop&w=600&q=80",
                    Arrays.asList("Java", "Spring", "CRUD")
            ));

            projectRepository.save(new Project(
                    "Weather App",
                    "A real-time weather app using the OpenWeatherMap API.",
                    "https://images.unsplash.com/photo-1599423300746-b62533397364?auto=format&fit=crop&w=600&q=80",
                    Arrays.asList("API", "JavaScript", "Weather")
            ));
        };
    }
}
