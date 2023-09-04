package com.sky.service;

import com.sky.vo.TurnoverReportVO;

import java.time.LocalDate;

/**
 * @author makise
 * @version 1.0
 */
public interface ReportService {

    /**
     * 根据时间区间统计营业额
     * @param begin
     * @param end
     * @return
     */
    TurnoverReportVO getTurnover(LocalDate begin, LocalDate end);
}
