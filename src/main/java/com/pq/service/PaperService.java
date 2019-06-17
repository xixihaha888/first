package com.pq.service;

import com.pq.baens.Paper;

import java.util.List;

/**
 * @author github:xixihaha888
 * @data
 **/
public interface PaperService {
    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();
}


