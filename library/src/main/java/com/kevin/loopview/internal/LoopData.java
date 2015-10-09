package com.kevin.loopview.internal;

import java.util.List;

/**
 * 版权所有：XXX有限公司</br>
 * 
 * LoopData </br>
 * 
 * @author zhou.wenkai ,Created on 2015-1-14 19:30:18</br>
 * @Description Major Function：<b>自定义控件可以自动跳动的ViewPager数据实体</b> </br>
 * 
 * 注:如果您修改了本类请填写以下内容作为记录，如非本人操作劳烦通知，谢谢！！！</br>
 * @author mender，Modified Date Modify Content:
 */
public class LoopData {
	
	/** 每个条目数据 */
	public List<ItemDatas> items;
	
	public class ItemDatas {
		/** ID */
		public String id;
		/** 图片地址 */
		public String imgUrl;
		/** 链接操作 */
		public String link;
		/** 描述信息 */
		public String descText;
		/** 类型 */
		public String type;

		public ItemDatas() {
		}

		public ItemDatas(String id, String imgUrl, String link, String descText, String type) {
			this.id = id;
			this.imgUrl = imgUrl;
			this.link = link;
			this.descText = descText;
			this.type = type;
		}
	}

}
