public class UtilizationChecks {
    public static  int finalInstances(int instances, int[] averageUtil) {
        int Limit=2 *100000000;
        for(int i=0;i<averageUtil.length;i++){
            if(averageUtil[i]<25){
                if(instances>1){
                    instances = instances / 2 + ((instances % 2 == 0) ? 0 : 1);
                    i+=11;
                }
            }else if(averageUtil[i]>60){
                int newInstance= 2* instances;
                if(instances<=Limit){
                    instances=newInstance;
                    i+=11;
                }
            }
        }
        return instances;
    }

    public static void main(String[] args) {
        System.out.println(finalInstances(200000000,new int[]{100}));
    }
}
