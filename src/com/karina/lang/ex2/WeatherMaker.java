package com.karina.lang.ex2;

public class WeatherMaker {
	
	private String info;
	
	public WeatherMaker(){
		this.info="서울-대전-대구-부산-인천-제주";
	}
		public WeatherDTO[] init() {
			//info데이터를 파싱해서 결과물을 리턴
			String[]ar=this.info.split("-");
			
			WeatherDTO[]weathers=new WeatherDTO[6];
			for(int i=0;i<ar.length;i++) {
				//WeatherDTO w=new WeatherDTO();
				//w.setCityBane(ar[i]);
				weathers[i]=new WeatherDTO();
				weathers[i].setCityname(ar[i]);
			}
		
			return weathers;
		}
		
	
}
