package com.pq.dao;

import com.pq.baens.Paper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author github:xixihaha888
 * @data
 **/
@Repository
public interface PaperDao {
    int addPaper(Paper paper);

    int deletePaperById(long id);

    int updatePaper(Paper paper);

    Paper queryById(long id);

    List<Paper> queryAllPaper();
}
