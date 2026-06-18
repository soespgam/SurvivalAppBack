package solvivalcode.survivalback.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "recollection_sources")
public class RecollectionSource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String nameRecollectionSource;

    @Column(name = "description")
    private String descriptionRecollectionSource;

    @Column(name = "type")
    private String typeRecollectionSource;

    @Column(name = "level_required")
    private Integer levelRequiredRecollectionSource;

    @ManyToOne
    @JoinColumn(name = "material_id")
    private Material material;

}
