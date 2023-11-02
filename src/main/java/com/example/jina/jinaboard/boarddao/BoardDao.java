package com.example.jina.jinaboard.boarddao;

import com.example.jina.jinaboard.boardservice.BoardServiceMapper;
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
}
