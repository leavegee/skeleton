package com.bobanngame.blog.logic.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;


/**
 * <p>
 * 配置信息表，用来保存网站的所有配置信息。
 * </p>
 *
 * @author gee
 * @since 2017-05-05
 */
@TableName("blog_option")
public class Option extends Model<Option> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
	private Long id;
    /**
     * 配置KEY
     */
	@TableField("option_key")
	private String optionKey;
    /**
     * 配置内容
     */
	@TableField("option_value")
	private String optionValue;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOptionKey() {
		return optionKey;
	}

	public void setOptionKey(String optionKey) {
		this.optionKey = optionKey;
	}

	public String getOptionValue() {
		return optionValue;
	}

	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
