package Redbusproject;

public class RedBusDateSet extends Base {
	
	public static void datepicker(String month,String date) {
		
		for(int i=0;i<12;i++) {
			  String text = page.locator("xpath=(//*[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]").textContent();
			 
			  
			  if(text.contains(month)) {
				  page.locator("xpath=//*[@class='DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj']/span[text()='"+date+"']").click();
				  break;
			  }
			  else {
				  page.locator("xpath=(//*[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]").click();
			  }
		}
	}
	
	public static void clickSearchBox() {
		
		page.locator("#search_button").click();
		
	}
	
	

}
