public class ProgressBar {

    int currentProgress = 0;
    int workAmount;
    int length =20;
    double progressPercent =0;

    public ProgressBar(int workAmount){
        this.workAmount=workAmount;
    }

    public void step(){
        currentProgress++;
        progressPercent = ((double)currentProgress/workAmount);
        int amount = (int)(length*progressPercent);
        printOntoConsole(amount);
    }

    private void printOntoConsole(int amount){
        String bob = "#".repeat(Math.max(0, amount)) +
                ".".repeat(Math.max(0, length - amount));
        System.out.print('['+ bob +"] Current Progress is :"+progressPercent*100+"%\r");
    }

}
