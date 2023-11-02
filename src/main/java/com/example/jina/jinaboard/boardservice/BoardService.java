package com.example.jina.jinaboard.boardservice;

import com.example.jina.jinaboard.boarddao.BoardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class BoardService {

    @Autowired
    BoardDao boardDao;

    public List<HashMap> list() {
        List<HashMap> result = boardDao.list();

        return result;
    }
}
