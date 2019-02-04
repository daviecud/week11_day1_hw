public class Printer {

    private int paper;
    private int numberOfPages;
    private int numberOfCopies;

    public Printer(int paper, int numberOfPages, int numberOfCopies) {
        this.paper = paper;
        this.numberOfPages = numberOfPages;
        this.numberOfCopies = numberOfCopies;
    }

    public int getPaperQuantity(){
        return paper;
    }

    public int getNumberOfPages(){
        return numberOfPages;
    }

    public int getNumberOfCopies(){
        return numberOfCopies;
    }

    public int print(){
        return getNumberOfPages() * getNumberOfCopies();

    }

    public boolean okayToPrint(){
        int quantity = getPaperQuantity();
            if(quantity < 5){
                return true;
            }
            return false;
    }

    public int printing(){
        if(okayToPrint())
            return print();
    }
//
//    public boolean needRefill(){
//        int paper = getPaperQuantity();
//            if(paper == 0){
//                return true;
//            }
//            return false;
//    }
//
//    public int refill(){
//        if(needRefill());
//        return getPaperQuantity() + 50;
//    }


}
