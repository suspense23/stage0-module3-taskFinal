package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int answer=0;
        while (number>0){
            answer*=10;
            answer+=number%10;
            number/=10;
        }
        System.out.println(answer);
    }
}
