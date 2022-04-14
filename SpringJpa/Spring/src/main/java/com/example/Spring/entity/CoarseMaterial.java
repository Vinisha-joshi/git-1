package com.example.Spring.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString(exclude = "coarse")
public class CoarseMaterial {
    @Id
    @SequenceGenerator(
            name = "coarse_material_sequence",
            sequenceName = "coarse_material_sequence",
            initialValue =1,
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "coarse_material_sequence"
    )
    private Long coarseMaterialId;
    private String url;

    @OneToOne(
            cascade = CascadeType.ALL,//It defines “cascade=CascadeType.ALL” and it essentially means
            // that any change happened on Coarse must cascade to CoarseMaterial as well.
            fetch = FetchType.LAZY,
            optional=false
    )
    @JoinColumn(
            name = "coarse_id",
            referencedColumnName = "coarseId"

    )
    private Coarse coarse;
}
