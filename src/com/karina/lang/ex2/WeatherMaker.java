package com.karina.lang.ex2;

public class WeatherMaker {
	
	private String info;
	
	public WeatherMaker(){
		this.info="서울-12-25.2-대전-2-65.2-대구-56-85.9";
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
