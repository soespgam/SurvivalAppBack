package solvivalcode.survivalback.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "materials")
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String nameMaterial;

    @Column(name="description")
    private String descriptionMaterial;

    @Column(name="rarity")
    private String rarityMaterial;


    @Column(name="icon_url")
    private String iconUrlMaterial;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "material_type_id")
    private MaterialType materialType;

}
