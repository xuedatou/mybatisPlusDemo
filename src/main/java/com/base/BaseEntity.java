/**
 * Copyright (C), 2015-2019
 * FileName: BaseEntity
 * Author:   xue
 * Date:     2019/6/13 22:29
 */
package com.base;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * @author xue
 * @create 2019/6/13
 * @since 1.0.0
 */
@Data
public class BaseEntity {
    @TableField(value = "createUser")
    private String createUser;
    @TableField(value = "createTime")
    private String createTime;
    @TableField(value = "updateUser")
    private String updateUser;
    @TableField(value = "updateTime")
    private String updateTime;
}
