package solvivalcode.survivalback.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "recipes")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String nameRecipie;

    @Column(name = "description")
    private String descriptionRecipie;

    @Column(name = "level_required")
    private Integer levelRequired;

    @Column(name = "crating_time")
    private Integer cratingTime;

}
