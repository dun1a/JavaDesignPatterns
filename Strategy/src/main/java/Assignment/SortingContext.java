package Assignment;

public class SortingContext implements SortingStrategy {

    private SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    @Override
    public void processSorting(int[] array) {
        sortingStrategy.processSorting(array);
    }


}
