import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
   public Employee[] insertSort(Employee[] employeeArr){
        Employee e,temp=null;
        int j=0;
        for(int i=1;i<employeeArr.length;i++){
            e=employeeArr[i];
            j=i+1;
            while(j>=i && employeeArr[j].employeeNumber<e.employeeNumber){
                temp=employeeArr[j];
                employeeArr[j]=employeeArr[j+1];
                employeeArr[j+1]=temp;
                j--;

            }
        }
        return employeeArr;
    }
}
class InsertionSortArray{
    public void sortInsert(List<Integer>numList){
        int i,j,key,temp;
        for (i=1;i<numList.size();i++){
            key=numList.get(i);
            j=i-1;
            while(j>=0 && numList.get(j)>key){
                temp=numList.get(j);
                numList.set(j,numList.get(j+1));
                numList.set(j+1,temp);
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int []arr={5,8,1,3,9,6};
        List<Integer> numList=new ArrayList<>();
        numList.add(5);
        numList.add(8);
        numList.add(1);
        numList.add(3);
        numList.add(9);
        numList.add(6);
        new InsertionSortArray().sortInsert(numList);
        for(int i :numList){
            System.out.println(i+" ");
        }
    }

}
class Employee{
    int employeeNumber;
    String firstName;
    String lastName;
    String emailId;

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
