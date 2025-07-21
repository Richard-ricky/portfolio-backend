package com.Richard.portfolio.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    // Custom constructor
    public Project(String title, String description) {
        this.title = title;
        this.description = description;
    }
}
