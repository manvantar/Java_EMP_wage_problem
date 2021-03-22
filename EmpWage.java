import java.util.*;
class EmpWage{

public static void main(String[] args){
	int IS_FULL_TIME=1;
	int IS_part_time=2;
	int wage_per_hour=20;
	int hours=0;
	int wage_per_day=0;
Random rand=new Random();
	int empcheck=rand.nextInt(10)%3;
System.out.println(empcheck+"\n");
	switch (empcheck){
		case 1:
		System.out.println("Employee is Full-timer");
		hours=12;
		wage_per_day=hours*wage_per_hour;
		System.out.println(" wage_per_day ="+ wage_per_day);
		break;
		case 2:
		System.out.println("Employee is Part-timer");
        	hours=8;
	        wage_per_day=hours*wage_per_hour;
	        System.out.println(" wage_per_day ="+ wage_per_day);
		break;
	
		default:
		System.out.println("Employee is Absent");

	}
}

}
