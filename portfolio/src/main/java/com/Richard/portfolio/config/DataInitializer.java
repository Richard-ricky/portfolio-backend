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
                    "https://fiverr-res.cloudinary.com/images/t_main1,q_auto,f_auto,q_auto,f_auto/gigs/249985950/original/8a336252da216a3efa5e2ac3f7fc878049c23864/make-a-modern-responsive-website.png",
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
