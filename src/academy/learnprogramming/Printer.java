package academy.learnprogramming;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        this.duplex=duplex;
        this.pagesPrinted=0;
        if((tonerLevel>-1)&& (tonerLevel<=100)){
            this.tonerLevel= tonerLevel;
        }else{
            this.tonerLevel=-1;
        }
    }
    public int addToner(int tonerAmount){
        if((tonerAmount>0)&&(tonerAmount<=100)){
            if((this.tonerLevel+tonerAmount)>100){
                return -1;
            }else{
                this.tonerLevel+=tonerAmount;
                return this.tonerLevel;
            }
        }else{
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint=pages;
        if(this.duplex==true){
           pagesToPrint=pages/2+pages%2;
           this.pagesPrinted+=pagesToPrint;
        }else{
            this.pagesPrinted+=pagesToPrint;
        }
        return pagesToPrint;
    }
    public int getPagesPrinted(){
        return pagesPrinted;
    }

}
