package com.bobanngame.blog.logic.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;


/**
 * <p>
 * 内容和分类的多对多映射关系。
 * </p>
 *
 * @author gee
 * @since 2017-05-05
 */
@TableName("blog_mapping")
public class Mapping extends Model<Mapping> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
	private Long id;
    /**
     * 内容ID
     */
	@TableField("content_id")
	private Long contentId;
    /**
     * 分类ID
     */
	@TableField("taxonomy_id")
	private Long taxonomyId;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getContentId() {
		return contentId;
	}

	public void setContentId(Long contentId) {
		this.contentId = contentId;
	}

	public Long getTaxonomyId() {
		return taxonomyId;
	}

	public void setTaxonomyId(Long taxonomyId) {
		this.taxonomyId = taxonomyId;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
