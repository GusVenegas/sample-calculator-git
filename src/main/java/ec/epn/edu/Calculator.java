package ec.epn.edu;

public class Calculator {
    private int answer;

    public int addition(int a, int b){
        return a + b;
    }

    public int substraction(int a, int b){
        return a - b;
    }

    @SuppressWarnings("IntegerDivisionInFloatinPointContext")
    public double division(int a, int b){
        return a / b;
    }

    public void timeout(int time){
        try{
            Thread.sleep(time);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public int getAnswer(){
        return answer;
    }

    public void setAnswer(int answer){
        this.answer = answer;
    }


}
