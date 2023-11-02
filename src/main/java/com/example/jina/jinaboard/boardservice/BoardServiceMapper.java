package com.example.jina.jinaboard.boardservice;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface BoardServiceMapper {
    List<HashMap> list();
}
