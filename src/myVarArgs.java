public class myVarArgs {


    public static void main(String [] args){


        System.out.println(add(1, 2, 3, 4, 5));
        System.out.println(avg(1, 2.3, 4.5, 5.6, 7.8));


    }

    static int add(int... nums){

        int sum = 0;

        if(nums.length == 0){
            return 0;
        }

        for(int num : nums){
            sum += num;
        }

        return sum;
    }

    static double avg(double... arr){
        double sum = 0.0;

        for(double val: arr){
            sum += val;
        }

        return sum/arr.length;
    }
}

