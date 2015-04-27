package com.ve.itemcenter.common.domain.dto;

import java.io.Serializable;

/**
 * SKU属性DTO
 * 
 * @author chen.huang
 * @date 2015年1月21日
 */

public class SkuPropertyDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1635930837748435730L;

	private Long id;

	private Long skuId;

	private Long sellerId;// 卖家ID

	private String keyName;// 属性名

	private String val;// 属性名

	private Integer valType;// 属性值类型

	private Integer sort;// 排序字段，如果该字段值相同，则按照属性key来排序

	private Long bizMark;// 业务标志，例如是否包含图片等等

	private String imgUrl;// 属性图

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName == null ? null : keyName.trim();
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val == null ? null : val.trim();
	}

	public Integer getValType() {
		return valType;
	}

	public void setValType(Integer valType) {
		this.valType = valType;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Long getBizMark() {
		return bizMark;
	}

	public void setBizMark(Long bizMark) {
		this.bizMark = bizMark;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl == null ? null : imgUrl.trim();
	}

	@Override
	public String toString() {
		return "SkuPropertyDTO [id=" + id + ", skuId=" + skuId + ", sellerId=" + sellerId + ", keyName=" + keyName
				+ ", val=" + val + ", sort=" + sort + "]";
	}

}