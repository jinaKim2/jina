package com.example.jina.jinaboard.persistance;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BoardVo {

    public  String id;
    public  String refId;
    public  String title;
    public  String content;
    public  String visitCnt;
    public  String regId;
    public  String regDt;
    public  String delYn;
}
