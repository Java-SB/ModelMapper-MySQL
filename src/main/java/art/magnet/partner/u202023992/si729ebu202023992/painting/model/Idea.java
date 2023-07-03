package art.magnet.partner.u202023992.si729ebu202023992.painting.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ideas")
public class Idea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title is mandatory")
    @Column(name="text_query", nullable = false)
    private String textQuery;

    @Column(name="initial_samples", nullable = false)
    private Integer initialSamples;

    @Column(name="author_id", nullable = false)
    private Long authorId;
}
