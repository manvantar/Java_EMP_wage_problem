class EmpWage{

public static void main(String[] args){
	int IS_FULL_TIME=1;
	int IS_part_time=2;
	int wage_per_hour=20;
//	double empcheck=Math.floor(Math.random()*10)%2;
double empcheck=Math.floor(Math.random()*10)%3;
System.out.println(empcheck+"\n");
	if(empcheck==IS_FULL_TIME){
		System.out.println("Employee is Full-timer");
	int hours=12;
	int wage_per_day=hours*wage_per_hour;
	System.out.println(" wage_per_day ="+ wage_per_day);
	}
	else if(empcheck==IS_part_time){
	 System.out.println("Employee is Part-timer");
        int hours=8;
        int wage_per_day=hours*wage_per_hour;
        System.out.println(" wage_per_day ="+ wage_per_day);

	}	
	else{
		System.out.println("Employee is Absent");

	}
}

}
