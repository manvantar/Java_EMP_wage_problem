import java.util.*;
class EmpWage{

public static void main(String[] args){
	int IS_FULL_TIME=1;
	int IS_part_time=2;
	int wage_per_hour=20;
	int hours=0;
	int working_days=20;
	Random rand=new Random();
	int empcheck=rand.nextInt(10)%3;
	switch (empcheck){
		case 1:
		System.out.println("Employee is Full-timer");
		hours=12;
		break;
		case 2:
		System.out.println("Employee is Part-timer");
        	hours=8;
		break;
	
		default:
		System.out.println("Employee is Absent");

	}

		int wage_per_day=hours*wage_per_hour;
                System.out.println(" wage_per_day ="+ wage_per_day);
		int wage_per_month= working_days*wage_per_day;
		System.out.println(" wage_per_month ="+ wage_per_month);
}

}
