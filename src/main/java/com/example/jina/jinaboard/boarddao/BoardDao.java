package com.example.jina.jinaboard.boarddao;

import com.example.jina.jinaboard.boardservice.BoardServiceMapper;
import com.example.jina.jinaboard.persistance.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class BoardDao {

    @Autowired
    BoardServiceMapper boardServiceMapper;

    public List<HashMap> list() {

        List<HashMap> result = boardServiceMapper.list();

        return result;
    }
    public String insert(BoardVo boardVo) {
        String result = boardServiceMapper.insert(boardVo);

        return result;
    }
}
