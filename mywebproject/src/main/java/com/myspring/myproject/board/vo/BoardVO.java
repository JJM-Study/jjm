package com.myspring.myproject.board.vo;

import java.sql.Date; // java.util.Date : SQL ������ Ÿ�԰� ���� �Ұ�, java.sql.Date : SQL ������ Ÿ�԰� ���� ����.

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

// modelConfig.xml Ŭ���� aliases ���� ��� : https://dadmi97.tistory.com/79

@Component("boardVO")
public class BoardVO {
		private int level;
		private int postNO;
		private int parentNO;
		private String title;
		private String content;
		private String imageFileName;
		private String id;
		private Date writeDate;
		
		public BoardVO() {
			System.out.println("title" + title);
		}
		
		public int getLevel() {
			return level;
		}
		public void setLevel(int level) {
			this.level = level;
		}
		public int getPostNO() {
			return postNO;
		}
		public void setPostNO(int postNO) {
			this.postNO = postNO;
		}
		public int getParentNO() {
			return parentNO;
		}
		public void setParentNO(int parentNO) {
			this.parentNO = parentNO;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public String getImageFileName() {
			return imageFileName;
		}
		public void setImageFileName(String imageFileName) {
			this.imageFileName = imageFileName;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public Date getWriteDate() {
			return writeDate;
		}
		public void setWriteDate(Date writeDate) {
			this.writeDate = writeDate;
		}
	
}
