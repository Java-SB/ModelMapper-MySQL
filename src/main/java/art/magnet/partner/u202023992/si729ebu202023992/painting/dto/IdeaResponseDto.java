package art.magnet.partner.u202023992.si729ebu202023992.painting.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IdeaResponseDto {

    private Long id;

    private String textQuery;

    private Integer initialSamples;
}
