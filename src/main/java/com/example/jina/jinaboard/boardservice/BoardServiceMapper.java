package com.example.jina.jinaboard.boardservice;

import com.example.jina.jinaboard.persistance.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface BoardServiceMapper {
    List<HashMap> list();

    String insert(BoardVo boardVo);
}
