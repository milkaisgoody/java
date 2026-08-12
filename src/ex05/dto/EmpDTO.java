package ex05.dto;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class EmpDTO {
    String empId;
    String empName;
    int salary;
    String empNo;

    LocalDate hireDate;
    String entDate;

    public EmpDTO(){};
    public EmpDTO(String empId2, String empName2, int salary2, String string){
    }

    @Override
    public String toString(){
        //입사일은 다 입력되어 있지만
        //퇴사일은 없는 경우가 많음
        //-> 퇴사일이 비어있으면 오늘날짜를 퇴사일로 하여 계산

        LocalDate ent;
        if(entDate == null){
            ent = LocalDate.now();
        }else{
            //문자열을 LocalDate로 반환
            ent = LocalDate.parse(entDate);
        }

        System.out.println("입사일: " + hireDate);
        System.out.println("퇴사일 : " + ent);

        //두 날짜 사이의 개월수를 계산
        long workingMonths = ChronoUnit.MONTHS.between(hireDate, ent);
        System.out.println("근무개월수 : " + workingMonths);
        return "%s(%s)님 근무개월수는 %d개월입니다.".formatted(empName, empId, workingMonths);
    }
}
