package com.study.board.service;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired  //객체 생성없이 사용가능하게 만들어주는 어노테이션
    private BoardRepository boardRepository;

    public void write(Board board) {

        boardRepository.save(board);
    }
}
