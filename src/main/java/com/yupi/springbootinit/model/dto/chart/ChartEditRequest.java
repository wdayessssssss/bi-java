package com.yupi.springbootinit.model.dto.chart;


import lombok.Data;

import java.io.Serializable;

/**
 * 编辑请求
 
 */
@Data
public class ChartEditRequest implements Serializable {

    /**
     * 图表名称
     */
    private String chartName;

    /**
     * id
     */
    private Long id;

    /**
     * 分析目标
     */
    private String goal;

    /**
     * 图表信息
     */
    private String chartData;

    /**
     * 图表类型
     */
    private String chartType;


    private static final long serialVersionUID = 1L;
}