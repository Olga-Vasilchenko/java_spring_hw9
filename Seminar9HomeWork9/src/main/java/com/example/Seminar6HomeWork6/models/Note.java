package com.example.Seminar6HomeWork6.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Класс заметки
 */
@Data
@Entity
@NoArgsConstructor
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // id заметки

    @Column(nullable = false)
    private String heading; // заголовок заметки

    @Column(nullable = false)
    private String content; // содержимое заметки

    @Column()
    private LocalDateTime dateTime; // дата создания (автоматически устанавливается при создании заметки)

}
