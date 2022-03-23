package com.service.impl;

import com.dao.StockInfoDao;
import com.pojo.StockInfo;
import com.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockInfoDao stockInfoDao;

    @Override
    public List<StockInfo> queryAll(String id) {
        return stockInfoDao.getStockInfoList(id);
    }

    @Override
    public StockInfo queryById(String id) {
        return null;
    }

}
