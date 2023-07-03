package art.magnet.partner.u202023992.si729ebu202023992.painting.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IdeaRequestDto {

    private String textQuery;

    private Integer initialSamples;

    private Long authorId;
}
