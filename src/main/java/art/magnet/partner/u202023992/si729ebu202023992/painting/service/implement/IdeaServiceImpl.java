package art.magnet.partner.u202023992.si729ebu202023992.painting.service.implement;

import art.magnet.partner.u202023992.si729ebu202023992.common.exception.ValidationException;
import art.magnet.partner.u202023992.si729ebu202023992.common.mapper.MapperMethods;
import art.magnet.partner.u202023992.si729ebu202023992.painting.dto.IdeaRequestDto;
import art.magnet.partner.u202023992.si729ebu202023992.painting.dto.IdeaResponseDto;
import art.magnet.partner.u202023992.si729ebu202023992.painting.model.Idea;
import art.magnet.partner.u202023992.si729ebu202023992.painting.repository.IdeaRepository;
import art.magnet.partner.u202023992.si729ebu202023992.painting.service.IdeaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdeaServiceImpl implements IdeaService {

    private final MapperMethods modelMapperConvert;
    private final IdeaRepository ideaRepository;
    public IdeaServiceImpl(IdeaRepository ideaRepository, MapperMethods modelMapperMethod) {
        this.modelMapperConvert = modelMapperMethod;
        this.ideaRepository = ideaRepository;
    }
    @Override
    public List<IdeaResponseDto> getAllIdeas() {
        List<Idea> ideas = ideaRepository.findAll();
        return modelMapperConvert.toMapIdeaResponseDto(ideas);
    }

    @Override
    public Idea createIdea(IdeaRequestDto ideaRequestDto) {
        Idea idea = modelMapperConvert.toIdea(ideaRequestDto);
        validateIdea(idea);
        return ideaRepository.save(idea);
    }

    //VALIDATIONS
    private void validateIdea(Idea idea) {
        if (idea.getTextQuery() == null || idea.getTextQuery().trim().isEmpty()) {
            throw new ValidationException("Text query cannot be empty");
        }
        if (idea.getInitialSamples() == null || idea.getInitialSamples() <= 0) {
            throw new ValidationException("Initial samples cannot be empty");
        }
        if (idea.getAuthorId() == null || idea.getAuthorId() <= 0) {
            throw new ValidationException("Author id cannot be empty");
        }
        if (ideaRepository.existsByAuthorIdAndTextQuery(idea.getAuthorId(), idea.getTextQuery())) {
            throw new ValidationException("Idea with such text query already exists");
        }
    }
}
