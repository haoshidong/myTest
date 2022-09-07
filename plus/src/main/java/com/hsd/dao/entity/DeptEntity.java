package com.hsd.dao.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author Auto Generator
 * @since 2022-09-05
 */
@Getter
@Setter
@TableName("dept")
public class DeptEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    private String mobile;

    private Integer manager;
}
