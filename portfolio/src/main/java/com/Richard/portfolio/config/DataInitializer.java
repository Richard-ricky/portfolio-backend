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
            if (projectRepository.count() == 0) {
                projectRepository.save(new Project(
                        "Portfolio Website",
                        "A fullstack React + Spring Boot site showcasing my skills.",
                        "https://cdn-icons-png.flaticon.com/512/1006/1006771.png", // 🎨 image URL
                        Arrays.asList("React", "Spring Boot", "Fullstack") // 🧱 tags
                ));

                projectRepository.save(new Project(
                        "Task Tracker",
                        "A minimalist app to manage daily tasks efficiently.",
                        "https://cdn-icons-png.flaticon.com/512/2919/2919600.png",
                        Arrays.asList("Java", "Spring", "CRUD")
                ));

                projectRepository.save(new Project(
                        "Weather App",
                        "A real-time weather app using the OpenWeatherMap API.",
                        "https://cdn-icons-png.flaticon.com/512/869/869869.png",
                        Arrays.asList("API", "JavaScript", "Weather")
                ));
            }
        };
    }
}
