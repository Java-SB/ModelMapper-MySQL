package art.magnet.partner.u202023992.si729ebu202023992.painting.controller;

import art.magnet.partner.u202023992.si729ebu202023992.painting.dto.IdeaRequestDto;
import art.magnet.partner.u202023992.si729ebu202023992.painting.dto.IdeaResponseDto;
import art.magnet.partner.u202023992.si729ebu202023992.painting.model.Idea;
import art.magnet.partner.u202023992.si729ebu202023992.painting.service.IdeaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Idea", description = "Controller for Idea")
@RestController
@RequestMapping("/api/v1")
public class IdeaController {
    private final IdeaService ideaService;
    public IdeaController(IdeaService ideaService) {
        this.ideaService = ideaService;
    }

    @Transactional(readOnly = true)
    @GetMapping("/ideas")
    public ResponseEntity<List<IdeaResponseDto>> getAllIdeas() {
        return ResponseEntity.ok(ideaService.getAllIdeas());
    }

    @Transactional
    @PostMapping("/ideas")
    public ResponseEntity<Idea> createIdea(@RequestBody IdeaRequestDto ideaRequestDto) {
        return new ResponseEntity<>(ideaService.createIdea(ideaRequestDto), HttpStatus.CREATED);
    }
}
