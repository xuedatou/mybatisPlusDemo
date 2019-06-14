package com.base.baseLine.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author base
 * @since 2019-06-13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_xue_test")
public class XueTest extends BaseEntity {

private static final long serialVersionUID=1L;

    @TableId("ID")
    private String id;

    @TableField("MYNAME")
    private String myname;

    @TableField("SEX")
    private String sex;

    @TableField("AGE")
    private String xxdAge;


}
