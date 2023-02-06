package org.zerock.api01.service;

import org.zerock.api01.dto.TodoDTO;

import javax.transaction.Transactional;

@Transactional
public interface TodoService {

    Long register(TodoDTO todoDTO);

    TodoDTO read(Long tno);

}
