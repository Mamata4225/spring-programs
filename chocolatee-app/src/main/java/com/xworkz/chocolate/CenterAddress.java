package com.xworkz.chocolate;

public class CenterAddress {
	    private int buildingNo;
	    private int wardNo;
		private int pinCode;	
		private String area;
		
		public CenterAddress(int buildingNo, int wardNo, int pinCode, String area) {
			super();
			this.buildingNo = buildingNo;
			this.wardNo = wardNo;
			this.pinCode = pinCode;
			this.area = area;
			System.out.println(this.getClass().getSimpleName()+" object created");

		}

		@Override
		public String toString() {
			return "CenterAddress [buildingNo=" + buildingNo + ", wardNo=" + wardNo + ", pinCode=" + pinCode + ", area="
					+ area + "]";
		}
		
		
		
}
