package ex05.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class EmpDTO {
    String empId;
    String empName;
    int salary;
    String empNo;

    public EmpDTO(){};
    
}
