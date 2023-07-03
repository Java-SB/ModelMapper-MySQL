package art.magnet.partner.u202023992.si729ebu202023992.painting.service;

import art.magnet.partner.u202023992.si729ebu202023992.painting.dto.IdeaRequestDto;
import art.magnet.partner.u202023992.si729ebu202023992.painting.dto.IdeaResponseDto;
import art.magnet.partner.u202023992.si729ebu202023992.painting.model.Idea;

import java.util.List;

public interface IdeaService {
    List<IdeaResponseDto> getAllIdeas();
    Idea createIdea(IdeaRequestDto ideaRequestDto);
}
