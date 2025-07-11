package com.tnsif.di;


	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

	@Component 
	public class Customer3 {
		private int cid;
		private String cname;
		@Autowired
		private Customer1 customer1;
		@Autowired
		private Customer2 customer2;
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		void show() {
			customer1.show();
			customer2.show();
			
			System.out.println("THis is from customer3");
		}

}
