public class Calculator {

    Memory memory = new Memory();

    public double gjejshumen (double nr1, double nr2) {
        double shuma = nr1 + nr2;
        memory.addToMemory(shuma);
        return shuma;
    }

    public double gjejdiferencen(double nr1, double nr2) {
        double diferenca = nr1 - nr2;
        memory.addToMemory(diferenca);
        return diferenca;

    }

    public double gjejshumezimin(double nr1, double nr2) {
        double shumezimi = nr1 * nr2;
        memory.addToMemory(shumezimi);
        return shumezimi;

    }

    public double gjejpjestimin(double nr1, double nr2) {
        if (nr2 == 0) {
            return 0.0;
        } else {
            double pjestimi = nr1 / nr2;
            memory.addToMemory(pjestimi);
            return pjestimi;
        }

    }
    public double gjejrrenjakatrore (double nr1) {
        if (nr1 < 0)
        {
            return 0.0;
        }
        else
        {
            double rrenjakatrore = Math.sqrt(nr1);
            memory.addToMemory(rrenjakatrore);
            return rrenjakatrore;
        }
    }

    public double gjejfuqia ( double baza, double eksponenti)
    {
        double fuqia1 = Math.pow(baza, eksponenti);
        memory.addToMemory(fuqia1);
        return fuqia1;
    }


    public double recallMemory (){
        return memory.recallMemory();
    }
    public void clearMemory (){
        memory.clearMemory();
    }

    public void addToMemory (double NewValue){
        memory.addToMemory(NewValue);
    }

}
