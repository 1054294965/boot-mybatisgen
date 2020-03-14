package com.example.dao;

import com.example.entity.TLibrarian;
import java.util.List;

public interface TLibrarianMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TLibrarian record);

    TLibrarian selectByPrimaryKey(Integer id);

    List<TLibrarian> selectAll();

    int updateByPrimaryKey(TLibrarian record);
}