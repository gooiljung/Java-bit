package kr.ac.smu.day03.exam;
/*
 * 달팽이가 100m깊이 우물에 빠졋다
 * 달팽이는 5m/hr 속도다 
 * 올라간 우물의 높이가 50m 미만의 경우에는 -1m/hr 50m 이후에는 -2m/hr 
 * 
 * 출력결과 : 1시간후 달팽이간 올라간 총높이:4m
 *         2시간후 달팽이간 올라간 총높이:8m
 *        x시간후 달팽이가 올라간 총높이:100보다 크면 멈
 */
public class ExamMain03 {
	public static void main(String[] args) {
		int snail=0;
		int hour=0;
		while(snail<100) {
			snail+=(snail<50?5-1:5-2);
			System.out.println((++hour)+"시간 후 올라간 총높이: "+snail);
		}
		/*while(snail<100) {
			snail+=5;
			hour++;
			if(snail<50) {
				snail=snail-1;
			}else
				snail=snail-2;
			System.out.println(hour+"시간 후 올라간 총높이: "+snail);
		}*/
		
		/*while((snail+=5)<100) {
		
			
			if(snail<50) {
				snail=snail-1;
			}else
				snail=snail-2;
			System.out.println((++hour)+"시간 후 올라간 총높이: "+snail);
		}
		System.out.println((++hour)+"시간 후 올라간 총높이: "+snail);
		*/
	}
}
