package com.Richard.portfolio.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data // ✅ Lombok generates getters/setters including getContent()
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    
    private String content; // ✅ THIS field is needed for getContent()
}
