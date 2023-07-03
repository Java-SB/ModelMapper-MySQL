package art.magnet.partner.u202023992.si729ebu202023992.common.mapper;

import art.magnet.partner.u202023992.si729ebu202023992.painting.dto.IdeaRequestDto;
import art.magnet.partner.u202023992.si729ebu202023992.painting.dto.IdeaResponseDto;
import art.magnet.partner.u202023992.si729ebu202023992.painting.model.Idea;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MapperMethods {
    private final ModelMapper modelMapper;
    public MapperMethods() {
        this.modelMapper = new ModelMapper();
    }

    public Idea toIdea(IdeaRequestDto ideaRequestDto) {
        return modelMapper.map(ideaRequestDto, Idea.class);
    }
    public List<IdeaResponseDto> toMapIdeaResponseDto(List<Idea> ideas) {
        return ideas.stream().map(this::toIdeaResponseDto).collect(Collectors.toList());
    }
    public IdeaResponseDto toIdeaResponseDto(Idea idea) {
        return modelMapper.map(idea, IdeaResponseDto.class);
    }
}
