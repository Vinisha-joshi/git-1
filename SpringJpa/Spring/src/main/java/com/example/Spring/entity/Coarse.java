package com.example.Spring.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Coarse {
    @Id
    @SequenceGenerator(
            name = "coarse_sequence",
            sequenceName = "coarse_sequence",
            initialValue = 1,
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "coarse_sequence"
    )
    private Long coarseId;
    private String title;
    private Integer credit;
    @OneToOne(mappedBy = "coarse")
    private CoarseMaterial coarseMaterial;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "teacher_id",
        referencedColumnName = "teacherId"
    )
    private Teacher teacher;
}
