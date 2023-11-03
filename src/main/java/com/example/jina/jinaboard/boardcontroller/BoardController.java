package com.example.jina.jinaboard.boardcontroller;

import com.example.jina.jinaboard.boardservice.BoardService;
import com.example.jina.jinaboard.persistance.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("")
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping("/main.do")
    public List<HashMap> main() {
        ModelAndView modelAndView = new ModelAndView();

        List<HashMap> result = boardService.list();

        return result;
    }

    @GetMapping("/name.do")
    public String insert(@RequestBody BoardVo boardVo){

        String result = boardService.insert(boardVo);

        return result;
    }
}
