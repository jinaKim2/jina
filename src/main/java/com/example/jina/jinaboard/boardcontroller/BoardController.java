package com.example.jina.jinaboard.boardcontroller;

import com.example.jina.jinaboard.boardservice.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
    public ModelAndView name(){
        ModelAndView modelAndView = new ModelAndView();

        return modelAndView;
    }
}
