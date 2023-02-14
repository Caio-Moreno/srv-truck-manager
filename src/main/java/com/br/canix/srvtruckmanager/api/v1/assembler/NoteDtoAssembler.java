package com.br.canix.srvtruckmanager.api.v1.assembler;

import com.br.canix.srvtruckmanager.api.v1.model.NoteDTO;
import com.br.canix.srvtruckmanager.domain.model.Note;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class NoteDtoAssembler {

    @Autowired
    private ModelMapper modelMapper;

    public NoteDTO toModel(Note note) {
        return modelMapper.map(note, NoteDTO.class);
    }

    public List<NoteDTO> toCollectionModel(Collection<Note> notes) {
        return notes.stream()
                .map(this::toModel)
                .collect(Collectors.toList());
    }
}
