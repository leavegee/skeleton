package com.bobanngame.blog.logic.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;


/**
 * <p>
 * 附件表，用于保存用户上传的附件内容。
 * </p>
 *
 * @author gee
 * @since 2017-05-05
 */
@TableName("blog_attachment")
public class Attachment extends Model<Attachment> {

    private static final long serialVersionUID = 1L;

    /**
     * ID主键
     */
	private Long id;
    /**
     * 标题
     */
	private String title;
    /**
     * 上传附件的用户ID
     */
	@TableField("user_id")
	private Long userId;
    /**
     * 附件所属的内容ID
     */
	@TableField("content_id")
	private Long contentId;
    /**
     * 路径
     */
	private String path;
    /**
     * mime
     */
	@TableField("mime_type")
	private String mimeType;
    /**
     * 附件的后缀
     */
	private String suffix;
    /**
     * 上传时间
     */
	private Date created;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getContentId() {
		return contentId;
	}

	public void setContentId(Long contentId) {
		this.contentId = contentId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
